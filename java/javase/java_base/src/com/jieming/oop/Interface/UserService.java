package com.jieming.oop.Interface;

public interface UserService {
    // defines in interface are actually public abstract
    public abstract void run();
    void go();

    void add(String name);
    void delete(String name);
    void update(String name);
    void query(String name);
}
