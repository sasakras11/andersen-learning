package learning.patterns.creators.abstract_factory.linux;

import learning.patterns.creators.abstract_factory.PhotoRender;

public class GIMP implements PhotoRender {
    @Override
    public void editPhoto() {
        System.out.println("GIMP editing photos");
    }
}
