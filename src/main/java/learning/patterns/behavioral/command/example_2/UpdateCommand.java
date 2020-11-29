package learning.patterns.behavioral.command.example_2;

public class UpdateCommand implements Command{
    Database database;

    public UpdateCommand(Database database) {
        this.database = database;
    }


    @Override
    public void execute() {
        database.update();
    }
}
