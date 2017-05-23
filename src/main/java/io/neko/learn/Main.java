package io.neko.learn;

import io.neko.learn.model.Item;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        iteration();
    }

    public static void iteration() {
        System.out.println("iteration...");

        List<Item> items = Arrays.asList(new Item("a"), new Item("b"), new Item("c"));
        for (Item item : items) {
            item.addString(item.getCargo());
        }

        for(Iterator<Item> itemsIterator = items.iterator(); itemsIterator.hasNext(); ) {
            Item item = itemsIterator.next();
            item.addString(item.getCargo());
        }

        Iterator<Item> whileIterator = items.iterator();
        while (whileIterator.hasNext()) {
            Item item = whileIterator.next();
            item.addString(item.getCargo());
        }
    }
}
