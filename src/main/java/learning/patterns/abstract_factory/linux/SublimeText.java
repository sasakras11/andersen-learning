package learning.patterns.abstract_factory.linux;

import learning.patterns.abstract_factory.TextEditor;

public class SublimeText implements TextEditor {
    @Override
    public void writeText() {
        System.out.println("sublime processing text");
    }
}
