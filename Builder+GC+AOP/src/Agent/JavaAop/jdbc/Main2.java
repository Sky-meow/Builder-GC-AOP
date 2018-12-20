package Agent.JavaAop.jdbc;

import Agent.JavaAop.jdbcnew.ConnectionAdvice;
import Agent.JavaAop.jdbcnew.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext jdbcUser = new ClassPathXmlApplicationContext("mapper/aop.xml");
//        SaveBook saveBook = jdbcUser.getBean(SaveBook.class);
//        saveBook.save();


        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        SaveBook saveBook = context.getBean(SaveBook.class);
        saveBook.save("old",2);

    }
}
