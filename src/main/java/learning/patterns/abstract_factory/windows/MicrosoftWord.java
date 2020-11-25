package learning.patterns.abstract_factory.windows;

import learning.patterns.abstract_factory.TextEditor;

public class MicrosoftWord implements TextEditor {
    @Override
    public void writeText() {
        System.out.println("Microsoft Word edited text");
    }
}
