package Agent.javaAop2.aop;

import Agent.JavaAop.jdbcnew.ConnectionAdvice;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

public class AopConfig {
    public static ThreadLocal threadLocal = null;

    @Pointcut(value = "execution(* Agent.JavaAop.jdbc.*.*(..))")
    public void xxx() {
    }

    @Before("xxx()")
    public void beforeAdvide(JoinPoint joinPoint) {
        System.out.println(joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getArgs()[1]);
        System.out.println("开始前置通知");
    }

    @Around("xxx()")
    public void aroundAdvie(ProceedingJoinPoint point) throws Throwable {
    }
}
