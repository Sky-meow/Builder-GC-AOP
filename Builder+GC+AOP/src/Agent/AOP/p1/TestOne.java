package Agent.AOP.p1;

import Agent.AOP.p2.Girl;
import Agent.AOP.p2.Sleepable;

import java.lang.reflect.Proxy;

public class TestOne {
    public static void main(String[] args) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        Exam exam = (Exam) Proxy.newProxyInstance(
                classLoader,new Class[]{Exam.class},
                new Dli(new Student())
        );
        exam.toDo();
        System.out.println("-----------------");
        Sleepable sleepable = (Sleepable) Proxy.newProxyInstance(
                classLoader, Girl.class.getInterfaces(),
                new Dli(new Girl())
        );
        sleepable.sleep();

    }
}
