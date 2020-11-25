package learning.patterns.abstract_factory.windows;

import learning.patterns.abstract_factory.DesktopApplicationFactory;
import learning.patterns.abstract_factory.PhotoRender;
import learning.patterns.abstract_factory.TextEditor;
import learning.patterns.abstract_factory.VideoMaker;

public class WindowsAppFactory implements DesktopApplicationFactory {
    @Override
    public PhotoRender createPhotoRender() {
        return new Photoshop();
    }

    @Override
    public TextEditor createTextEditor() {
        return new MicrosoftWord();
    }

    @Override
    public VideoMaker createVideoMaker() {
        return new VimeoStudio();
    }
}
