package object_oriented_programming;

public class ITECCourseManager {
    public static void main(String[] args) {// we can use our object of ITECCourses
        ITECCourses maintenanceCourse = new ITECCourses("Micro computer system maintenance ", 1310, 20); // we can create an information for each itec courses
        // now since the constructor has three parameter, we can put this three variable in the argument and make our code more concise
        //maintenanceCourse.name = "Micro computer system maintenance ";
        //maintenanceCourse.code = 1310;
        //maintenanceCourse.maxStudents = 20;

        // now we can add the number of students that enrolled to this course
        // we can call the add student method from the itec courses class
        maintenanceCourse.addStudents("Anna");
        maintenanceCourse.addStudents("Ben");
        maintenanceCourse.addStudents("ashley");

        // let's remove some students from the list
        maintenanceCourse.removeStudent("Ben");
        maintenanceCourse.removeStudent("Ephrem");


        // we can all the info about the course by calling the writeCourseInfo method
        maintenanceCourse.writeCourseInfo();

        // we can do the same thing for another itec course

        ITECCourses dataComCourse = new ITECCourses("Data Communication", 1425, 30);
        //dataComCourse.name ="Data Communication";
        //dataComCourse.code = 1425;
        //dataComCourse.maxStudents = 30;

        dataComCourse.addStudents("Ahmed");
        dataComCourse.addStudents("Saron");
        dataComCourse.addStudents("Ephrem");

        dataComCourse.writeCourseInfo();

        ITECCourses SoftwareDevelopmentProject = new ITECCourses("Software development project", 2903, 24);

        // adding the name of the students in this course

        SoftwareDevelopmentProject.addStudents("Gus");
        SoftwareDevelopmentProject.addStudents("Hurry");
        SoftwareDevelopmentProject.addStudents("Izzy");

        // printing the course info
        SoftwareDevelopmentProject.writeCourseInfo();

        // let's print the total number of students enrolled
        int totalEnrolled = SoftwareDevelopmentProject.getNumberOfStudents();
        System.out.println("the total number of students enrolled for this course is " + totalEnrolled + " students");




    }
}
