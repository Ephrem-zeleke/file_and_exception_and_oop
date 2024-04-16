package file_and_exception;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class writingVariables {
    public static void main(String[] args) throws IOException {

        // working with variable
        int classCode = 2545;
        double averageEnrollment = 22.16;
        String className = "Java";

        // create a new file writer and buffered writer

        FileWriter writer = new FileWriter("Java.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        // now we can add some texts to the file

        bufferedWriter.write("the class code is " + classCode + "\n");// put new line
        bufferedWriter.write("The average enrollment is " + averageEnrollment + " students \n");
        bufferedWriter.write("The class name is " + className + "\n");

        // close the file
        bufferedWriter.close();







    }
}
