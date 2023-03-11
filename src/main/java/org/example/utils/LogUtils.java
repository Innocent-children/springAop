package org.example.utils;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 日志根据类，业务逻辑中的横切逻辑(通知，增强，)
 */
public class LogUtils {

    //方法之前输出日志
    public void beforePrintLog() {
        System.out.println("在方法之前执行");
    }

    //方法之后输出日志
    public void afterReturnPrintLog() {
        System.out.println("在方法之后执行，有异常就不执行");
    }

    //方法抛出异常执行
    public void afterThrowingPrintLog() {
        System.out.println("在方法抛出异常之后执行");
    }

    //方法的最后执行，不论有没有异常
    public void afterPrintLog() {
        System.out.println("在方法最后执行，不管有没有异常都执行");
    }

    //配置环绕通知，相当于自定义通知增强
    public Object aroundPrintLog(ProceedingJoinPoint joinPoint) {
        Object obj = null;
        try {
            System.out.println("环绕通知,在方法之前执行");
            obj = joinPoint.proceed();//调用方法，这相当于调用被代理类的被增强的方法。有点类似，method.invoked()

            System.out.println("环绕通知,在方法之后执行，有异常就不执行");
        } catch (Throwable throwable) {
            throwable.printStackTrace();

            System.out.println("环绕通知,在方法抛出异常之后执行");
        } finally {
            System.out.println("环绕通知,在方法最后执行，不管有没有异常都执行");
        }
        return obj;
    }
}
