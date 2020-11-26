package learning.patterns.creators.abstract_factory.linux;

import learning.patterns.creators.abstract_factory.VideoMaker;

public class FlowBlade implements VideoMaker {
    @Override
    public void processVideo() {
        System.out.println("FlowBlade editing video");
    }
}
