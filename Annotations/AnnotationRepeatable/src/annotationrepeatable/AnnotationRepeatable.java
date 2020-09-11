/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annotationrepeatable;

import com.sun.istack.internal.NotNull;
import java.util.List;
import org.netbeans.api.annotations.common.NonNull;

/**
 *
 * @author Sana
 */
public class AnnotationRepeatable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        @NonNull String abc1=null;
        //System.out.println(abc1);
    }
    
}
@MyAnnotation
@MyAnnotation
class Abc
{ 
   
}
