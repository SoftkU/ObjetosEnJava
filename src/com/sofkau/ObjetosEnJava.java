package com.sofkau;

import com.sofkau.clases.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class ObjetosEnJava {
	public static void main(String[] args) throws ParseException {
		System.out.println("Este es el primer taller de Cantera # 2\n\nObjetos:\n");
		System.out.println("DIAGRAMA DE SOFKA U\n");

		//Object Person
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date dateBirth = formato.parse("27/08/1988");
		Person personOne = new Person("Duhan Enrique","Renteria","Hernandez",dateBirth, 1.74f);
		System.out.println("\t \t"+personOne);
		//Object BankAccount
		BankAccount bankAccountOne = new BankAccount(8567866,true);
		System.out.println("\t \t"+bankAccountOne);
		//Object Fruit
		//ArrayList colorApple = new ArrayList<String> (){{ add("Verde"); add("Roja"); }};
		ArrayList colorApple = new ArrayList<String> ();
		colorApple.add("Verde");
		colorApple.add("Roja");
		Fruit fruitApple = new Fruit("Manzana", 450.0F,colorApple);
		System.out.println("\t \t"+fruitApple);

		System.out.println("\nOBJETOS ESTABLECIDOS POR DUHAN RENTERIA\n");
		//object Player
		Player playerOne = new Player("Alex","King","Sousa",dateBirth, (float) 1.74,"Bambinos FC","Volante de marca",14,15000000);
		System.out.println("\t \t"+playerOne);
		//Object Product
		Product productOne = new Product("Arroz Diana libra","Arroz por 500 gramos de la marca Diana",1850,true);
		System.out.println("\t \t"+productOne);
		Product productTwo = new Product("Arroz Diana 5 libras","Arroz por 5000 gramos de la marca Diana",8150,true);
		//System.out.println("\t \t"+productTwo);
		//Object Animal
		Animal animalCat = new Animal("Bengala","Copito",3);
		//System.out.println("\t \t"+animalCat);
		Animal animalDog = new Animal("Husky siberiano","Tony",2);
		System.out.println("\t \t"+animalDog);
	}
}
