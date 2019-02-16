package com.github.skjolber.jackson;

import org.openjdk.jmh.annotations.Benchmark;

import com.fasterxml.jackson.core.io.NumberInput;

/**
 * 
 * Benchmarks which compares the parseInt(..) method.
 * 
 */


public class IntNumberBenchmark {

	private static char[] n1 = "1".toCharArray();
	private static char[] n2 = "12".toCharArray();
	private static char[] n3 = "123".toCharArray();
	private static char[] n4 = "1234".toCharArray();
	private static char[] n5 = "12345".toCharArray();
	private static char[] n6 = "123456".toCharArray();
	private static char[] n7 = "1234567".toCharArray();
	private static char[] n8 = "12345678".toCharArray();
	private static char[] n9 = "123456789".toCharArray();

	@Benchmark
	public int jackson1() {
		return NumberInput.parseInt(n1, 0, 1);
	}
	
	@Benchmark
	public int alternative1() {
		return parseInt(n1, 0, 1);
	}

	@Benchmark
	public int jackson2() {
		return NumberInput.parseInt(n2, 0, 2);
	}
	
	@Benchmark
	public int alternative2() {
		return parseInt(n2, 0, 2);
	}

	@Benchmark
	public int jackson3() {
		return NumberInput.parseInt(n3, 0, 3);
	}
	
	@Benchmark
	public int alternative3() {
		return parseInt(n3, 0, 3);
	}

	@Benchmark
	public int jackson4() {
		return NumberInput.parseInt(n4, 0, 4);
	}

	@Benchmark
	public int alternative4() {
		return parseInt(n4, 0, 4);
	}

	@Benchmark
	public int jackson5() {
		return NumberInput.parseInt(n5, 0, 5);
	}

	@Benchmark
	public int alternative5() {
		return parseInt(n5, 0, 5);
	}

	@Benchmark
	public int jackson6() {
		return NumberInput.parseInt(n6, 0, 6);
	}
	
	@Benchmark
	public int alternative6() {
		return parseInt(n6, 0, 6);
	}	

	@Benchmark
	public int jackson7() {
		return NumberInput.parseInt(n7, 0, 7);
	}

	@Benchmark
	public int alternative7() {
		return parseInt(n7, 0, 7);
	}		

	@Benchmark
	public int jackson8() {
		return NumberInput.parseInt(n8, 0, 8);
	}
	
	@Benchmark
	public int alternative8() {
		return parseInt(n8, 0, 8);
	}			

	@Benchmark
	public int jackson9() {
		return NumberInput.parseInt(n9, 0, 9);
	}
	
	@Benchmark
	public int alternative9() {
		return parseInt(n9, 0, 9);
	}			

    public static int parseInt(char[] ch, int off, int len)
    {
        int num = ch[off + len - 1] - '0';
        
        switch(len) {
        case 9: 
            num += (ch[off++] - '0') * 100000000;
        case 8: 
            num += (ch[off++] - '0') * 10000000;
        case 7: 
            num += (ch[off++] - '0') * 1000000;
        case 6: 
            num += (ch[off++] - '0') * 100000;
        case 5: 
            num += (ch[off++] - '0') * 10000;
        case 4: 
            num += (ch[off++] - '0') * 1000;
        case 3: 
            num += (ch[off++] - '0') * 100;
        case 2: 
            num += (ch[off] - '0') * 10;
        }
        return num;
    }	
    
}
