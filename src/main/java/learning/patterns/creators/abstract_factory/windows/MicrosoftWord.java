package learning.patterns.creators.abstract_factory.windows;

import learning.patterns.creators.abstract_factory.TextEditor;

public class MicrosoftWord implements TextEditor {
    @Override
    public void writeText() {
        System.out.println("Microsoft Word edited text");
    }
}
