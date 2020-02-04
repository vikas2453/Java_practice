package com.fun.learning;

public class TestingClone {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Subject[] subjects =new Subject[]{new Subject(1,"Hindi"), new Subject(2,"English")};
		ShallowClone sc =new ShallowClone("Vikas", subjects);
		ShallowClone clonedboject = sc.clone();
		sc.name="Karna";
		sc.subjects[0]=new Subject(3, "Maths");
		System.out.println(sc);
		System.out.println("so you can see there is no change in the values of the menber of the cloned object, however there is change in the member reference");
		System.out.println(clonedboject);
		

	}

}
