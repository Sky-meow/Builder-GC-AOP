package Agent.AOP2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Date;

public class Agent implements InvocationHandler {

    private final Object person;

    public Agent(Object person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            System.out.println(new Date().getTime());
            System.out.println("本类为：" + this.getClass().getName());
            System.out.println("本方法为：" + Thread.currentThread().getStackTrace()[1].getMethodName());
            System.out.println("本代理方法耗时：" + (new Date().getTime()));
        } catch (Exception e) {
            System.out.println(e);
        }
        return method.invoke(person, args);
    }
}
