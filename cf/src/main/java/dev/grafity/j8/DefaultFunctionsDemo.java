package dev.grafity.j8;

import java.util.List;

public interface DefaultFunctionsDemo {
	int findSum(List<Integer> ages);
	default int sum(int one,int two) {
		return one+two;
	}
}
