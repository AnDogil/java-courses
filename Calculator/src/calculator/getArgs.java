/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculator;

public class getArgs {
    private float rez, frArg, dblArg;
    private char opr;
    final float getArgs(float frArg, float dblArg, char opr){
        this.frArg = frArg;
        this.dblArg = dblArg;
        this.opr = opr;
        switch(opr){
            case '+':
                this.rez = this.frArg + this.dblArg;
                break;
            case '-':
                this.rez = this.frArg - this.dblArg;
                break;
            case '/':
                this.rez = this.frArg / this.dblArg;
                break;
            case '*':
                this.rez = this.frArg * this.dblArg;
                break;
        
        }
    return this.rez;
    }
    
    
    }
    

