package learning.patterns.behavioral.command.refactor_guru;

public class CopyCommand extends Command{
    CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }


}
