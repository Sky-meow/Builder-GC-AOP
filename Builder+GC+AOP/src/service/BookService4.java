package service;

import org.springframework.stereotype.Controller;

@Controller
public class BookService4 implements Service {
    public void show(){
        System.out.println("I am BookService4");
    }
}
