package learning.patterns.creators.abstract_factory.linux;

import learning.patterns.creators.abstract_factory.DesktopApplicationFactory;
import learning.patterns.creators.abstract_factory.PhotoRender;
import learning.patterns.creators.abstract_factory.TextEditor;
import learning.patterns.creators.abstract_factory.VideoMaker;

public class LinuxAppFactory implements DesktopApplicationFactory {
    @Override
    public PhotoRender createPhotoRender() {
        return new GIMP();
    }

    @Override
    public TextEditor createTextEditor() {
        return new SublimeText();
    }

    @Override
    public VideoMaker createVideoMaker() {
        return new FlowBlade();
    }
}
