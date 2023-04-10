import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            Spreadsheet spreadsheet = SpreadsheetReader.readSpreadsheetFromFile("something.txt");
            PrintSpreadsheet.displaySpreadsheet(spreadsheet);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}