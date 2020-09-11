/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annotationcustom;


//import com.sun.istack.internal.NotNull;

/**
 *
 * @author Sana
 */
public class AnnotationCustom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // @MyAnnotation(DeveloperName="Sana",Description="For Testing Purpose",Uses={"abc1","abc2"})
       
//        @NotNull String str=null; 
        Abc abc=new Abc();
        abc.name="jamal";
        System.out.println("Name : "+abc.name);
        
        MyAnnotation mA1=Abc.class.getAnnotation(MyAnnotation.class);
        System.out.println(mA1);
        
        MyAnnotation mA=DemoInherit.class.getAnnotation(MyAnnotation.class);
        System.out.println(mA);
        
    }
}
@MyAnnotation(DeveloperName="Sana",Description="For Testing Purpose",Uses={"abc1","abc2"})
class Abc{
    @MyAnnotation(DeveloperName="Areeba",Uses={"abc1","abc2"})
    String name;
}
@MyAnnotation(DeveloperName="Sadia",Uses={"abc1","abc2"},count=54)
class Xyz {
    @MyAnnotation(DeveloperName="Areeba",Uses={"abc1","abc2"})
    Xyz(){
        
    }
}
class DemoInherit extends Xyz{
    
}

