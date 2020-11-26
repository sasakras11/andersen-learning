package learning.patterns.creators.abstract_factory.mac;

import learning.patterns.creators.abstract_factory.DesktopApplicationFactory;
import learning.patterns.creators.abstract_factory.PhotoRender;
import learning.patterns.creators.abstract_factory.TextEditor;
import learning.patterns.creators.abstract_factory.VideoMaker;

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
