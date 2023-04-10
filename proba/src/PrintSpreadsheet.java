import java.util.ArrayList;
import java.util.List;

public class PrintSpreadsheet {
    public static void displaySpreadsheet(Spreadsheet spreadsheet) {
        List<Integer> widths = new ArrayList<>();
        for (SpreadsheetRow row : spreadsheet.getRows()) {
            for (int i = 0; i < row.getCells().size(); i++) {
                String cell = row.getCells().get(i);
                int width = cell.length();
                if (i >= widths.size()) {
                    widths.add(width);
                } else if (width > widths.get(i)) {
                    widths.set(i, width);
                }
            }
        }
        for (SpreadsheetRow row : spreadsheet.getRows()) {
            for (int i = 0; i < row.getCells().size(); i++) {
                String cell = row.getCells().get(i);
                int width = widths.get(i);
                System.out.printf("%-" + width + "s\t|\t", cell);
            }
            System.out.println();
        }


    }
}
