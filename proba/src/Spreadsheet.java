import java.util.List;

public class Spreadsheet {
    private List<SpreadsheetRow> rows;

    public Spreadsheet(List<SpreadsheetRow> rows) {
        this.rows = rows;
    }

    public List<SpreadsheetRow> getRows() {
        return rows;
    }
}
