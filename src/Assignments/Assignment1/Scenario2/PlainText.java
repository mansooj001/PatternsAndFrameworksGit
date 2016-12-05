package Assignments.Assignment1.Scenario2;

/**
 * Created by jason on 11/29/2016.
 */
public class PlainText extends FileExtension {
    public PlainText(String fileName,  Byte[] bytes) {
        super(fileName, bytes);
        setExtensionName(".txt");
    }
}
