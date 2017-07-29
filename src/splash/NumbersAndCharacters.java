/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splash;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author shagilsid
 */
public class NumbersAndCharacters {
    public int getNumericMac(String mac){
        String str=mac;
       Pattern p = Pattern.compile("([0-9])");
       StringBuilder sb=new StringBuilder();
      
        Matcher m = p.matcher(str);
        while(m.find())
        {
            sb.append(m.group(1));

        }
        String numericMac=sb.toString();
  //       System.out.println(Integer.parseInt(numericMac));
        return Integer.parseInt(numericMac);
    }
    
    public String getStringMac(String mac){
        String str=mac;
       //Pattern p = Pattern.compile("([0-9])");
       StringBuilder sb=new StringBuilder();
      Pattern p = Pattern.compile("([A-Z])");
Matcher m = p.matcher(str);
while(m.find())
{
    sb.append(m.group(1));
   
}
String stringMac=sb.toString();
//System.out.println("String Mac: "+stringMac);
 return stringMac;
    }
    }
    

