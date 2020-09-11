/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encodingdemo1;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 *
 * @author Dell
 */
public class EncodingDemo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnsupportedEncodingException {
        // TODO code application logic here
        
        //String msg="Ja///vafsdfwecfwnefcnwfncwedmfmcwejdfewjfowmdowejdwdmwmdwpouwojsdmcowfjfwejdpowmcdwmefopwjcmdjewdmwomdpouweqwowpdkwkwes,womdwomdomdpwjdwkmdwkdmOrScala?";
        String msg="JavaOrScala?";
        byte[] msgBytes=msg.getBytes(StandardCharsets.UTF_8);
        //String EncodedString=Base64.getEncoder().encodeToString(msg.getBytes("utf-8"));
        String EncodedString=Base64.getEncoder().encodeToString(msgBytes);
        System.out.println("Encoded Msg : "+EncodedString+" length : "+EncodedString.length());
        //System.out.println("Encoded Msg : "+Base64.getEncoder().encode(msg.getBytes()));
//        
//        byte[] DecodedBytes=Base64.getDecoder().decode(EncodedString);
//        System.out.println("Decoded Bytes : "+DecodedBytes);
//        String DecodedString=new String(DecodedBytes);
//        System.out.println("Decoded String : "+DecodedString);

        String EncodedStringUrl=Base64.getUrlEncoder().encodeToString(msg.getBytes(StandardCharsets.UTF_8));
        System.out.println("Encoded String Using Url : "+EncodedStringUrl);

        String EncodedStringMIME=Base64.getMimeEncoder().encodeToString(msg.getBytes(StandardCharsets.UTF_8));
        System.out.println("Encoded String Using Url : "+EncodedStringMIME);
        
//        // Encode 
//        String original = "It's a secret that C++ developer are better than Java"; 
//        byte[] bytes = original.getBytes(StandardCharsets.UTF_8); 
//        String base64Encoded = Base64.getEncoder().encodeToString(bytes); 
//        System.out.println("original text: " + original); 
//        System.out.println("Base64 encoded text: " + base64Encoded); 
//        // Decode 
//        byte[] asBytes = Base64.getDecoder().decode(base64Encoded); 
//        String base64Decoded = new String(asBytes, StandardCharsets.UTF_8); 
//        System.out.println("Base64 decoded text: " + base64Decoded); 
//        // Base64 encoding using URL encoder 
//        String basicEncoded = Base64.getEncoder().encodeToString( "JavaOrScala?".getBytes(StandardCharsets.UTF_8)); 
//        System.out.println("Using Basic encoding: " + basicEncoded); 
//        String urlEncoded = Base64.getUrlEncoder().encodeToString( "JavaOrScala?".getBytes(StandardCharsets.UTF_8)); 
//        System.out.println("Using URL encoding: " + urlEncoded); 
//        // Base64 encoding using MIME encoder 
//        String text = "Best Credit Card for Student is something which give maximum rebate to Student" + "when they purchase books, courses and other stationary items"; 
//        String mimeEndoded = Base64.getMimeEncoder().encodeToString( text.getBytes(StandardCharsets.UTF_8)); 
//        System.out.println("original string: " + text); 
//        System.out.println("base65 encoded using MIME encoder: "); 
//        System.out.println(mimeEndoded); 
//        // Base64 decoding 
//        byte[] decodedBytes = Base64.getMimeDecoder().decode(mimeEndoded); 
//        String mimeDecoded = new String(decodedBytes, StandardCharsets.UTF_8); 
//        System.out.println("MIME decoded String: " + mimeDecoded); 
    
    }
}
