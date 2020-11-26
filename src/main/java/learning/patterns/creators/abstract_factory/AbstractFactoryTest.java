package learning.patterns.creators.abstract_factory;

import learning.patterns.creators.abstract_factory.linux.LinuxAppFactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        DesktopApplicationFactory factory = new LinuxAppFactory();

        PhotoRender photoRender = factory.createPhotoRender();
        TextEditor textEditor = factory.createTextEditor();
        VideoMaker videoMaker = factory.createVideoMaker();


        photoRender.editPhoto();
        textEditor.writeText();
        videoMaker.processVideo();
    }
}
