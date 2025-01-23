package com.practice;

import java.util.logging.Logger;

public class Calculator {

    static Logger logger = Logger.getLogger(Calculator.class.getName());
    public static int x=10;
    public int y=10;

    public static void main(String[] args) {
        Calculator calculator2=new Calculator();
        Calculator.x+=10;
        calculator2.y+=10;
        logger.info(String.format("value of x is %s",Calculator.x));
        logger.info(String.valueOf(calculator2.y));

    }
}
