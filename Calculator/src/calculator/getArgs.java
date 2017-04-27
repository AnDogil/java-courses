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
    String[] arguments;
    String[] splitting(String str){
        arguments = str.split(" ");
        return arguments;
    }
    
}
