/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventlistenerdemo;

import java.util.Comparator;

/**
 *
 * @author Dell
 */
public class EventListenerDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Comparator<String> comparator=new Comparator<String>(){
//            @Override
//            public int compare(String t, String t1) {
//                    return t.compareTo(t1);
//            }
//        };
        EventListenerDemo eld=new EventListenerDemo();
        StateChangeListener scl=new StateChangeListener() {
            @Override
            public void OnStateChange(int a, int b) {
                System.out.println("State Change Call"+(a+b));
            }
        };
        scl.OnStateChange(3, 4);
        StateChangeListener stChL=(a,b)->System.out.println("State using lambda"+(a+b));
        
        stChL.OnStateChange(4, 5);
        
        Comparator<String> comparator=(String t, String t1) -> t.compareTo(t1);
        Comparator<String> comparator1=(String t, String t1) -> {System.out.println("Using Lambda");return 3;};
        
        int result=comparator.compare("Hello", "World");
        comparator1.compare("h", "h");
        System.out.println("Difference : "+result);
    }
    
}
