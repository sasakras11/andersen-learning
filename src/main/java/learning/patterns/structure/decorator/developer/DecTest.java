package learning.patterns.structure.decorator.developer;

import learning.patterns.structure.decorator.developer.impl.JavaDeveloper;
import learning.patterns.structure.decorator.developer.impl.SeniorDeveloperDecorator;
import learning.patterns.structure.decorator.developer.impl.TeamLeadDecorator;

public class DecTest {
    public static void main(String[] args) {

        Developer developer =new TeamLeadDecorator(new SeniorDeveloperDecorator(new JavaDeveloper()));

        System.out.println(developer.doTask());

    }
}
