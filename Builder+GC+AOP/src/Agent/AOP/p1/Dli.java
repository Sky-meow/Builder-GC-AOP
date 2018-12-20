package Agent.AOP.p1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Dli implements InvocationHandler {

    private final Object duixiang;

    public Dli(Object o){
        this.duixiang = o;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("这是代理类");
        return method.invoke(duixiang,args);
    }
}
