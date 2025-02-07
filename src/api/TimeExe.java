package com.yedam.api;

public class TimeExe {
	public static void main(String[] args) {
		// ?분 ?초 합은 ? 입니다. 출력.
		// 1부터 10000000000(백억) 까지 250의 배수의 합을 구하는 시간.
		long sum = 0;
		long start, end = 0;
		start = System.currentTimeMillis();
		for (long i = 1; i <= 10000000000l; i++) {
			if (i % 250 == 0)
				sum += i;
		}
		end = System.currentTimeMillis();
		long jobTime = (end - start) / 1000; // 1/1000 초 => 초 환산.
		long min = jobTime / 60; // 걸린시간(분).
		long sec = jobTime % 60; // 걸린시간(초).
		System.out.printf("%d분 %d초, 합: %d\n", min, sec, sum);
//      248756216094527346 => 201
//		24987508753123251  => 2001
//		2499879993750300   => 20001
//		249996249975000    => 200001
//		24995012497500     => 2000001
//		2495000124750      => 20000001
//		200000005000000000 => 250
//		9220000000000000000=> long형
		System.out.println("end of prog.");
	}
}
