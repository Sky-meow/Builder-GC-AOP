package factory;

import entity.Apple;
import entity.Banana;
import entity.Fruit;

public class BananaFactory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Banana("黄色");
    }
}
