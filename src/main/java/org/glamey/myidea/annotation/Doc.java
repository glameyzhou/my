package org.glamey.myidea.annotation;

import java.lang.annotation.*;

/**
 * @author by zhouyang.zhou.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Doc {
    /**
     * 文档名称
     * 如果不写的话，默认为类名称
     *
     * @return
     */
    String name() default "";
}
