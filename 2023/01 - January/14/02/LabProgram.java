import java.sql.*;

public class LabProgram {
	// Create a connection to a sqlite in-memory database
	// Returns Connection object
	public static Connection createConnection() {
		Connection conn = null;
		// Use connection string "jdbc:sqlite::memory:"
		try {
			conn = DriverManager.getConnection("jdbc:sqlite::memory:");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	// Create Horse table
	// Parameter conn is database connection created in createConnection()
	public static void createTable(Connection conn) {
		String createTable = "CREATE TABLE horse(id INT NOT NULL, Name TEXT NULL, Breed TEXT NULL, Height DOUBLE NULL, BirthDate TEXT NULL, PRIMARY KEY ( id ));";
		try {
			Statement statement = conn.createStatement();
			statement.executeUpdate(createTable);
			// System.out.println("Table created successfully.");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// Insert row into Horse table using a parameterized query
	// Parameter conn is database connection created in createConnection()
	// Parameters id, name, breed, height, and birthDate contain values to be
	// inserted
	public static void insertHorse(Connection conn, int id, String name, String breed, double height,
			String birthDate) {
		try {
			PreparedStatement ps;
			ps = conn.prepareStatement("INSERT INTO horse VALUES (?,?,?,?,?)");
			int i = 1;
			// first column ISBN is Number So set int instead of String
			ps.setInt(i++, id);
			ps.setString(i++, name);
			ps.setString(i++, breed);
			ps.setDouble(i++, height);
			ps.setString(i++, birthDate);
			int r = ps.executeUpdate();
			// System.out.println("Number of inserts : " + r);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Select and print all rows of Horse table
	// Parameter conn is database connection created in createConnection()
	public static void selectAllHorses(Connection conn) {
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement("select * from horse");
			ResultSet rs = ps.executeQuery();
			System.out.println("All horses:");
			while (rs.next()) {
				System.out.printf("(%d, '%s', '%s', %.1f, '%s')\n",
					rs.getInt("id"), rs.getString("Name"), rs.getString("Breed"),
					rs.getDouble("Height"), rs.getString("BirthDate"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// DO NOT MODIFY main
	public static void main(String[] args) {

		// Create connection to sqlite in-memory database
		Connection conn = createConnection();

		// Create Horse table
		createTable(conn);

		// Insert row into Horse table
		insertHorse(conn, 1, "Babe", "Quarter Horse", 15.3, "2015-02-10");

		// Select and print all Horse table rows
		selectAllHorses(conn);
	}
}