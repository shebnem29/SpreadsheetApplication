import java.util.List;

public class SpreadsheetRow {
    private List<String> cells;

    public SpreadsheetRow(List<String> cells) {
        this.cells = cells;
    }

    public List<String> getCells() {
        return cells;
    }
}
