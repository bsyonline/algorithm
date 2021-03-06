/*
 * @(#)Prog0408.java	1.0 2015/4/9
 *
 */
package com.rolex.program;

/**
 * 一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
 *
 * User: rolex
 * Date: 2015/4/9
 * version: 1.0
 */
public class Prog0409 {

    public static void main(String[] args) {
		Prog0409 prog = new Prog0409();
		System.out.println(prog.print(12331));
    }

	public boolean print(int n){
		String s = String.valueOf(n);
		if(s.length() != 5){
			return false;
		}else{
			if((s.charAt(0)==s.charAt(4)) && (s.charAt(1) == s.charAt(3))){
				return true;
			}else{
				return false;
			}
		}
	}

}
