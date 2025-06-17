class Teacher {
    // Attributes
    public int teacher_Id;// a variable for the teacher id
    public String teacher_Name;// a variable for the teacher name 
    public String address;// a variable for the address
    public String working_Type;// a variable for the workingtype
    public String employment_Status;// a variable for the employment status
    public int workingHours;// a variable for the working hours

    // Constructor 
    public Teacher(int teacher_Id, String teacher_Name, String address, String working_Type, String employment_Status) {
        this.teacher_Id = teacher_Id;
        this.teacher_Name = teacher_Name;
        this.address = address;
        this.working_Type = working_Type;
        this.employment_Status = employment_Status;
    }

    // Accessor methods
    public int getTeacherId() { //This is getter method which returns value of TeacherId as int data type.
        return teacher_Id;
    }

    public String getTeacherName() { //This is getter method which returns value of TeacherName as String data type.
        return teacher_Name;
    }

    public String getAddress() { //This is getter method which returns value of address as String data type.
        return address;
    }

    public String getWorkingType() { //This is getter method which returns value of working type as String data type.
        return working_Type;
    }

    public String getEmploymentStatus() { //This is getter method which returns value of employment status as String data type.
        return employment_Status;
    }

    public int getWorkingHours() {  //This is getter method which returns value of working hours as int data type.
        return workingHours;
    }

    // Mutator method for working hours
    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    /*
     * This is display method which displays the values of the instance variable, display suitable message if teachername is empty.
     */
    public void displayDetails() {
        System.out.println("Teacher_ID: " + teacher_Id);
        System.out.println("Teacher_Name: " + teacher_Name);
        System.out.println("Address: " + address);
        System.out.println("Working_Type: " + working_Type);
        System.out.println("Employment_Status: " + employment_Status);

        if (workingHours > 0) {
            System.out.println("Working_Hours: " + workingHours);
        } else {
            System.out.println("Working_Hours: Not assigned");
        }
    }  
}