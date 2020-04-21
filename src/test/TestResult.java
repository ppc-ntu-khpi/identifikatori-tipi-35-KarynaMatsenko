/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
/**
 *
 * @author Admin
 */
import domain.Exercise;

public class TestResult {

   
    public static void main(String[] args) {
        
        int R=100000;
        if(R>=100000 && R<1000000)
            {
            System.out.println("Number "+R+" in binary cleaning system: "
                    + ""+Exercise.CalculateBinarySystem(R)+"\n"
                    + "in octal calculus: "+Exercise.CalculateOctalSystem(R)
                    +"\nin hexadecimal number system: "
                    +Exercise.CalculateHexadecimalSystem(R));
            }
        else{
            System.out.println("The number R must be six-digit");
            }
    }
}