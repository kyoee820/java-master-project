package javamaster.annotation.custom.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(ModelDescriptionPrints.class)
public @interface ModelDescriptionPrint {
    String model();
    String description();
}
