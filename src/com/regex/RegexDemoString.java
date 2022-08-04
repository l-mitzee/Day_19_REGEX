package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemoString {

	private static String REGEX = "a*b";
	private static String INPUT = "aaaaabbbbbbbbfffffooobbbbaaabababababa";
	private static String REPLACE = "-";
	public static void main(String[] args) {
		Pattern p = Pattern.compile(REGEX);
		Matcher m = p.matcher(INPUT);
		StringBuffer st = new StringBuffer();
		
//		while(m.find()) {
//		m.appendReplacement(st, REPLACE);
//		
//		}
//
		m.appendTail(st);
		System.out.println(st.toString());
//		}

	}

}
