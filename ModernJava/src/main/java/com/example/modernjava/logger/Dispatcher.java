package com.example.modernjava.logger;

import java.util.logging.Logger;

public class Dispatcher {
    private static final Logger log = Logger.getLogger(Dispatcher.class.getName());

    public static void dispatchLoop() {
        while (true) {
            try {
                long start = System.currentTimeMillis();
                Item item = WorkQueue.getNextItem();
                log.find("Processing item: " + item);
                item.process();

                long timeInMillis = System.currentTimeMillis() - start;
                log.info("Processing " + item + " took " + timeInMillis + "ms");
            } catch(Exception e) {
                log.severe("Unhandled exception: " + e);
            }
        }
    }
}
