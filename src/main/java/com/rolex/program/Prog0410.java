/*
 * @(#)Prog0408.java	1.0 2015/4/10
 *
 */
package com.rolex.program;

/**
 * 字符串逆序打印
 *
 * User: rolex
 * Date: 2015/4/10
 * version: 1.0
 */
public class Prog0410 {

    public static void main(String[] args) {
		Prog0410 prog = new Prog0410();
		System.out.println(prog.print("i am a student"));
    }

	public String print(String n){
		String s = "";
		for(int i=n.length()-1;i>=0;i--){
			s += n.charAt(i);
		}
		return s;
	}

}
