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

	@Test
	public void givenMaxNumberAtSeondPostion_ReturnMaximumValue() {
		FindMaximum findMax = new FindMaximum();
		Integer result = findMax.findMax(3, 9, 5);
		Assert.assertSame(9, result);
	}

	@Test
	public void givenMaxNumberAtThirdPostion_ReturnMaximumValue() {
		FindMaximum findMax = new FindMaximum();
		Integer result = findMax.findMax(5, 3, 9);
		Assert.assertSame(9, result);
	}

	@Test
	public void givenFloatMaxNumberAtFirstPostion_ReturnMaximumValue() {
		FindMaximum findMax = new FindMaximum();
		Float result = findMax.findMax(9.0f, 3.0f, 5.0f);
		System.out.println(result);
		Assert.assertEquals(9.0, result);
	}

	@Test
	public void givenFloatMaxNumberAtSeondPostion_ReturnMaximumValue() {
		FindMaximum findMax = new FindMaximum();
		float result = findMax.findMax(3.0f, 9.0f, 5.0f);
		Assert.assertEquals(9.0, result);
	}

	@Test
	public void givenFloatMaxNumberAtThirdPostion_ReturnMaximumValue() {
		FindMaximum findMax = new FindMaximum();
		Float result = findMax.findMax(5.0f, 3.0f, 9.0f);
		Assert.assertEquals(9.0, result);
	}

	@Test
	public void givenStirngMaxNumberAtFirstPostion_ReturnMaximumValue() {
		FindMaximum findMax = new FindMaximum();
		String result = findMax.findMax("Peach", "Apple", "Banana");
		System.out.println(result);
		Assert.assertEquals("Peach", result);
	}

	@Test
	public void givenStringMaxNumberAtSeondPostion_ReturnMaximumValue() {
		FindMaximum findMax = new FindMaximum();
		String result = findMax.findMax("Apple", "Peach", "Banana");
		Assert.assertEquals("Peach", result);
	}

	@Test
	public void givenStringMaxNumberAtThirdPostion_ReturnMaximumValue() {
		FindMaximum findMax = new FindMaximum();
		String result = findMax.findMax("Apple", "Banana", "Peach");
		Assert.assertEquals("Peach", result);
	}
}
