package learning.patterns.creators.builder.impl;

import learning.patterns.creators.builder.Builder;

public class Director {

    public void buildGamingPC(Builder builder){
        builder.withKeyboard(new Keyboard(33,"razer"));
        builder.withMouse(new Mouse(1500,140.21));
        builder.withProcessor(new Processor(4,"intel"));
        builder.withScreen(new Screen(MATRIX_TYPE.IPS,20));
        builder.withVideoCard(new VideoCard("NVIDIA",4));
    }

    public void buildProgrammingPC(Builder builder){
        builder.withKeyboard(new Keyboard(20,"acer"));
        builder.withMouse(new Mouse(1000,100.1));
        builder.withProcessor(new Processor(8,"intel"));
        builder.withScreen(new Screen(MATRIX_TYPE.IPS,20));
        builder.withVideoCard(new VideoCard("NVIDIA",4));
    }

    public void buildOfficePC(Builder builder){
        builder.withKeyboard(new Keyboard(10,"dell"));
        builder.withMouse(new Mouse(1000,100.1));
        builder.withProcessor(new Processor(8,"inc"));
        builder.withScreen(new Screen(MATRIX_TYPE.IPS,13));
        builder.withVideoCard(new VideoCard("para",1));
    }
}
