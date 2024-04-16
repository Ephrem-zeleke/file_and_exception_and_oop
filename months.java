package file_and_exception;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class months {
    public static void main(String[] args) throws IOException {
        // create a variable for the file name
        String fileName = "months.txt";
        // create the list
        List<String> months = List.of("Jan", "Feb", "Mar");

        // now let's create the file and buffered writer

        BufferedWriter bufWriter = new BufferedWriter(new FileWriter(fileName));
        // now we can use the for loop to write the months line by line

        for (String month: months){
            bufWriter.write(month + "\n");
        }
        bufWriter.close();


    }
}
