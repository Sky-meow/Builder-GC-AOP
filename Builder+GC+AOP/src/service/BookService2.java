package service;

import org.springframework.beans.factory.annotation.Value;

public class BookService2 implements Service{
    @Value("#{1+1}")
    public String name;
    public void show(){
        System.out.println("I am BookService2");
    }

    @Override
    public String toString() {
        return "BookService2{" +
                "name='" + name + '\'' +
                '}';
    }
}
