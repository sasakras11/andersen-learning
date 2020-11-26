package learning.patterns.creators.builder;

import learning.patterns.creators.builder.impl.*;

public interface Builder<T> {

    void withKeyboard(Keyboard keyboard);
    void withMouse(Mouse mouse);
    void withProcessor(Processor processor);
    void withVideoCard(VideoCard videoCard);
    void withScreen(Screen screen);
    T getResult();
}
