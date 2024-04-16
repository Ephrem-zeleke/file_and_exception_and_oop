package file_and_exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HelloReading {
    public static void main(String[] args) throws IOException {
        // create a file reader that reads the file

        FileReader reader = new FileReader("hello.txt");
        BufferedReader bufReader = new BufferedReader(reader);

        // we can read the file using the readline() method

        //System.out.println(bufReader.readLine());// it reads line by line
        //System.out.println(bufReader.readLine());
        //System.out.println(bufReader.readLine());
        //System.out.println(bufReader.readLine());
        //System.out.println(bufReader.readLine());

        // finally close the file
        // instead of writing a code for reading each line, we can use the while loop

        String line = bufReader.readLine();

        while (line != null){
            System.out.println(line);
            line = bufReader.readLine();
        }


        bufReader.close();

    }
}
