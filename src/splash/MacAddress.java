/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author shagilsid
 */
public class MacAddress {
    public String getMacAddress() throws IOException{
        String command = "ipconfig /all";
       Process p = Runtime.getRuntime().exec(command);
       String mac=null;
       BufferedReader inn = new BufferedReader(new InputStreamReader(p.getInputStream()));
       Pattern pattern = Pattern.compile(".*Physical Addres.*: (.*)");

       while (true) {
            String line = inn.readLine();

	    if (line == null)
	        break;

	    Matcher mm = pattern.matcher(line);
	    if (mm.matches()) {
	        mac=mm.group(1);
                break;
	    }
	}
      // System.out.println(mac);
       return mac;
    }
    
}
