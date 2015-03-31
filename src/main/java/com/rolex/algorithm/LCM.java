/*
 * @(#)LCM.java	1.0 2015/3/31
 *
 */
package com.rolex.algorithm;

/**
 * 最小公倍数[m,n] = m * n / (m,n)
 * User: rolex
 * Date: 2015/3/31
 * version: 1.0
 */
public class LCM {

    public static void main(String[] args) {
        LCM lcm = new LCM();
        System.out.println(lcm.lcm(18, 20));
    }

    public int lcm(int m, int n) {
        GCD gcd = new GCD();
        int g = gcd.gcd(m, n);
        return m * n / g;
    }
}
