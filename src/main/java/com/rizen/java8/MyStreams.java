package com.rizen.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyStreams {

	public static void main(String[] args) {
		
		List<Number> maListe = Arrays.asList(1.2, 2.5, 3.0, 4, 5);
		
		System.out.println("Rajoute +1 � chaque �l�ment de ma liste :");
        maListe.stream().map( x -> x.doubleValue() ).forEach(System.out::println);
        
        
        System.out.println( "\nSomme total des �l�ments de ma liste : " );
        System.out.println( maListe.stream()
        		.map( x -> x.doubleValue() )
        		.reduce(0.0, Double::sum) );
        
        
        System.out.println( "\nTotal : " + maListe.stream().mapToInt(Lambdas::intValue).sum() );
        
        
        System.out.println("\nListe paire :");
        List<Integer> maListePaire = maListe.stream()
        		.filter(x -> x.intValue() % 2 == 0)
        		.mapToInt(Number::intValue).boxed().collect(Collectors.toList());
        
        maListe.stream().filter(x -> x.intValue() % 2 == 0).forEach(System.out::println);
        
	}
}



// map		: effectuer des operations
// filter	: filtrer les donn�es sur le pr�dicat
// reduce	: recolter les r�sultats
// sorted	: trier des listes
// collect	: effectuer des op�rations interm�diaires sur une liste
// forEach	: parcourir le flux

