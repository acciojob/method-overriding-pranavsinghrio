package com.driver;

public class Main {
   static class A{
       String met(){
          return "Invoking method from class A";
      }
  }
   static class B extends A{
      @Override
       String met(){
          return "Method is overridden in Extendend class B";
      }
  }

    public static void main(String[] args) {
        B b = new B();
          b.met();
    }

}