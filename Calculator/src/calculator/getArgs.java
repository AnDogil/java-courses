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
    
    final public float getArgs(float frArg, float dblArg, String opr){
        getArgs.opr   =opr;
        frArg =frArg;
        this.dblArg=dblArg;
        switch(this.opr){
            case "+":
                this.rez = this.frArg + this.dblArg;
                break;
            case "-":
                this.rez = this.frArg - this.dblArg;
                break;
            case "/":
                this.rez = this.frArg / this.dblArg;
                break;
            case "*":
                this.rez = this.frArg * this.dblArg;
                break;
        }
        return rez;
    }
}

    


