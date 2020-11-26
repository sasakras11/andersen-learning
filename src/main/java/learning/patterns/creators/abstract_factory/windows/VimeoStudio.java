package learning.patterns.creators.abstract_factory.windows;

import learning.patterns.creators.abstract_factory.VideoMaker;

public class VimeoStudio implements VideoMaker {
    @Override
    public void processVideo() {
        System.out.println("processing video with VimeoStudio");
    }
}
