package com.jieming.annotation_reflection;

/*
    Annotation/Metadata:
    useful annotations:
    - @Override: only before method
    - @Deprecated: can be used before class or method
    - @SuppressWarning: suppress all the warnings

    Meta Annotation:
    to modify annotations
    - Retention
    - Target
    - Document
    - Inherited
 */

class Point{
    public int x;
    public int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String getString(){
        return String.format("(%d %d)", x, y);
    }
}

class ColorPoint extends Point{
    @SuppressWarnings({"all"})
    private String color; // warning

    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public String getString(){
        return String.format("(%d, %d, %s)", super.x, super.y, color);
    }

    @Deprecated
    public void info(){
        System.out.println("This method is deprecated!");
    }

}

public class Main {
    public static void main(String[] args) {
        ColorPoint p = new ColorPoint(3, 4, "red");
        System.out.println("Hello world!");
        p.info();
    }
}
