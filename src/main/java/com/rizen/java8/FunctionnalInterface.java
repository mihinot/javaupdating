package com.rizen.java8;

interface Gabs {
	int sous(int a, int b);
}

public class FunctionnalInterface {

	public static void main(String[] args) {
		
		InterfaceFonctionnel lambda = () -> {
		    System.out.println("Calculatrice");
		};
		
		InterfaceFonctionnel obj = Object::new;
		System.out.println(obj.addition(10, 13));
		
		lambda.show();
		
		Prenom prenom = (String s) -> {
			System.out.println("Hello " + s);
		};
		
		prenom.showPrenom("Arsène");
		
		
		Gabs gabs = InterfaceFonctionnel::soustraction;
		System.out.println( gabs.sous(10, 11) );
	}

}

interface Prenom {
	void showPrenom(String prenom);
}


interface InterfaceFonctionnel {
	public void show();

	public default int addition(int a, int b) {
		return a + b;
	}

	public static int soustraction(int a, int b) {
		return a - b;
	}
}
