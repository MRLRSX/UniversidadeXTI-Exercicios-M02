package application;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD})
@Documented
public @interface ErrosCorrigidos {
    
	String[] erros();
}
