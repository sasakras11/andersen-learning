package learning.patterns.abstract_factory.linux;

import learning.patterns.abstract_factory.PhotoRender;

public class GIMP implements PhotoRender {
    @Override
    public void editPhoto() {
        System.out.println("GIMP editing photos");
    }
}
