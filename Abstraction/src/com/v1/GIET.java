package com.v1;

public class GIET extends JNTUK_Uni {
	void exam(int minInternals, String Syllabus, String Duration) {
		int labs = 15;
		int external = 48;
		int total = minInternals + external+labs;
		
		System.out.println("GIET Engineering College");
		System.out.println("Total Marks= "+total);
		System.out.println("Syllabus: "+Syllabus);
		System.out.println("Duration: "+Duration);
	}
}
