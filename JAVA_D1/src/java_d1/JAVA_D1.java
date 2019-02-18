/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_d1;

import java.util.Scanner;

/**
 *
 * @author MahMainBitch
 */
public class JAVA_D1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // System.out.println("Enter your name: ");
        
        // Scanner sc = new Scanner(System.in);
        
        // int a = 4;
        // a = 6;
        // String simboli = "aa" + "bb";
        
        // simboli = sc.nextLine();
        
        // System.out.println(sc);
        
        vardaIevade();
        // TODO code application logic here
    }
    
    private static void vardaIevade (){
        
        Scanner fluffyUnicorn = new Scanner(System.in);
        
        System.out.println("Ievadi savu vaardu: ");
        
        String ievade = fluffyUnicorn.nextLine();
        
        System.out.println("Sveiki, " + ievade);
        
    }
}
