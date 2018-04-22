package com.ibm.jmh.benchmark;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.results.RunResult;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import java.text.DecimalFormat;
import java.util.Collection;
import org.junit.Assert;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JmhApplicationTests {

    private static DecimalFormat df = new DecimalFormat("0.000");
    private static final double REFERENCE_SCORE = 37.132;

	@Test
    public void jmhBenchmarkTest() throws RunnerException {

        Options opt = new OptionsBuilder()
                .include(JMHBenchmark.class.getSimpleName())
                .warmupIterations(1)
                .measurementIterations(5)
                .forks(1)
                .mode(Mode.AverageTime)
                .build();
        Collection<RunResult> runResults = new Runner(opt).run();
        Assert.assertFalse(runResults.isEmpty());
        for(RunResult runResult : runResults) {
            System.out.println("Run Results : " + 1/runResult.getPrimaryResult().getScore());
            // assertDeviationWithin(runResult, REFERENCE_SCORE, 0.05);
        }
	}

    private static void assertDeviationWithin(RunResult result, double referenceScore, double maxDeviation) {
        double score = result.getPrimaryResult().getScore();
        double deviation = Math.abs(score/referenceScore - 1);
        String deviationString = df.format(deviation * 100) + "%";
        String maxDeviationString = df.format(maxDeviation * 100) + "%";
        String errorMessage = "Deviation " + deviationString + " exceeds maximum allowed deviation " + maxDeviationString;
        //Assert.assertTrue(errorMessage, deviation < maxDeviation);
    }
}
