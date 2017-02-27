/*
 * Copyright (c) 2017. zminds@163.com All Rights Reserved.
 */

package junior;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by rodney on 20/02/2017.
 */
public class Dates {
    public static void main(String[] args) {
        Date d  = new Date();
        SimpleDateFormat simpleDateFormat  = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        System.out.println(simpleDateFormat.format(d));
    }
}
