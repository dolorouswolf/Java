/*
 * Copyright (c) 2017. zminds@163.com All Rights Reserved.
 */

package junior;

/**
 * Created by rodney on 20/02/2017.
 */
public class FreshJuice {
    enum FreshJuiceSize{
        SMALL,
        MEDIUM,
        LARGE
    }

    FreshJuiceSize size;

    public static void main(String[] args) {
        FreshJuice freshJuice = new FreshJuice();
        freshJuice.size = FreshJuiceSize.SMALL;
        System.out.println(freshJuice.size);
    }
}
