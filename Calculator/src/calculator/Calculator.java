/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculator;

import java.util.ArrayList;
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
        float frArg, dblArg, rez;
        String str, operator;
        ArrayList<Float> operands = new ArrayList<Float>();
        //str = read.nextLine();
        //String[] arguments = new getArgs().splitting(str);
                
        do{ str = read.next();
            try{
                operands.add(Float.valueOf(str));}
            catch(NumberFormatException e){
                switch(str){
                    case "mem":
                        rez= -1;
                        operator = str;}}
            }
        while(!str.equals("q"))
                ;
    }
    
}
