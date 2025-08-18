package com.example.demo;

import java.util.logging.Logger;

public class PruebaSuma {
    Logger logger = Logger.getLogger(PruebaSuma.class.getName());
    public int suma(int a, int b) {
        logger.info("Suma de " + a + " y " + b);
        return a + b;
    }
}
