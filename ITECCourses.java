package object_oriented_programming;

import java.util.ArrayList;
import java.util.List;

public class ITECCourses {
    // add the data or instant variable
    private  String name;
    private int code;
    private List<String> students;
    private int maxStudents;
    // let's write the constructor for the class and the name of the constructor should be the same as the class name


    public ITECCourses (String corseName, int courseCode, int courseMaxStudent){
        name = corseName;
        code = courseCode;
        maxStudents = courseMaxStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }
// let's write some methods that adds the students name

    public void addStudents(String studentsName){
        if (students.size() == maxStudents){
            System.out.println("Course is full, you can't add " + studentsName);
        }else {
            students.add(studentsName);
        }


    }
    public void writeCourseInfo(){
        System.out.println("Course name: " + name);
        System.out.println("Course code: " + code);
        System.out.println("Students enrolled:");
        for (String student: students){
            System.out.println(student);
        }
        System.out.println("There are " + getNumberOfStudents() + " students enrolled");
        System.out.println("The maximum number of students that can enroll in this course is " + maxStudents);

    }
    public int getNumberOfStudents(){
        return students.size();
    }

    public void removeStudent(String studentName){
        if (students.contains(studentName)){
            students.remove(studentName);
            System.out.println(studentName + " was un-enrolled from " + name);
        }else {
            System.out.println(studentName + " was not enrolled in " + name);
        }
    }


}
