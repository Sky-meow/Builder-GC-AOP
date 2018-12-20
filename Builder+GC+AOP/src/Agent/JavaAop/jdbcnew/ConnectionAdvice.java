package Agent.JavaAop.jdbcnew;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class ConnectionAdvice {
    public static ThreadLocal threadLocal = null;

    @Pointcut(value = "execution(* Agent.JavaAop.jdbc.*.*(..))")
    public void xxx() {
    }

    @Before("xxx()")
    public void beforeAdvide(JoinPoint joinPoint) {
//        System.out.println(name);
//        System.out.println(id);
        System.out.println(joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getArgs()[1]);
        System.out.println("开始前置通知");
    }

    @AfterReturning(pointcut = "xxx()", returning = "result")
    public void afterAdvie(String result) {
//        System.out.println(result);
//        System.out.println("开始返回通知");
    }

    @Around("xxx()")
    public Object aroundAdvie(ProceedingJoinPoint point) throws Throwable {
        System.out.println("触发了环绕通知！");

        threadLocal = new ThreadLocal();
        ConnectionAdvice.threadLocal.set("cctv");

        point.getArgs()[0] = get();
        point.getArgs()[1] = (Object) 0;
        Object object = point.proceed(point.getArgs());
        System.out.println("环绕通知结束");
        return object;
    }

    public String get() {
        return "T";
    }
}
