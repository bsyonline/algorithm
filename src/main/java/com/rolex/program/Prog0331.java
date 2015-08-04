/*
 * @(#)Test2.java	1.0 2015/3/31
 *
 */
package com.rolex.program;

/**
 * 一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？
 *
 * User: rolex
 * Date: 2015/3/31
 * version: 1.0
 */
public class Prog0331 {

    public static void main(String[] args) {
        Prog0331 t = new Prog0331();
        System.out.println(t.height(100, 3));
        System.out.println(t.sum(100,3));
    }

    public double height(double n,int t){
        if(t==0){
            return n;
        }else{
            return height(n / 2, t - 1);
        }
    }

    public double sum(double start,int c){
        double sum = start;
        for(int i=1;i<=c;i++){
            sum += height(start,i);
        }
        return sum;
    }
}
