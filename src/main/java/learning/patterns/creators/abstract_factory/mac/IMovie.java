package learning.patterns.creators.abstract_factory.mac;

import learning.patterns.creators.abstract_factory.VideoMaker;

public class IMovie implements VideoMaker {
    @Override
    public void processVideo() {
        System.out.println("IMovie working with video");
    }
}
