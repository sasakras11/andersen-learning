package learning.patterns.creators.builder;

import learning.patterns.creators.builder.impl.Director;
import learning.patterns.creators.builder.impl.PCBuilder;

public class TestBuilder {
    public static void main(String[] args) {
        Builder builder = new PCBuilder();
        Director director = new Director();

        director.buildGamingPC(builder);
        System.out.println(builder.getResult());

        director.buildProgrammingPC(builder);
        System.out.println(builder.getResult());

        director.buildOfficePC(builder);
        System.out.println(builder.getResult());

    }
}
