package br.com.merlo.anotacoes;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE, ElementType.CONSTRUCTOR})
public @interface PrimeiraAnotacao {
    String value();

    String[] bairros();

    long numeroCasa();

    double valore() default 10d;
}
