package learning.patterns.behavioral.command.example_2;

public class SelectCommand implements Command{
    private Database database;

    public SelectCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.update();
    }
}
