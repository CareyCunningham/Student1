/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student1;

/**
 *
 * @author cunni
 */
public class PartTimeStudent extends Student1{
    private int numberOfCourses;

    public PartTimeStudent(int numberOfCourses, String studentID, String studentName) {
        super(studentID, studentName);
        this.numberOfCourses = numberOfCourses;
    }

    public int getNumberOfCourses() {
        return numberOfCourses;
    }

    public void setNumberOfCourses(int numberOfCourses) {
        this.numberOfCourses = numberOfCourses;
    }
    
}
