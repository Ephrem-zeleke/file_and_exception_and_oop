package file_and_exception;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class overwritingFiles {
    public static void main(String[] args) throws IOException {
        // create and open a hello txt for writing
        FileWriter writer = new FileWriter("Hello.txt");
        // wrap up with buffered writer
        BufferedWriter bufWriter = new BufferedWriter(writer);

        // let's write some strings in the hello txt file

        bufWriter.write("Hello\n");
        bufWriter.write("Data here\n");
        bufWriter.write("Goodbye\n");

        // let's close the buffer writer and the buffer writer will also wrap up and close the file writer
        bufWriter.close();

        // if you want to access the hello text again, you need to create a file writer and buffered writer again
        // let's open the hello text again
        writer = new FileWriter("Hello.txt");
        bufWriter = new BufferedWriter(writer);

        // now we can add some string data to the hello txt file
        bufWriter.write("This data\n");
        bufWriter.write("Overwrite the first set of data\n");
        // now we can close the buffered writer and the buffer writer will wrap up and close the file write
        bufWriter.close();

        // appending data to the existing file
        // create the file writer and buffered write again

        writer = new FileWriter("Hello.txt", true);
        bufWriter = new BufferedWriter(writer);

        // we can append some strings at the end of the file

        bufWriter.write("This data\n");
        bufWriter.write("is append to the end of the first data set ");
        // close the buffer writer
        bufWriter.close();





    }
}
