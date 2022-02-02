package Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class BadWords {

	ArrayList<String> ar = new ArrayList<String>();
	void list1() {
		
		ar.add("Stupid");
		ar.add("Idiot");
		
		
	}
	
	public void replacebadwords() {
		Scanner sc = new Scanner(System.in);
		list1();
		System.out.println("Please Enter Any Word : ");
		String word = sc.nextLine();
		for(String word1 : ar) {
			word=word.replace(word1, "*****");
		}
		System.out.println(word);
	}
	public static void main(String[] args) {


		BadWords jv = new BadWords();
		jv.replacebadwords();
		
		
	}

}
