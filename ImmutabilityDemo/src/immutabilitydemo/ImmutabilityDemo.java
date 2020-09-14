/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package immutabilitydemo;

/**
 *
 * @author Dell
 */
public class ImmutabilityDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str="Immutable String";
        System.out.println("Initial String : "+str);
        str=str.concat("New String");
        //str.concat("New ");
        System.out.println("After Change : "+str);
        
    }
}
