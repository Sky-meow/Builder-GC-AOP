package test;

import entity.Current;
import factory.AppleFactory;
import factory.BananaFactory;

import java.util.Currency;

public class Test1 {
    public static void main(String[] args) {
//        System.out.println(new AppleFactory().getFruit());
//        System.out.println(new BananaFactory().getFruit());
        System.out.println(new Current.Currents().setA(1).setB(2).getCurrent());
    }
}
