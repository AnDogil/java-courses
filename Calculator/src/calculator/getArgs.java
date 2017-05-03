/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculator;

public class getArgs {

    static private float frArg, dblArg, rez;
    static private String opr;
    /*
    Конструктор получает операнды и оператор.
    В зависимоти от оператора выполняется соответствующее действие
    и возвращается результат выражения
    */
    
    static public  float makeOperation(float frArg_, float dblArg_, String opr_){
        opr   =opr_;
        frArg =frArg_;
        dblArg=dblArg_;
        switch(opr){
            case "+":
                rez = frArg + dblArg;
                break;
            case "-":
                rez = frArg - dblArg;
                break;
            case "/":
                rez = frArg / dblArg;
                break;
            case "*":
                rez = frArg * dblArg;
                break;
        }
        return rez;
    }
}

    


