package com.fudianbank.base.rpc.log;

import java.lang.annotation.*;

@Documented
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface LogAnnotation{
    /***
     * 摘要类型：查询类、操作类调用
     * @return
     */
    String digest() default "";
    /***
     * 是否持久化，如果为true，将日志发送到MQ，由日志消费者将日志存库
     */
    boolean persistence() default false;
}