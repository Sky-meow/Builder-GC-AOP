package factory;

import entity.Apple;
import entity.Fruit;

public class AppleFactory implements FruitFactory{
    @Override
    public Fruit getFruit(){
        return new Apple("红色");
    }
}
