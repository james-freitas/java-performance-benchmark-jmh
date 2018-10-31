package com.codeonblue.jmh.basics;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.Warmup;

public class SimpleBenchmark {
	
	// Default number of iterations warmups is 20
	
	@Benchmark
	@Fork(value = 1, warmups = 1)
	@Warmup(iterations = 1)   
	@Measurement(iterations = 1) 
	@BenchmarkMode(Mode.Throughput)
    public void firstMethod() {		
        // benchmarked code here
    }
	
	/*
	@Benchmark
	@Fork(value = 1, warmups = 1)
	@Warmup(iterations = 1)
	@Measurement(iterations = 1)
	@BenchmarkMode(Mode.AverageTime)
    public void secondMethod() throws InterruptedException {
		Thread.sleep(50);
        // benchmarked code here
    }
*/	
}
