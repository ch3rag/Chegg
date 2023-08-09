// Student.java

public class Student {
    // Attribues
    // Student Id
    private String id;
    // Student Name
    private String name;
    // Student Semester
    private int semester;
    // Array Of Modules
    private String[] modules;
    // 2D-Array Of Marks
    private int[][] marks;

    // Parameterized Constructor
    public Student(String id, String name, int semester, String[] modules, int[][] marks) {
        // Intitalize 5 Class Attributes
        this.id = id;
        this.name = name;
        this.semester = semester;
        this.modules = modules;
        this.marks = marks;
    }

    // Displays Student Transcript
    public void showTranscript() {
        // Table Header
        System.out.println("\n====================================");
        System.out.println("======== Student Transcript ========");
        System.out.println("====================================");

        // Display Student Name, Id And Semester Information
        System.out.printf("Student Name........: %s\n", this.name);
        System.out.printf("Student ID..........: %s\n", this.id);
        System.out.printf("Student Semester....: %d\n", this.semester);
        
        // Call Helper Method To Get Average Marks In Each Module
        double[] averageMarks = getAverages();

        // Display A Table To Display Average Marks
        // Header For The Table
        System.out.println("====================================");
        System.out.printf("%-20s%-10s\n====================================\n",
            "Module Name", "Average Marks");
        
        // Display Module Name In One Column And Average Marks In Other Column
        for (int i = 0; i < modules.length; i++) {
            System.out.printf("%-20s%-9.1f\n", modules[i], averageMarks[i]);
        }

        // End of Table
        System.out.println("====================================");

        // Get A List Of Passing And Failing Modules Using Helper Methods
        String passingModules = getPassingModules();
        String failingModules = getFaillingModules();


        // If Student Has Passed Any Modules, Display Them
        if (passingModules.length() > 0) {
            System.out.printf("Passed Modules..........: %s\n", passingModules);
        }

        // If Student Has Failed Any Modules Display Them
        if (failingModules.length() > 0) {
            System.out.printf("Failed Modules..........: %s\n", failingModules);
        }

        // Display Highest And Lowest Marks Obtained Using Helper Methods
        System.out.printf("Highest Marks Awarded...: %d\n", getHighestMarks());
        System.out.printf("Lowest Marks Awarded....: %d\n", getLowestMarks());
        System.out.println("====================================\n");
    }

    // Returns A List Of Passing Modules
    // Here We Are Assuming That The Student Has Passed The Module
    // If Average Marks >= 35%
    private String getPassingModules() {
        double[] averageMarks = getAverages();
        String passingModules = "";
        for (int i = 0; i < averageMarks.length; i++) {
            if (averageMarks[i] >= 35) {
                passingModules += modules[i] + " ";
            }
        }
        return passingModules;
    }

    // Returns A List Of Failing Modules
    // Here We Are Assuming That The Student Has Failed The Module
    // If Average Marks < 35%
    private String getFaillingModules() {
        double[] averageMarks = getAverages();
        String failingModules = "";
        for (int i = 0; i < averageMarks.length; i++) {
            if (averageMarks[i] < 35) {
                failingModules += modules[i] + " ";
            }
        }
        return failingModules;
    }

    // Returns An Array Of Averages In Each Of The Module
    private double[] getAverages() {
        double[] averages = new double[modules.length];
        for (int i = 0; i < averages.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                averages[i] += marks[i][j];
            }
            averages[i] /= marks[i].length;
        }
        return averages;
    }

    // Returns Highest Marks Obtain Accross All Assignments
    private int getHighestMarks() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                if (marks[i][j] > max) {
                    max = marks[i][j];
                }
            }
        }
        return max;
    }

    // Returns Lowest Marks Obtain Accross All Assignments
    private int getLowestMarks() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                if (marks[i][j] < min) {
                    min = marks[i][j];
                }
            }
        }
        return min;
    }

    // Getters And Setters
    // Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Semester
    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    // Modules
    public String[] getModules() {
        return modules;
    }

    public void setModules(String[] modules) {
        this.modules = modules;
    }

    // Marks
    public int[][] getMarks() {
        return marks;
    }

    public void setMarks(int[][] marks) {
        this.marks = marks;
    }
}
