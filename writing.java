package file_and_exception;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class writing {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("hello.txt");
        BufferedWriter bufWriter = new BufferedWriter(writer);

        bufWriter.write("Hello \n");
        bufWriter.write("Data\n");
        bufWriter.write("Goodbye\n");
        bufWriter.close();

    }
}
