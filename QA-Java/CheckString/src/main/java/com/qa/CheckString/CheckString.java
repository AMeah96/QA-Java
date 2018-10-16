package com.qa.CheckString;

public class CheckString {
	public String hardCodedWord = "Hello";

	public boolean checkString(String str) {
		if (str.equals(hardCodedWord)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkStrings(String str1, String str2) {
		if (str1.equals(str2)) {
			return true;
		} else {
			return false;
		}
	}
}
