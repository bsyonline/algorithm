/*
 * @(#)Prog0408.java	1.0 2015/4/8
 *
 */
package com.rolex.program;

/**
 * 求1+2!+3!+...+20!的和
 *
 * User: rolex
 * Date: 2015/4/8
 * version: 1.0
 */
public class Prog0408 {

    public static void main(String[] args) {
		Prog0408 prog = new Prog0408();
		System.out.println(prog.print(20));
    }

	public int print(int n){
		int r=0;
		for(int i=1;i<=n;i++){
			r += factorial(i);
		}
		return r;
	}
	
	public int factorial(int n){
		int r = 1;
		for(int i=1;i<=n;i++){
			r = r * i;
		}
		return r;
	}

	
}
