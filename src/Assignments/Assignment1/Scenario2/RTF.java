package Assignments.Assignment1.Scenario2;

/**
 * Created by jason on 11/29/2016.
 */
public class RTF extends FileExtension {

    public RTF(String fileName, String extensionName, Byte[] bytes) {
        super(fileName, bytes);
        setExtensionName("rtf");
    }
}
