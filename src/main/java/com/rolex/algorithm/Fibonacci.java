/*
 * @(#)Fibonacci.java	1.0 2015/3/23
 *
 */
package com.rolex.algorithm;

/**
 * 有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 * <p/>
 * 月份       	1	2	3	4	5	6	7	8	9	10	11	12
 * 小兔子对数 	1	0	1	1	2	3	5	8	13	21	34	55
 * 中兔子对数 	0	1	0	1	1	2	3	5	8	13	21	34
 * 大兔子对数 	0	0	1	1	2	3	5	8	13	21	34	55
 * 总对数       	1	1	2	3	5	8	13	21	34	55	89	144
 * <p/>
 * User: rolex
 * Date: 2015/3/23
 * version: 1.0
 */
public class Fibonacci {

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        for (int i = 0; i < 20; i++) {
            System.out.print(f.getCount(i) + ",");
        }
    }

    public int getCount(int month) {
        if (month == 0) {
            return 0;
        } else if (month == 1 || month == 2) {
            return 1;
        } else {
            return getCount(month - 1) + getCount(month - 2);
        }
    }
}
