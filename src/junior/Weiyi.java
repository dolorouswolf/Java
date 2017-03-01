/*
 * Copyright (c) 2017. zminds@163.com All Rights Reserved.
 */

package junior;

/**
 * rodney在01/03/2017创建。
 * https://www.iteblog.com/archives/740.html
 * 当移位的数是正数的时候，>> 和>>>效果都是一样的；
 * 当移位的数是负数的时候，>>将二进制高位用1补上，而>>>将二进制高位用0补上，这就导致了>>>将负数的移位操作结果变成了正数（因为高位用0补上了）
 */
public class Weiyi {
    public static void main(String[] args) {
        System.out.println(-15 >> 4);
        System.out.println(-15 >>> 4);
    }
}
