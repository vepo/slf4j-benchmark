package io.vepo.logger.benchmark;

import static java.lang.System.currentTimeMillis;

import java.util.stream.IntStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerBenchmark {
	private static final Logger logger = LoggerFactory.getLogger(LoggerBenchmark.class);

	public static void main(String[] args) {
		long startTimestamp = currentTimeMillis();
		logger.info("Execution started: {}", startTimestamp);
		IntStream.range(0, 1_000_000).forEach(value -> logger.debug("Iteration step: {}", value));
		long endTimestamp = currentTimeMillis();
		logger.info("Execution ended: {}", endTimestamp);
		logger.info("Duration: {}ms", (endTimestamp - startTimestamp));
	}
}