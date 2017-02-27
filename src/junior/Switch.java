/*
 * Copyright (c) 2017. zminds@163.com All Rights Reserved.
 */

package junior;

/**
 * Created by rodney on 20/02/2017.
 */
public class Switch {
    public static void main(String[] args) {
        switch ('*') {
            case '1':
                System.out.println(1);
                break;
            case '2':
                System.out.println(2);
                break;

            case '3':
                System.out.println(3);
                break;

            case '4':
                System.out.println(4);
                break;
            default:
                System.out.println("xxxx");
        }
    }
}
