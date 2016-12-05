package Assignments.Assignment1.Scenario1;

/**
 * Created by jason on 11/29/2016.
 */
abstract class FileClass {
    private String fileName;
    private String extensionName;

    FileClass() {
    }

    String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getExtensionName() {
        return extensionName;
    }

    void setExtensionName(String extensionName) {
        this.extensionName = extensionName;
    }

}
