package learning.patterns.abstract_factory.mac;

import learning.patterns.abstract_factory.DesktopApplicationFactory;
import learning.patterns.abstract_factory.PhotoRender;
import learning.patterns.abstract_factory.TextEditor;
import learning.patterns.abstract_factory.VideoMaker;
import org.w3c.dom.Text;

public class MacApplicationFactory implements DesktopApplicationFactory {
    @Override
    public PhotoRender createPhotoRender() {
        return new Luminar();
    }

    @Override
    public TextEditor createTextEditor() {
        return new TextEdit();
    }

    @Override
    public VideoMaker createVideoMaker() {
        return new IMovie();
    }
}
