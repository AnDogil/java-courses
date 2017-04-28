/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculator;

import java.util.Scanner;

/**
 *
 * @author VVTrebish
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String str, operator; 
        str = read.nextLine();
        String[] arguments = new getArgs().splitting(str);
        for(String str1 : arguments){
        try{Integer.valueOf(str1);
        }catch(NumberFormatException e){System.err.println("Неверный формат числа");};
        
        }        
        /*do{ str = read.nextLine();
            
            System.out.println(str);}
        while(!str.equals("1"))
    */            ;
    }
    
}
