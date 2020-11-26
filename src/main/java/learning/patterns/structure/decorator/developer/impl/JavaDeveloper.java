package learning.patterns.structure.decorator.developer.impl;

import learning.patterns.structure.decorator.developer.Developer;

public class JavaDeveloper implements Developer {

    @Override
    public String doTask() {
      return "writing java code";
    }
}
