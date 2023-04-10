import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SpreadsheetReader {
    public static Spreadsheet readSpreadsheetFromFile(String fileName) throws IOException {
        List<SpreadsheetRow> rows = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] values = line.split(",");
            List<String> cells = new ArrayList<>();
            for (String value : values) {
                cells.add(value.trim());

            }
            SpreadsheetRow row = new SpreadsheetRow(cells);
            rows.add(row);
        }
        reader.close();
        return new Spreadsheet(rows);
    }
}
