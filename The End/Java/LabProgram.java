import java.sql.*;

public class LabProgram {

	// Create a connection to a sqlite in-memory database
	// Returns Connection object
	public static Connection createConnection() {

		// YOUR CODE HERE
		// Use connection string "jdbc:sqlite::memory:"
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:sqlite::memory:");
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return connection;
	}

	// Create Horse table
	// Parameter conn is database connection created in createConnection()
	public static void createTable(Connection conn) {

		// YOUR CODE HERE
		// SQL Statement For Creating Table
		String sql = "CREATE TABLE HORSE ("
				   + "  ID          INTEGER PRIMARY KEY,"
				   + "  NAME        TEXT,"
				   + "  BREED       TEXT,"
				   + "  HEIGHT      REAL,"
				   + "  BIRTHDATE   TEXT"
				   + ")";

		try {
			// Execute DDL Statement
			Statement statement = conn.createStatement();
			statement.execute(sql);
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

	}

	// Insert row into Horse table using a parameterized query
	// Parameter conn is database connection created in createConnection()
	// Parameters id, name, breed, height, and birthDate contain values to be
	// inserted
	public static void insertHorse(Connection conn, int id, String name, String breed, double height,
			String birthDate) {

		// YOUR CODE HERE
		String sql = "INSERT INTO HORSE VALUES (?, ?, ?, ?, ?)";
		try {
			PreparedStatement pSql = conn.prepareStatement(sql);
			pSql.setInt(1, id);
			pSql.setString(2, name);
			pSql.setString(3, breed);
			pSql.setDouble(4, height);
			pSql.setString(5, birthDate);
			pSql.execute();
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
	}

	// Select and print all rows of Horse table
	// Parameter conn is database connection created in createConnection()
	public static void selectAllHorses(Connection conn) {

		// YOUR CODE HERE
		String sql = "SELECT * FROM HORSE";
		try {
			Statement statement = conn.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			System.out.printf("%-5s%-15s%-15s%-10s%-10s\n", "ID", "NAME", "BREED", "HEIGHT", "BIRTH DATE");
			System.out.printf("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");

			while (resultSet.next()) {
				int id = resultSet.getInt("ID");
				String name = resultSet.getString("NAME");
				String breed = resultSet.getString("BREED");
				double height = resultSet.getDouble("HEIGHT");
				String birthDate = resultSet.getString("BIRTHDATE");
				System.out.printf("%-5s%-15s%-15s%-10s%-10s\n",
					id, name, breed, height, birthDate);
			}
			System.out.printf("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
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
		// insertHorse(conn, 2, "Rosy", "Quarter Horse", 15.8, "2015-03-12");

		// Select and print all Horse table rows
		selectAllHorses(conn);
	}
}