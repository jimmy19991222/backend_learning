package com.jieming.oop;

import static java.lang.Math.random;

public class Application {
    public static void main(String[] args) {
//        Person1 demo = new Person1();
//        System.out.println(demo.name);

        /*
             dog is in STACK, as a reference name
             new Pet() is in HEAP, has an individual address
             "dog" point to specific "new Pet()" s address

             class is in the METHOD REGION
             static method is in the STATIC METHOD REGION of METHOD REGION

             static method is generated with the class, so every instance can call it
        */

        System.out.println(random());

        Pet dog = new Pet();
        dog.name = "lucky";
        dog.age = 10;
        dog.shout();

        System.out.println(dog.name);
        System.out.println(dog.age);

        // encapsulation often focuses on attributes, not methods.
        Student s1 = new Student();
//        s1.name = "Jennifer"; // not legal
        s1.setName("Jennifer");
        System.out.println(s1.getName());
        s1.setAge(-1); // not legal
        System.out.println(s1.getAge());

        // Inheritance
        // need to abstract a kind of class
        // keyword extends

        // teacher is person
        Teacher t1 = new Teacher();
        t1.speak();
        t1.test("name_test");
        t1.test_print();

        // method overriding
        // static, final, private method should not be overrided
        A a = new A();
        a.test();

        // method should be non-static
        // method should be public
        B b = new A(); // son class override father class's method
        b.test();

        // Polymorphism
        // dynamic compile, scalability
        // polymorphism is on methods
        // should have inherited relation, method should be overrided.
        // Father f1 = new Son();

        // an object actual type is certain
        // but the father class's reference can point to son class
        Teacher t2 = new Teacher();
        Person1 t3 = new Teacher();
        Object t4 = new Teacher();

        t2.eat();
//        t3.eat();
        ((Teacher)t3).eat();

        // instanceof keyword
        // output the type of object
        System.out.println(t2 instanceof Teacher);
        System.out.println(t2 instanceof Person1);
        System.out.println(t2 instanceof Object);
//        System.out.println(t2 instanceof Pet);
    }
}
