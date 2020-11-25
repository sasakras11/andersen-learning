package learning.patterns.abstract_factory.mac;

import learning.patterns.abstract_factory.PhotoRender;

public class Luminar implements PhotoRender {
    @Override
    public void editPhoto() {
        System.out.println("Luminar working with photo");
    }
}
