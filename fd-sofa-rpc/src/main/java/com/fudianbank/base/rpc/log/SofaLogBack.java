package com.fudianbank.base.rpc.log;

import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface SofaLogBack{
    String value() default "";
}