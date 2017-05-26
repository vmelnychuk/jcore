package io.neko.learn.iteration;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class IterationExample {
    public static void iteration() {
        List<Item> items = Arrays.asList(new Item("a"), new Item("b"), new Item("c"));

        Logger log = Logger.getLogger(IterationExample.class.getCanonicalName());
        FileHandler logFile = null;
        try {
            logFile = new FileHandler("app.log");
        } catch (IOException ignore) {}
        logFile.setFormatter(new SimpleFormatter());
        log.addHandler(logFile);
        log.setUseParentHandlers(false);

        // for-each
        for (Item item : items) {
            log.info("do for-each loop");
            item.addString(item.getCargo());
        }

        // for-iterator
        for(Iterator<Item> itemsIterator = items.iterator(); itemsIterator.hasNext(); ) {
            Item item = itemsIterator.next();
            item.addString(item.getCargo());
        }

        // while-iterator
        Iterator<Item> whileIterator = items.iterator();
        while (whileIterator.hasNext()) {
            Item item = whileIterator.next();
            item.addString(item.getCargo());
        }

        // Java 8 lambda
        items.forEach(item -> item.addString(item.getCargo()));
    }
}
