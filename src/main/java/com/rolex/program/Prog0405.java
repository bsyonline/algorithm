/*
 * @(#)Prog0405.java	1.0 2015/4/5
 *
 */
package com.rolex.program;

/**
 * 猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个。
 * 第二天早上又将剩下的桃子吃掉一半，又多吃了一个。
 * 以后每天早上都吃了前一天剩下的一半零一个。
 * 到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少
 *
 * User: rolex
 * Date: 2015/4/5
 * version: 1.0
 */
public class Prog0405 {

    public static void main(String[] args) {
        Prog0405 prog = new Prog0405();
        System.out.println(prog.count(0));
    }

    public int count(int day){
        if(day == 9){
            return 1;
        }else{
            return (count(day+1) + 1) * 2;
        }
    }
}
