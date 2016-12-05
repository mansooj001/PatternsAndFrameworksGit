package Assignments.Assignment1.Scenario2;

/**
 * Created by jason on 11/29/2016.
 */
public class Word97 extends FileExtension {
    public Word97(String fileName, String extensionName, Byte[] bytes) {
        super(fileName, bytes);
        setExtensionName("doc");
    }
}
