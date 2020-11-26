package learning.patterns.creators.abstract_factory.mac;

import learning.patterns.creators.abstract_factory.TextEditor;

public class TextEdit implements TextEditor {
    @Override
    public void writeText() {
        System.out.println("TextEdit procssing text");
    }
}
