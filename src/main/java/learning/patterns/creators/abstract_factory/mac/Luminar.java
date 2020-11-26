package learning.patterns.creators.abstract_factory.mac;

import learning.patterns.creators.abstract_factory.PhotoRender;

public class Luminar implements PhotoRender {
    @Override
    public void editPhoto() {
        System.out.println("Luminar working with photo");
    }
}
