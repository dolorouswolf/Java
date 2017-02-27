/*
 * Copyright (c) 2017. zminds@163.com All Rights Reserved.
 */

package junior;

/**
 * Created by rodney on 20/02/2017.
 */
public class Type {
    public static void main(String[] args) {
        int [] n = {10,20,30};
        for (int x :
                n) {
            if(x == 20 ){
                continue;
            }else {
                System.out.println(x);

            }
        }
        String [] ss= {"123","321","111"};
        for (String s :
                ss) {
            System.out.println(s);
        }
    }

}
