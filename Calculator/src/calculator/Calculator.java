

package calculator;


import java.nio.file.FileVisitResult;
import java.util.ArrayList;

import java.util.LinkedList;

import java.util.Scanner;

/**
 *
 * @author VVTrebish
 */
public class Calculator {
//Пососите тунца
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);

        float frArg, dblArg, rez;
        String str, operator="";
        ArrayList<Float> operands = new ArrayList<Float>();
        //str = read.nextLine();
        //String[] arguments = new getArgs().splitting(str);
                
        do{ str = read.next();
            if(operands.size() ==2){
                System.out.println("Два оператора");
                System.out.println("Операция: " + operator);
                operands.clear();}
                try{
                operands.add(Float.valueOf(str));}
            catch(NumberFormatException e){
                operator= str;};
            }
        while(!str.equals("q"))
                ;
    }
}
        