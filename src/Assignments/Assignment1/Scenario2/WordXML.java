package Assignments.Assignment1.Scenario2;

/**
 * Created by jason on 11/29/2016.
 */
public class WordXML extends FileExtension {
    public WordXML(String fileName, String extensionName, Byte[] bytes) {
        super(fileName, bytes);
        setExtensionName("xml");
    }
}
