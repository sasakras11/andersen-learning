package learning.patterns.abstract_factory.mac;

import learning.patterns.abstract_factory.TextEditor;
import org.w3c.dom.Text;

public class TextEdit implements TextEditor {
    @Override
    public void writeText() {
        System.out.println("TextEdit procssing text");
    }
}
