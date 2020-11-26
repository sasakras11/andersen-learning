package learning.patterns.creators.abstract_factory;

public interface DesktopApplicationFactory {


  PhotoRender createPhotoRender();

  TextEditor createTextEditor();

  VideoMaker createVideoMaker();



}
