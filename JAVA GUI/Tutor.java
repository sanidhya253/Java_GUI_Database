public class Tutor extends Teacher {
    // Additional attributes
    public double salary;  
    public String specialization;
    public String academic_Qualifications; 
    public int performance_Index; 
    public boolean is_Certified;  

    // Constructor
      /*
 * Constructor that takes three int parameters(i.e teacher id, working hours and performance index), six String parameter(i.e teacher name, address, working type, employmentStatus,specialization, academicQualifications  ),
 * and one double parameter(i.e salary). It also call parent class. It also  initilize the value of variale.
 * 
 */ 
    public Tutor(int teacher_Id, String teacher_Name, String address, String working_Type, String employment_Status,
                     int workingHours, double salary, String specialization, String academicQualifications,
                     int performanceIndex) {
        super(teacher_Id, teacher_Name, address, working_Type, employment_Status);
        super.setWorkingHours(workingHours);
        this.salary = salary;
        this.specialization = specialization;
        this.academic_Qualifications = academicQualifications;
        this.performance_Index = performanceIndex;
        this.is_Certified = false;
    }

    // Accessor methods
    public double getSalary() { // This is getter method which returns value salary as a double data type 
        return salary;
    }

    public String getSpecialization() {  // This is getter method which returns value Specialization as a string data type
        return specialization;
    }

    public String getAcademicQualifications() { // This is getter method which returns value AcademicQualifications as a string data type
        return academic_Qualifications;
    }

    public int getPerformanceIndex() { // This is getter method which returns value PerformanceIndex as a int data type
        return performance_Index;
    }

    public boolean isCertified() {  // This is getter method which returns value certified as a bollean data type
        return is_Certified;
    }

    // Method to set salary and certification status
    public void setSalaryAndCertification(double newSalary, int newPerformanceIndex) {
        performance_Index=newPerformanceIndex;
        if (newPerformanceIndex > 5 && getWorkingHours() > 20) {
            double appraisalPercentage;
            if (newPerformanceIndex >= 5 && newPerformanceIndex <= 7) {
                appraisalPercentage = 0.05;
            } else if (newPerformanceIndex >= 8 && newPerformanceIndex <= 9) {
                appraisalPercentage = 0.1;
            } else {
                appraisalPercentage = 0.2;
            }

            salary = salary + (appraisalPercentage * salary);
            is_Certified = true;
            
        } else {
            System.out.println("Salary cannot be approved because Tutor is not certified till now.");
        }
    }

    // Method to remove tutor
    public void removeTutor() {
        if (is_Certified) {
            performance_Index = 0;
            salary=0;
            specialization="";
            academic_Qualifications= "";
            //is_Certified = false;
        }
        else{
            System.out.println("Tutor can be removed.");
        }
    }

    // Display method
    /*
   * This is display method which details according to the value of isGranted.
   */
    public void displayDetails() {
        super.displayDetails(); // Call the displayDetails method in the parent class
        if (isCertified()) { //super class display method 
            System.out.println("Salary: " + salary);
            System.out.println("Specialization: " + specialization);
            System.out.println("Academic Qualifications: " + academic_Qualifications);
            System.out.println("Performance Index: " + performance_Index);
        }
        else{
            System.out.println("Tutor is not certified.");
        }
    }
}