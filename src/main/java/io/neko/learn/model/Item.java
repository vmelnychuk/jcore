package io.neko.learn.model;

public class Item {
    private final String cargo;

    public Item(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public Item addString(String str) {
        return new Item(this.getCargo().concat(str));
    }
}
