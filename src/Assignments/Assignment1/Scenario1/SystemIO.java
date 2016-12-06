package Assignments.Assignment1.Scenario1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

/**
 * Created by jason on 11/29/2016.
 */
class SystemIO {
    private static BufferedWriter bufferedWriter = null;
    private static final FileWriter fileWriter = null;

    public void writeFile(FileClass fileClass) {
        try {

            String content = "This is the content to write into fileClass\n";
            //C:\Users\Jason\IdeaProjects\PatternsAndFrameworksGit\src\Assignments\Assignment1\Scenario1\Output
            //C:\Users\Jason\IdeaProjects\PatternsAndFrameworksGit\erihgerihgber.html
            bufferedWriter = new BufferedWriter(new FileWriter(String.valueOf(Paths.get("src\\Assignments\\Assignment1\\Scenario1\\Output\\" + fileClass.getFileName() + "." + fileClass.getExtensionName()))));
            bufferedWriter.write(content);

            System.out.println("Done");

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (bufferedWriter != null)
                    bufferedWriter.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }
        }
    }
}