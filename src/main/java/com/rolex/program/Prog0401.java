/*
 * @(#)Test0401.java	1.0 2015/4/1
 *
 */
package com.rolex.program;

/**
 * 计算 2+22+222+2222+22222...
 *
 * User: rolex
 * Date: 2015/4/1
 * version: 1.0
 */
public class Prog0401 {

    public static void main(String[] args) {
        Prog0401 t = new Prog0401();
        System.out.println(t.print(2,5));
    }

    public int print(int n, int t){
        int sum = 0;
        for(int i=1;i<=t;i++){
            sum += calculate(n,i);
        }
        return sum;
    }

    public int calculate(int n,int t){
        int m = 0;
        for(int i=0;i<t;i++){
            m += Math.pow(10,i) * n ;
        }
        return m;
    }
}
