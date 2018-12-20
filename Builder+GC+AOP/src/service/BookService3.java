package service;

import org.springframework.stereotype.Controller;

@Controller
public class BookService3 implements Service {
    public String name;
    public void show(){
        System.out.println("I am BookService3");
    }
}
