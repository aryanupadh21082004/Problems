package com.arya;

public class InnerClass {
    static class Test{
        String name;
        public Test(String name){
            this.name =name;
        }
    }


    public static void main(String[] args) {
        Test a = new Test("Kunal");
        Test b =new Test("Aryan");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
