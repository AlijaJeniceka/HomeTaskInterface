package com.company;

public class Square implements Mathematical{
    private int a;
    private int b;

    public void Square (int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    public int operation(int firstNumber, int secondNumber){
        firstNumber = this.a;
        secondNumber = this.b;

        return (int)Math.pow(a, b);
    }
}
