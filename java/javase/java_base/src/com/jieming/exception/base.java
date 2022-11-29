package com.jieming.exception;

public class base {
    public static void main(String[] args) throws ArithmeticException{
        // try catch finally throw throws
        // throws when defining a method
        int a = 1;
        int b = 0;

        try{
            if (b==0){
                // actively throw an exception
                throw new ArithmeticException();
            }

            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println("Exception, b cannot be 0");
        }catch( Exception e){
            System.out.println("Exception, but I don't know what it is");
        }catch(Throwable t){
            System.out.println("Exception or Error!");
        }finally{
            // IO or resources to close
            System.out.println("finally");
        }
    }
}
