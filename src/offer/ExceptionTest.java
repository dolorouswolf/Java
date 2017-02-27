/*
 * Copyright (c) 2017. zminds@163.com All Rights Reserved.
 */

package offer;/**
 * Created by rodney on 19/02/2017.
 */
public class ExceptionTest {
    public static void main(String[] args) {
        Exception e = new Exception();

        try {
            throw e;
        }catch(Exception e1){
            e.printStackTrace();
        }


    }
}
