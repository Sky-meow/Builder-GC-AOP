package Agent.AOPCG;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGAgent implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println(1);
        methodProxy.invokeSuper(o,objects);
        System.out.println(2);
        return "";
    }
}
