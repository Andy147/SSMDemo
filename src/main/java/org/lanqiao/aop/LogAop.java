package org.lanqiao.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by andy on 2017/9/6.
 */
public class LogAop {
    Logger logger = Logger.getLogger(LogAop.class);
    //记录日志内容
    String strLog = null;
    //前置同知
    public void somethingBefore(JoinPoint joinPoint){
        System.out.println("进入前置通知");
        strLog = "leg Begining method" +
                joinPoint.getTarget().getClass().getName() + "." +
                joinPoint.getSignature().getName();
        logger.info(strLog);


    }
    //后置通知
    public void somethingAfter(JoinPoint joinPoint){
        System.out.println("进入后置通知！");
        strLog = "leg Beginning method" + joinPoint.getTarget().getClass().getName() + "." + joinPoint.getSignature().getName();
        logger.info(strLog);

    }
    //环绕通知
    public Object somethingAround(ProceedingJoinPoint pjp ) throws Throwable {
        //获取当前系统时间
        long time = System.currentTimeMillis();
        Object retval = pjp.proceed();
        time = System.currentTimeMillis() - time;
        logger.info("process time:" + time + "ms");
        return retval;

    }
}
