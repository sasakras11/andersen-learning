package learning.patterns.behavioral.command.example_2;

public class CommandTestRunner {
    public static void main(String[] args) {
        Database db = new Database();
        Developer dev = new Developer(
                new InsertCommand(db),
                new DeleteCommand(db),
                new UpdateCommand(db),
                new SelectCommand(db)
        );

        dev.insertRecord();
        dev.updateRecord();
        dev.selectRecord();
        dev.deleteRecord();
    }
}
