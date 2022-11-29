package com.jieming.oop.inner_class;

// a java file can have multi class, but only one public class
public class Outer {
    private int id = 100012;

    public static void main(String[] args) {
        new Apple().eat();

        UserService userService = new UserService() {
            @Override
            public void hello() {

            }
        };
    }

    public void method(){
        class Inner{
            public void in(){

            }
        }
    }

    public void out(){
        System.out.println("Here is a outer method.");
    }

    public class Inner{
        public void in(){
            System.out.println("Here is a inner method.");
        }

        public void getID(){
            System.out.println(id);
        }
    }
}

class Apple{
    public void eat(){
        System.out.println("eat an apple.");
    }
}

interface UserService{
    void hello();
}
