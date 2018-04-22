package com.ibm.jmh.benchmark;

import org.openjdk.jmh.annotations.*;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.logging.*;
import java.util.logging.Level;

public class JMHBenchmark {

    private static final Logger logger = LoggerFactory.getLogger(JMHBenchmark.class);

    @Benchmark
    public void testConcatenatingStrings(){

        String x = "", y = "", z = "";

        for (int i = 0; i < 100; i++) {
            x += i; y += i; z += i;

            logger.debug("Concatenating strings " + x + y + z);
        }
    }

    @Benchmark
    public void testVariableArguments() {

        String x = "", y = "", z = "";

        for (int i = 0; i <100; i++) {
            x += i; y += i; z += i;

            logger.debug("Variable arguments {} {} {}", x, y, z);
        }
    }

    @Benchmark
    public void testIfDebugEnabled() {

        String x = "", y = "", z = "";

        for (int i = 0; i < 100; i++) {
            x += i; y += i; z += i;

            if (logger.isDebugEnabled())
                logger.debug("If debug enabled {} {} {}", x, y, z);
        }
    }
}
