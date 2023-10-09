package org.inm;

public class InternEducation extends InternDetail {

	public void ugDegree() {
		System.out.println("BE");

	}
	public void ugPercentage() {
		System.out.println("83%");

	}
	public static void main(String[] args) {
		InternEducation i=new InternEducation();
		i.internName();
		i.registeredInternship();
		i.internshipDuration();
		i.ugDegree();
		i.ugPercentage();
	}
}
