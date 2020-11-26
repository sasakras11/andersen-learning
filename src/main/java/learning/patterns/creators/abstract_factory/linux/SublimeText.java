package learning.patterns.creators.abstract_factory.linux;

import learning.patterns.creators.abstract_factory.TextEditor;

public class SublimeText implements TextEditor {
    @Override
    public void writeText() {
        System.out.println("sublime processing text");
    }
}
