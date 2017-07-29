/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splash;

/**
 *
 * @author shagilsid
 */
public class SumOfSquare {
    
    public int getSumOfSquare(int numericMac){
    int digits=0;
    
    long num=numericMac;
    long x=num;
    int sum=0;
    long rem;
        while(x!=0){
        rem=x%10;
        //System.out.println("Rem= "+rem);
            sum+=Math.pow(rem, 2);
            x=x/10;
          //  System.out.println("X= "+x);
    }
       // System.out.println("Sum of mac: "+sum);
        return sum;
}
}
