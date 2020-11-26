package learning.patterns.creators.builder.impl;

import learning.patterns.creators.builder.Builder;

public class PCBuilder implements Builder<PC> {
    private Keyboard keyboard;
    private Mouse mouse;
    private Processor processor;
    private Screen screen;
    private VideoCard videoCard;


    @Override
    public void withKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public void withMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    @Override
    public void withProcessor(Processor processor) {
        this.processor = processor;
    }

    @Override
    public void withVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    @Override
    public void withScreen(Screen screen) {
        this.screen = screen;
    }

    public PC getResult(){
        return new PC(keyboard,mouse,processor,screen,videoCard);
    }
}
