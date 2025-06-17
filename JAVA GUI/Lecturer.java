public class Lecturer extends Teacher {
    // Additional attributes
public String department;
public int years_Of_Experience;
public int graded_Score;
public boolean has_Graded;

public Lecturer(int teacher_Id, String teacher_Name, String address, String working_Type, String employment_Status,
                    String department, int yearsOfExperience,int workingHours) {
        super(teacher_Id, teacher_Name, address, working_Type, employment_Status); //super class setter is called.
        super.setWorkingHours(workingHours);
        this.department = department;
        this.years_Of_Experience = yearsOfExperience;
        this.graded_Score = 0;
        this.has_Graded = false;
    }

    // Accessor methods
public String getDepartment() { //This is getter method returns value of department name as string data type.
        return department;
    }
public int getYearsOfExperience() {//This is getter method returns value of year of exprinces as int data type.
        return years_Of_Experience;
    }

public int getGradedScore() { //This is getter method returns value of Grade score as int data type.
        return graded_Score;
    }

public boolean hasGraded() { // This is getter method return value of grade as Boolean data type.
        return has_Graded;
    }

    // Mutator method for graded score
public void setGradedScore(int newGradedScore) {
        this.graded_Score = newGradedScore;
    }

public void gradeAssignment(int score, String studentDepartment, int studentYearsOfExperience) {
        if (!has_Graded && years_Of_Experience >= 5 && department.equals(studentDepartment) && years_Of_Experience == studentYearsOfExperience) {
            if (score >= 70) {
                System.out.println("You have scored A");
                graded_Score = score;
            } else if (score >= 60) {
                System.out.println("You have scored B");
                graded_Score = score;
            } else if (score >= 50) {
                System.out.println("You have scored C");
                graded_Score = score;
            } else if (score >= 40) {
                System.out.println("You have scored D");
                graded_Score = score;
            } else {
                graded_Score = 0;
            }

            has_Graded = true;
        } else {
            System.out.println("Assignment not graded yet or conditions not met.");
        }
    }

    // Display method
public void displayDetails() {
        super.displayDetails();//super class display method was called(i.e lecturer display method)
        System.out.println("Department: " + department);
        System.out.println("Years of Experience: " + years_Of_Experience);
        if (has_Graded == true) {
            System.out.println("Graded Score: " + graded_Score);
        } else {
            System.out.println("Graded Score: Not graded yet");
        }
    }
}