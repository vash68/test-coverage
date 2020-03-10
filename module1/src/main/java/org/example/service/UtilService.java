package org.example.service;

//this class is used for untit testing only
public class UtilService {

    public int add(int a, int b) {
        //
        System.out.println("Doing addition!");
        return a + b;
    }


    public int subtract(int a, int b) {
        System.out.println("Doing subtraction!");
        if(a ==b) {
            //dangerous branch
            return 0;
        } else {
            return a - b;
        }
    }


    public void noOp(int a, int b) {
        System.out.println("Doing nothing!");
    }



}
