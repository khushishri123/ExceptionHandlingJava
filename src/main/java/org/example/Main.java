package org.example;

class Tom{
    public void generateException()throws ArithmeticException
    {
        throw new ArithmeticException("Arithmetic Exception");
    }
public void handleException()
{
  try
  {
      generateException();
  }catch (Exception e)
  {
      System.out.println("Exception handled");
  }
}
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Tom t=new Tom();
        t.handleException();
        System.out.println("Normal Flow..");
    }
}