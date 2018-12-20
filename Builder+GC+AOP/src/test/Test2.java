package test;

import config.BookConfig;
import config.BookConfigB;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.BookService;
import service.BookService2;
import service.BookService3;
import service.Service;

public class Test2 {
    public static void main(String[] args) {
        One();
        Two();
        Three();
        Four();
    }
    public static void One(){
        ClassPathXmlApplicationContext a = new ClassPathXmlApplicationContext("XML/A.xml");
        System.out.println((Service) a.getBean(Service.class));
        ((Service)a.getBean(Service.class)).show();
    }
    public static void Two(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(BookConfig.class);
        System.out.println((Service) annotationConfigApplicationContext.getBean("get"));
        ((Service)annotationConfigApplicationContext.getBean("get")).show();
    }
    public static void Three(){
        ClassPathXmlApplicationContext a = new ClassPathXmlApplicationContext("XML/B.xml");
        ((Service)a.getBean(BookService3.class)).show();
    }
    public static void Four(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(BookConfigB.class);
        ((Service)annotationConfigApplicationContext.getBean("bookService4")).show();
    }

}
