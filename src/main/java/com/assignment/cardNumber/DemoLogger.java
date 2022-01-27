package com.assignment.cardNumber;

import org.apache.log4j.Logger;

public class DemoLogger {
    static Logger log=Logger.getLogger(DemoLogger.class.getName());
    public static void main(String[] args) {
        log.info("I am from main method of new class");
    }
}
