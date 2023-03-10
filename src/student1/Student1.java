package student1;

/*
 * date: 2023-01-24
 * SYST17796 - Fundamentals of Software Design and Development
 * @author Carey Cunningham
 * test comments added
 */
public class Student1 {
    protected String studentID;
    protected String studentName;
    protected String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // autogenerated Constructor - right click -> Insert Code -> Constructors -> Choose both variablses -> Generate
    public Student1(String studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    // autogenerated Getters & Setters - right click -> Insert Code -> Getter and Setter -> Choose both variablses -> Generate
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
}

