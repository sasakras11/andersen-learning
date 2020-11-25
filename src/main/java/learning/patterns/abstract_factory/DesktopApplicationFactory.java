package learning.patterns.abstract_factory;

public interface DesktopApplicationFactory {


  PhotoRender createPhotoRender();

  TextEditor createTextEditor();

  VideoMaker createVideoMaker();



}
