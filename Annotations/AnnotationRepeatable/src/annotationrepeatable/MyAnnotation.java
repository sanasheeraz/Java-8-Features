/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annotationrepeatable;

import java.lang.annotation.Repeatable;

/**
 *
 * @author Sana
 */

@Repeatable(MyAnnotations.class)
public @interface MyAnnotation {

    
}

@interface MyAnnotations{
    MyAnnotation[] value();
}
