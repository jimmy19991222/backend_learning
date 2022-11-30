package com.jieming.annotation_reflection;

import com.jieming.annotation_reflection.thirdparty.Calculator;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

// reflect vs static fashion
public class Reflection {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        // reflect instance
        Class<?> cls = Class.forName("com.jieming.annotation_reflection.thirdparty.Calculator");
        Object o = cls.newInstance();

        Method method = cls.getMethod("add", int.class, int.class);
        System.out.println(method.invoke(o, 11, 22));

        Method greet = cls.getMethod("greet");
        System.out.println(greet.invoke(o));

        String fieldname = "name";
        Field field = cls.getField(fieldname);
        field.set(o, "My Calculator!");

        System.out.println(field.get(o));

        Constructor<?> constructor = cls.getConstructor(String.class);
        Object newObject = constructor.newInstance("New Calculator!");
        System.out.println(newObject);

        // static instance
        Calculator c1 = new Calculator();
        System.out.println(c1.add(11, 22));
        c1.name = "My Calculator!";
        System.out.println(c1.name);

        Calculator c2 = new Calculator("New Calculator!");
        System.out.println(c2);
    }
}
