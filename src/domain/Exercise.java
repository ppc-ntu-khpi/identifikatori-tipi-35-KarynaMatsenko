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
	
public static byte recursion(byte n, int m) {
		 
	if (n == 0) {
	return (byte) (m + 1);
	}
        else if (m == 0 && n > 0) {
	return recursion((byte) (n - 1), 1);
	} 
		
	else {
	return recursion((byte) (n - 1), recursion(n, (byte) (m - 1)));
}
 }
  }