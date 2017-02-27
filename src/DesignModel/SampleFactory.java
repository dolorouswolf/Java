/*
 * Copyright (c) 2017. zminds@163.com All Rights Reserved.
 */

package DesignModel;

/**
 * Created by rodney on 20/02/2017.
 */
public class SampleFactory {
    public static Operation createOperator(String operate){
        switch (operate){
            case "+":
                return new OperationAdd();
            case "-":
                return new OperationSub();
            case "*":
                return new OperationMul();
            case "/":
                return new OperationDiv();
            default:
                return null;

        }
    }

    public static void main(String[] args) {
        Operation operation = SampleFactory.createOperator("/");
        operation.numberB=123;
        operation.numberA=999.1;
        System.out.println(operation.getResult());;
    }
}

abstract class  Operation{
    public double numberA =0.0;
    public double numberB =0.0;
    abstract  double getResult();
}
class  OperationAdd extends Operation{
    public double getResult(){
        return numberA  + numberB;
    }
}
class  OperationSub extends Operation{
    public double getResult(){
        return numberA  - numberB;
    }
}
class  OperationMul extends Operation{
    public double getResult(){
        return numberA  * numberB;
    }
}
class  OperationDiv extends Operation{
    public double getResult(){
        return numberA  / numberB;
    }
}