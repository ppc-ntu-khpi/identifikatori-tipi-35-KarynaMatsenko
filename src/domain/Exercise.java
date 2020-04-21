/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Admin
 */
public class Exercise {

    /**
     * Changes a decimal number to binary
     * @param R integer
     * @return the specified number
     */
    public static String CalculateBinarySystem(int R){
        return (String) (Integer.toBinaryString((int) R));
    }
    
    /**
     * Changes a decimal number to octal
     * @param R integer 
     *  @return the specified number in octal notation
     */
    public static String CalculateOctalSystem(int R){
        return (String) (Integer.toOctalString((int) R));
    }
    
    /**
     * @param R integer 
     *  @return the specified number in hexadecimal notation
     */
    public static String CalculateHexadecimalSystem(int R){
        return (String) (Integer.toHexString((int) R));
    }
}
