package learning.patterns.abstract_factory.linux;

import learning.patterns.abstract_factory.DesktopApplicationFactory;
import learning.patterns.abstract_factory.PhotoRender;
import learning.patterns.abstract_factory.TextEditor;
import learning.patterns.abstract_factory.VideoMaker;

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
