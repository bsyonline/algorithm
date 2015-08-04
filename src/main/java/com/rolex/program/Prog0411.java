/*
 * @(#)Prog0408.java	1.0 2015/4/11
 *
 */
package com.rolex.program;

/**
 * 字符串逆序打印
 *
 * User: rolex
 * Date: 2015/4/11
 * version: 1.0
 */
public class Prog0411 {

    public static void main(String[] args) {
		Prog0411 prog = new Prog0411();
		System.out.println(prog.print("i am a student"));
    }

	public String print(String n){
		if(n == null || n.length() == 0){
			return "string is be blank.";
		}
		String[] arr = n.split(" ");
		String str = "";
		for(int i=arr.length-1;i>=0;i--){
			str += arr[i] + " ";
		}
		return str.substring(0,str.length()-1);
	}
	
}
