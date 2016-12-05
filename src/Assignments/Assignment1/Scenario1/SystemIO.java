package Assignments.Assignment1.Scenario1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

/**
 * Created by jason on 11/29/2016.
 */
public class SystemIO {
    static BufferedWriter bufferedWriter = null;
    static FileWriter fileWriter = null;

    public void writeFile(File file) {
        try {

            String content = "This is the content to write into file\n";
            bufferedWriter = new BufferedWriter(new FileWriter(String.valueOf(Paths.get(file.getFileName() + "." + file.getExtensionName()))));
            bufferedWriter.write(content);

            System.out.println("Done");

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (bufferedWriter != null)
                    bufferedWriter.close();

                if (fileWriter != null)
                    fileWriter.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }
        }
    }
}