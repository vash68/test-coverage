package org.example.service2;

//this class is used for untit testing only
public class SecretService {

    public int doAddition(int a, int b) {
        //
        System.out.println("Doing addition!");
        return a + b;
    }


    public int doSubtraction(int a, int b) {
        System.out.println("Doing subtraction!");
        if(a ==b) {
            //dangerous branch
            return 0;
        } else {
            return a - b;
        }
    }


    public void doNoOp(int a, int b) {
        System.out.println("Doing nothing!");
    }



}
