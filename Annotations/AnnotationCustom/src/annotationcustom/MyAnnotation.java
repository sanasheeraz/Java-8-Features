/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annotationcustom;

//import java.lang.annotation.ElementType;

//import java.lang.annotation.Documented;


import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


//import java.lang.annotation.Target;

/**
 *
 * @author Sana
 */

//@Target(ElementType.TYPE)
//@Target(ElementType.METHOD);
//@Target(ElementType.FIELD)
@Inherited
//@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String DeveloperName();
    String Description() default "Optional";
    int count() default 76;
    String[] Uses();
}
