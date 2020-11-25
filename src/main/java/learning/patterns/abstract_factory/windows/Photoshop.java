package learning.patterns.abstract_factory.windows;

import learning.patterns.abstract_factory.PhotoRender;

public class Photoshop implements PhotoRender {
    @Override
    public void editPhoto() {
        System.out.println("photoshop edited photo");
    }
}
