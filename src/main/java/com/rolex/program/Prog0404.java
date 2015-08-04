/*
 * @(#)Prog0404.java	1.0 2015/4/4
 *
 */
package com.rolex.program;

/**
 * 99乘法表
 * User: rolex
 * Date: 2015/4/4
 * version: 1.0
 */
public class Prog0404 {

    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            for(int j=1;j<=9;j++){
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}
