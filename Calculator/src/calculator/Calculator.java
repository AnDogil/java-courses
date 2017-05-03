

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
            
            try{
                operands.add(Float.valueOf(str));}
            catch(NumberFormatException e){
                operator= str;};
            if(operands.size() ==2){
                System.out.println("Результат равен: "+ getArgs.makeOperation(operands.get(0), operands.get(1), operator));
                operands.clear();}
            
        
        }
        while(!str.equals("q"))
                ;
    }
}
        