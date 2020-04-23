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
	
public static byte recursion(byte i, int j) {
		 
	if (i == 0) {
	return (byte) (j + 1);
	}
        else if (j == 0 && i > 0) {
	return recursion((byte) (i - 1), 1);
	} 
		
	else {
	return recursion((byte) (i - 1), recursion(i, (byte) (j - 1)));
}
 }
  }