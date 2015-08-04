/*
 * @(#)Test.java	1.0 2015/3/29
 *
 */
package com.rolex.program;

/**
 * 利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示
 *
 * User: rolex
 * Date: 2015/3/29
 * version: 1.0
 */
public class Prog0329 {

    public static void main(String[] args) {
        Prog0329 t = new Prog0329();
        t.print(78);
    }

    private void print(int n) {
        System.out.println(n >= 90 ? "A" : n >= 60 && n <= 89 ? "B" : "C");
    }
}
