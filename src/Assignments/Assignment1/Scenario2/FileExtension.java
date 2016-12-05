package Assignments.Assignment1.Scenario2;

/**
 * Created by jason on 11/29/2016.
 */
public abstract class FileExtension {
    private String fileName;
    private String extensionName;
    private Byte[] bytes;

    public FileExtension(String fileName, Byte[] bytes) {
        this.fileName = fileName;
        this.bytes = bytes;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getExtensionName() {
        return extensionName;
    }

    public void setExtensionName(String extensionName) {
        this.extensionName = extensionName;
    }

    public Byte[] getBytes() {
        return bytes;
    }

    public void setBytes(Byte[] bytes) {
        this.bytes = bytes;
    }
}
