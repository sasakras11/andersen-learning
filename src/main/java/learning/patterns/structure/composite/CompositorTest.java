package learning.patterns.structure.composite;

import learning.patterns.structure.composite.impl.PhpDeveloper;
import learning.patterns.structure.composite.impl.PythonDevelop;

import java.util.ArrayList;

public class CompositorTest {
    public static void main(String[] args) {
        Developer pythonDev = new PythonDevelop();
        Developer phpDev = new PhpDeveloper();

        Team team = new Team(new ArrayList<>());

        team.add(phpDev);
        team.add(pythonDev);

        team.showTeam();
    }
}
