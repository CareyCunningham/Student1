package student1;

/**
 *
 * @author cunni
 */
public class StudentList {
    public static void main(String[] args){
        Student1 s1 = new Student1("s1","Ronak");
        Student1[] studentList = new Student1[3];
        studentList[0] = new Student1("s1","Ronak");
        studentList[1] = new Student1("s2","Cunningham");
        studentList[2] = new Student1("s3","Silva");
        
        for (int i = 0; i < studentList.length; i++){
            System.out.println(studentList[i].getStudentName());
        }
        
           
    }
}
