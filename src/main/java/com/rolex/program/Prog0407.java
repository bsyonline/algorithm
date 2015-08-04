/*
 * @(#)Prog0407.java	1.0 2015/4/7
 *
 */
package com.rolex.program;


/**
 * 2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和
 *
 * User: rolex
 * Date: 2015/4/7
 * version: 1.0
 */
public class Prog0407 {

    public static void main(String[] args) {
        Prog0407 prog = new Prog0407();
        double d = 0.0;
        for(int i=1;i<=20;i++){
            d += prog.m(i)/prog.n(i);
        }

        System.out.println(d);
    }

    public double m(int t){
        if(t==1){
            return 2.0;
        }else if(t==2){
            return 3.0;
        }else{
            return m(t-1)+m(t-2);
        }

    }

    public double n(int t){
        if(t==1){
            return 1.0;
        }else if(t==2){
            return 2.0;
        }else{
            return n(t-1)+n(t-2);
        }

    }
}
