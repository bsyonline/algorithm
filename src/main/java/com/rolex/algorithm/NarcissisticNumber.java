/*
 * @(#)NarcissisticNumber.java	1.0 2015/3/30
 *
 */
package com.rolex.algorithm;

/**
 * 水仙花数是指一个 n 位数 ( n≥3 )，它的每个位上的数字的 n 次幂之和等于它本身。（例如：1^3 + 5^3+ 3^3 = 153）
 *
 * User: rolex
 * Date: 2015/3/30
 * version: 1.0
 */
public class NarcissisticNumber {

    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int h = i / 100;
            int t = (i - h * 100) / 10;
            int o = (i - h * 100 - t * 10);
            if ((Math.pow(h, 3) + Math.pow(t, 3) + Math.pow(o, 3)) == i) {
                System.out.print(i + ", ");
            }
        }
    }

}
