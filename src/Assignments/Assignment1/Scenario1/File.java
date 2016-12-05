package Assignments.Assignment1.Scenario1;

/**
 * Created by jason on 11/29/2016.
 */
public abstract class File {
    private String fileName;
    private String extensionName;

    public File() {
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

}
