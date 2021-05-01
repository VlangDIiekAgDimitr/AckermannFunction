/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iek.agdimitr.ackermannfunction;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class AckermannMain {

    /**
     * @param args the command line arguments
     */
    private static int repeat=0;
     public static int findAckermann(int m, int n){
         repeat++;
         System.out.println("findAckermann is called #"+repeat+" times");
         
        if (m==0){
            return n+1;
        } else
            if (n==0){
              
                return findAckermann(m-1, 1);
            }else
            {
               return findAckermann(m-1, findAckermann(m, n-1));
            }
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
       String mValue = JOptionPane.showInputDialog("Enter m value");
       int m = Integer.parseInt(mValue);
       String nValue = JOptionPane.showInputDialog("Enter n value");
       int n = Integer.parseInt(nValue);
       
        
        System.out.println("\n Ackermann("+m+","+n+") is:  "+ findAckermann(m,n)+"\n");
                }
    
   
}
