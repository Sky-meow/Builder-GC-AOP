package Agent.AOP2;

import java.lang.reflect.Proxy;

public class TestAgent {
    public static void main(String[] args) throws Exception {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Vacation vacation = (Vacation) Proxy.newProxyInstance(
                classLoader, Ming.class.getInterfaces(),
                new Agent(new Ming())
        );
        vacation.toDo();
    }
}
