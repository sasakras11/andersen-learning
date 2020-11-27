package learning.patterns.structure.facade;

import learning.patterns.structure.facade.CookAble;
import learning.patterns.structure.facade.impl.Dish;

public interface Shief  {

    Dish makeDish(String name);

}
