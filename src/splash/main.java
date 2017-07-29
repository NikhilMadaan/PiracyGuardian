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
 * @author Nikhil Madaan
 */
public class main {
    
    public static void main(String args[]) throws IOException
    {
        splashscreen ss=new splashscreen();
    ss.setVisible(true);
    Start s=new Start();
   try{
       for(int i=0; i<=100 ;i++){
           
           Thread.sleep(20);
           ss.loading.setText(Integer.toString(i)+"%");
           ss.loadingbar.setValue(i);
           if(i==100){
               ss.setVisible(false);
               s.setVisible(true);
           }
       }
   }
   catch(Exception e){
       
   }
       /* String cmd="ipconfig /all";
        Process p= Runtime.getRuntime().exec(cmd);
        BufferedReader inn=new BufferedReader(new InputStreamReader(p.getInputStream()));
        Pattern pattern=Pattern.compile(".*Physical Address.*:(.*)");
        while(true){
            String line=inn.readLine();
            if(line==null)
                break;
            Matcher mm=pattern.matcher(line);
            if(mm.matches()){
                System.out.println(mm.group(1));
                break;
            }
        }*/
    }
}
