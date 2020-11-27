package learning.patterns.structure.bridge.application;

import learning.patterns.structure.bridge.application.abstraction.Application;
import learning.patterns.structure.bridge.application.abstraction.BankApplication;
import learning.patterns.structure.bridge.application.abstraction.DomRiaApplication;
import learning.patterns.structure.bridge.application.implementation.JavaDeveloper;
import learning.patterns.structure.bridge.application.implementation.PythonDeveloper;

import java.util.ArrayList;
import java.util.List;

public class BridgeTest {
    public static void main(String[] args) {
        List<Application> apps = new ArrayList<>();

        apps.add( new BankApplication(new JavaDeveloper()));
        apps.add(new DomRiaApplication(new PythonDeveloper()));

        apps.forEach(Application::developApp);
    }
}
