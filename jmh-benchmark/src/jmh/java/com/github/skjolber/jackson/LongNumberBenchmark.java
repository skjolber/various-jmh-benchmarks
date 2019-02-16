package com.github.skjolber.jackson;

import org.openjdk.jmh.annotations.Benchmark;

import com.fasterxml.jackson.core.io.NumberInput;

/**
 * Benchmarks which compares the parseLong(..) method with the two different methods for parsing integer internally.
 * 
 */

public class LongNumberBenchmark {

    final static long L_BILLION = 1000000000;

	private static char[] n10 = "1234567891".toCharArray();
	private static char[] n11 = "12345678912".toCharArray();
	private static char[] n12 = "123456789123".toCharArray();
	private static char[] n13 = "1234567891234".toCharArray();
	private static char[] n14 = "12345678912345".toCharArray();
	private static char[] n15 = "123456789123456".toCharArray();
	private static char[] n16 = "1234567891234567".toCharArray();
	private static char[] n17 = "12345678912345678".toCharArray();
	private static char[] n18 = "123456789123456789".toCharArray();

	@Benchmark
	public long jackson10() {
		return NumberInput.parseLong(n10, 0, 10);
	}
	
	@Benchmark
	public long alternative10() {
		return parseLong(n10, 0, 10);
	}

	@Benchmark
	public long jackson11() {
		return NumberInput.parseLong(n11, 0, 11);
	}
	
	@Benchmark
	public long alternative11() {
		return parseLong(n11, 0, 11);
	}

	@Benchmark
	public long jackson12() {
		return NumberInput.parseLong(n12, 0, 12);
	}
	
	@Benchmark
	public long alternative12() {
		return parseLong(n12, 0, 12);
	}

	@Benchmark
	public long jackson13() {
		return NumberInput.parseLong(n13, 0, 13);
	}
	
	@Benchmark
	public long alternative13() {
		return parseLong(n13, 0, 13);
	}

	@Benchmark
	public long jackson14() {
		return NumberInput.parseLong(n14, 0, 14);
	}

	@Benchmark
	public long alternative14() {
		return parseLong(n14, 0, 14);
	}

	@Benchmark
	public long jackson15() {
		return NumberInput.parseLong(n15, 0, 15);
	}

	@Benchmark
	public long alternative15() {
		return parseLong(n15, 0, 15);
	}

	@Benchmark
	public long jackson16() {
		return NumberInput.parseLong(n16, 0, 16);
	}
	
	@Benchmark
	public long alternative16() {
		return parseLong(n16, 0, 16);
	}	

	@Benchmark
	public long jackson17() {
		return NumberInput.parseLong(n17, 0, 17);
	}

	@Benchmark
	public long alternative17() {
		return parseLong(n17, 0, 17);
	}		

	@Benchmark
	public long jackson18() {
		return NumberInput.parseLong(n18, 0, 18);
	}
	
	@Benchmark
	public long alternative18() {
		return parseLong(n18, 0, 18);
	}			

    public static long parseLong(char[] ch, int off, int len)
    {
        // Note: caller must ensure length is [10, 18]
        int len1 = len-9;
        long val = IntNumberBenchmark.parseInt(ch, off, len1) * L_BILLION;
        return val + (long) IntNumberBenchmark.parseInt(ch, off+len1, 9);
    }
    
}
