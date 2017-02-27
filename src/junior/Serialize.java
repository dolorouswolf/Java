/*
 * Copyright (c) 2017. zminds@163.com All Rights Reserved.
 */

package junior;

import java.io.*;

/**
 * Created by rodney on 20/02/2017.
 */
public class Serialize {
    public static void main(String[] args) {
        Emp p = new Emp();
        p.name="zm";
        p.age=30;
        p.salary=35000.0;
        p.address="beijing";

        try{
            FileOutputStream fileOutputStream = new FileOutputStream("/tmp/zm.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(p);
            objectOutputStream.close();
            System.out.println("serialized success");
        }catch (FileNotFoundException e){
            System.err.println(e.getMessage());
        }catch (IOException e){
            System.err.println(e.getMessage());
        }


        try{
            FileInputStream inputStream  = new FileInputStream("/tmp/zm.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            Emp p1 = (Emp) objectInputStream.readObject();
            objectInputStream.close();
            if(p1 !=null){
                p1.mailcheck();
            }
        }catch (FileNotFoundException e){
            System.err.println(e.getMessage());
        }catch (IOException e){
            System.err.println(e.getMessage());
        }catch (ClassNotFoundException e){
            System.err.println(e.getMessage());
        }
    }
}

class Emp implements Serializable{
    String name;
    String address;
    transient Integer age;
    Double  salary;
    public void mailcheck(){
        System.out.println("Mailing  a check to "+name
        + address);
    }
}
