package com.FindMaximumUsingGenerics;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {

	@Test
	public void givenMaxNumberAtFirstPostion_ReturnMaximumValue() {
		FindMaximum findMax = new FindMaximum();
		Integer result = findMax.findMax(9, 3, 5);
		Assert.assertSame(9, result);
	}
}
