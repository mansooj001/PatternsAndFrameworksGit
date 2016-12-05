package Assignments.Assignment1.Scenario1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by jason on 11/29/2016.
 */
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SystemIO systemIO = new SystemIO();

        ArrayList<FileClass> extensions = new ArrayList<>();
        extensions.add(new HTML());
        extensions.add(new PlainText());
        extensions.add(new RTF());
        extensions.add(new Word97());
        extensions.add(new WordXML());

        System.out.println("Hoe wilt u het bestand noemen?");
        String bestandsnaam = scan.nextLine();

        System.out.println("Welke bestandsextensie wilt u gebruiken?\n" +
                "U kunt kiezen uit de volgende extensies:");
        for (int i = 1;i <= extensions.size(); i++) {
            System.out.println(i + ": " + extensions.get(i-1).toString());
        }
        int bestandsType = scan.nextInt();

        FileClass file = extensions.get(bestandsType - 1);
        file.setFileName(bestandsnaam);
        systemIO.writeFile(file);
    }
}
