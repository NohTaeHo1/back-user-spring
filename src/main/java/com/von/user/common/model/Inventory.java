package com.von.user.common.model;

import java.util.ArrayList;

public class Inventory<T> {
    public ArrayList<T> inventory;

    public Inventory(ArrayList<T> inventory) {
        this.inventory = new ArrayList<>();
    }

    public void add(T t) {
        inventory.add(t);
    }
    public T remove(int t){
        return inventory.remove(t);
    }

    public boolean contains(T t) {
        return inventory.contains(t);
    }
    /*public T get(int t) {
        return inventory.get(t);
    }*/

    public T get(int t) {
        return inventory.get(t);
    }

    public void clear() {
        inventory.clear();
    }
}