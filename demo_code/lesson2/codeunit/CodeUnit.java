package lesson2.codeunit;

import javax.swing.JOptionPane;

public class CodeUnit {

	public static void main(String[] args){
		String s = "\ud835\udd6b";
		System.out.println(s + " length is " + s.length());
		System.out.println("0th code point: " + Integer.toHexString(s.codePointAt(0)));
		System.out.println("0th character: " + Integer.toHexString(s.charAt(0)));
	}
}
