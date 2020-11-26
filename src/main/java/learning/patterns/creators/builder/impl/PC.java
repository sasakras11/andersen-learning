package learning.patterns.creators.builder.impl;

public class PC {
    private Keyboard keyboard;
    private Mouse mouse;
    private Processor processor;
    private Screen screen;
    private VideoCard videoCard;

    public PC(Keyboard keyboard, Mouse mouse, Processor processor, Screen screen, VideoCard videoCard) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.processor = processor;
        this.screen = screen;
        this.videoCard = videoCard;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    @Override
    public String toString() {
        return "PC{" +
                "keyboard=" + keyboard +
                ", mouse=" + mouse +
                ", processor=" + processor +
                ", screen=" + screen +
                ", videoCard=" + videoCard +
                '}';
    }
}
