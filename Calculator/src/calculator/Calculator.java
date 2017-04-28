

package calculator;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author VVTrebish
 */
public class Calculator {

    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        String str, operator="";
        LinkedList<Float> operands = new LinkedList<Float>();
        float rezultat=0;
        str = read.nextLine();
        String[] arguments = new getArgs().splitting(str);
        
        
        
        
        for(String str1 : arguments){
        try{//Integer.valueOf(str1);
            operands.push(Float.valueOf(str1));
        }catch(NumberFormatException e){
            operator = str1;
            continue;};
        }
        switch(operator){
            case "+":
                rezultat =operands.getFirst() + operands.getLast();
                break;
            case "-":
                rezultat =operands.getFirst() - operands.getLast();
                break;
            
            
        }
        
        System.out.println("Результат:" + rezultat);
    
}
}