package learning.patterns.creators.abstract_factory.windows;

import learning.patterns.creators.abstract_factory.DesktopApplicationFactory;
import learning.patterns.creators.abstract_factory.PhotoRender;
import learning.patterns.creators.abstract_factory.TextEditor;
import learning.patterns.creators.abstract_factory.VideoMaker;

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
