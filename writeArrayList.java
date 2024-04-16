package file_and_exception;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class writeArrayList {
    public static void main(String[] args) throws IOException {

        // writing line by line to the file and the string will have a format of ITEC 2545 java
        final String fileName = "ITEC_Classes.txt";
        // first let's create the lists

        List<String> classNames = List.of("Java", "Web", "C#");
        // list of the class code

        List<Integer> classCodes = List.of(2545, 2560, 2505);
        // now let's create the new file and buffered writer

        BufferedWriter bufWriter = new BufferedWriter(new FileWriter(fileName));

        // now we can loop over class name and class code
        // we can use the regular loop

        for (int i = 0; i < classNames.size(); i++){
            String name = classNames.get(i);
            int codes = classCodes.get(i);
            bufWriter.write("ITEC " + codes + " "+ name + "\n");
        }

        // close the file writer now
        bufWriter.close();

        // now we can read our file using the file reader

        // create a file and buffered reader

        BufferedReader bufReader = new BufferedReader(new FileReader(fileName));

        // let's create a new array list
        List<String> classDescription = new ArrayList<>();

        String line = bufReader.readLine();

        // we can use while loop to read the file line by line until we get the value null

        while ( line != null){
            classDescription.add(line);
            line = bufReader.readLine();
        }
        System.out.println("End of file reached");
        System.out.println(classDescription);

        bufReader.close();


    }
}
