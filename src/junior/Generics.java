/*
 * Copyright (c) 2017. zminds@163.com All Rights Reserved.
 */

package junior;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by rodney on 20/02/2017.
 */
public class Generics {
    public static void main(String[] args) {
        Integer[] integers =  {1,4,5,7,7};
        String[] strings = {"fsad","fds","rewr","bbgf","vx"};
        Puppy[]  puppies = {new Puppy("123"),new Puppy("13213")};
        GenricsTest.printArray(integers);
        GenricsTest.printArray(strings);
        GenricsTest.printArray(puppies);

    }
}

class GenricsTest{
    public static <E> void printArray(E[] inputarray ){
        for (E e :
                inputarray) {
            System.out.println(e);
        }
    }
}