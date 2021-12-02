package com.bilgeadam.boost.java.course01.lesson19;

import java.util.HashMap;
import java.util.Stack;

import com.bilgeadam.boost.java.course01.util.BAUtils;

public class RomanNumerials2Integer {
	
	static Stack<Character> stack = new Stack<>();
	static final HashMap<Character, Integer> ROMAN_LITERALS = new HashMap<Character, Integer>();
	
	public static void main(String[] args) {
		ROMAN_LITERALS.put('I', 1);
		ROMAN_LITERALS.put('V', 5);
		ROMAN_LITERALS.put('X', 10);
		ROMAN_LITERALS.put('L', 50);
		ROMAN_LITERALS.put('C', 100);
		ROMAN_LITERALS.put('D', 500);
		ROMAN_LITERALS.put('M', 1000);
		
		String roman = BAUtils.readString("Bir roma rakkamý girin (I, V, X, L, D, C, M)");
		int integer = convert(roman.toUpperCase());
		System.out.println(integer);
	}

	private static int convert(String roman) {
		int retVal = 0;
		
		for (int i = 0; i < roman.length(); i++) {
			stack.push(roman.charAt(i));
		}

		while (!stack.empty()) {
			int popped = convert(stack.pop());
			int peeked = 0;
			if (!stack.empty())
				peeked = convertWithMap(stack.peek());
			int num = calcNumber(popped, peeked);
			if (num > 0)
				retVal += num;
		}
		return retVal;
	}

	private static int convertWithMap(Character romanValue) {
		Integer val = ROMAN_LITERALS.get(romanValue);
		if (val != null)
			return val;
		else
			return -1;
	}
	
	private static int convert(Character romanValue) {
		int intValue = switch (romanValue) {
			case 'I': {
				yield 1;
			}
			case 'V': {
				yield 5;
			}
			case 'X': {
				yield 10;
			}
			case 'L': {
				yield 50;
			}
			case 'C': {
				yield 100;
			}
			case 'D': {
				yield 500;
			}
			case 'M': {
				yield 1000;
			}
			default: {
				yield -1;
			}
		};
		return intValue;
	}

	private static int calcNumber(int popped, int peeked) {
		int retVal = popped;
		if (popped > peeked && peeked != 0) {
			retVal = popped - peeked;
			stack.pop();
		}
		
		return retVal;
	}

}
