/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculator;

/**
 *
 * @author VVTrebish
 */
public class getArgs {
    private float frArg, dblArg, rez;
    private String opr;
    final public float getArgs(float frArg, float dblArg, String opr){
        this.opr   =opr;
        this.frArg =frArg;
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

