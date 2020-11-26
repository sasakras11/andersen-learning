package learning.patterns.creators.abstract_factory.windows;

import learning.patterns.creators.abstract_factory.PhotoRender;

public class Photoshop implements PhotoRender {
    @Override
    public void editPhoto() {
        System.out.println("photoshop edited photo");
    }
}
