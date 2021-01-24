package com.xworkz.generalApptitude.string;

public class StringExam {
	public static void main(String[] args) {
		StringExam stringExam = new StringExam();
		char[] arrayOfChar = stringExam.charArray();
		for (int i = 0; i < arrayOfChar.length; i++) {
			System.out.println(arrayOfChar[i]);
		}
		System.out.println("-----------------------------------------------");
		String repl = stringExam.replace();
		System.out.println("replaced string:"+repl);
		System.out.println("-----------------------------------------------");
		String reverse = stringExam.reverse();
		System.out.println("reversed string"+reverse);
		System.out.println("-----------------------------------------------");
		boolean val = stringExam.palindrome();
		System.out.println(val);

	}

	public static char[] charArray() {
		String name = "balehosur Mala";
		char[] returnArray = name.toCharArray();
		return returnArray;
	}
     
	public String replace() {
		String msg = "Hi name,Welcome to string Execution";
		System.out.println("original string: "+msg);
		String replaced = msg.replace("name", "mala");
		return replaced;

	}

	public String reverse() {
		String place = "Hubli";
		System.out.println("original string: "+place);
		String rev = "";
		char[] ret = place.toCharArray();
		for (int j = place.length() - 1; j >= 0; j--)
			rev = rev + ret[j];
		return rev;

	}

	public boolean palindrome() {
		String place = "gadag";
		String rev = "";
		char[] ret = place.toCharArray();
		for (int j = place.length() - 1; j >= 0; j--)
			rev = rev + ret[j];
		if (place.equals(rev)) {
			System.out.print("palindrome :");
			return true;
		} else {
			System.out.print("palindrome :");
			return false;
		}
	}


}
