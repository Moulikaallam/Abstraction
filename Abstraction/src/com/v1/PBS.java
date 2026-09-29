package com.v1;

public class PBS extends JNTUK_Uni{
	void exam(int minInternals, String Syllabus, String Duration) {
		int external = 59;
		int total = minInternals + external;
		
		System.out.println("PBS Engineering College");
		System.out.println("Total Marks= "+total);
		System.out.println("Syllabus: "+Syllabus);
		System.out.println("Duration: "+Duration);
	}
}
