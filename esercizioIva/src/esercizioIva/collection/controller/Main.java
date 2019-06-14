package esercizioIva.collection.controller;


//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
import esercizioIva.collection.classes.Prodotto;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;


public class Main {
public static void main(String[] args) {
	
	Prodotto p1 = new Prodotto ("Agrumi, caffè", 4);
	Prodotto p2 = new Prodotto ("Bergamotto", 10);
	Prodotto p3 = new Prodotto ("Animavi vivi e api, alberi (da bosco, frutto o ornamento)", 10);
	Prodotto p4 = new Prodotto ("Apparecchi ortopedici e autoveicoli per disabili", 4);	
	
	ArrayList<Prodotto> listino = new ArrayList<>();
	 
	//Size of arrayList
	//System.out.println("Size of ArrayList at creation: " + listino.size());
	 
	listino.add(p1);
	listino.add(p2);
	listino.add(p3);
	listino.add(p4);
	  

	  System.out.println("Quale prodotto?");
	  Scanner scanner = new Scanner(System.in);
	  String inputString = scanner.nextLine();
//	  System.out.println("è " + inputString);
	  
	  for(int i=0; i <listino.size(); i++) 
	  {
		  if (listino.get(i).getNomeProdotto().contains(inputString)==true)
		  {System.out.println(listino.get(i).getNomeProdotto() + ", iva corrispondente " +listino.get(i).getIvaProdotto());}
	  }
	  
//	  System.out.println("Size of ArrayList at creation: " + listino.size());
//	  System.out.println("il prodotto è " + listino.get(1).getNomeProdotto());
//	  System.out.println("il prodotto è " + listino.get(0).getIvaProdotto());
	  
	  System.out.println("\n I = " + listino.get(0).getNomeProdotto() + ", iva corrispondente " +listino.get(0).getIvaProdotto());
	  System.out.println("II = " + listino.get(1).getNomeProdotto() + ", iva corrispondente " +listino.get(1).getIvaProdotto());
	  System.out.println("III =  " + listino.get(2).getNomeProdotto() + ", iva corrispondente " +listino.get(2).getIvaProdotto());
	  System.out.println("IV = " + listino.get(3).getNomeProdotto() + ", iva corrispondente " +listino.get(3).getIvaProdotto());

	  Collections.sort(listino, new Comparator<Prodotto>() {
	        @Override
	        public int compare(Prodotto a, Prodotto b)
	        {

	            return  a.getNomeProdotto().compareTo(b.getNomeProdotto());
	        }
	    });  

	  System.out.println("\n I = " + listino.get(0).getNomeProdotto() + ", iva corrispondente " +listino.get(0).getIvaProdotto());
	  System.out.println("II = " + listino.get(1).getNomeProdotto() + ", iva corrispondente " +listino.get(1).getIvaProdotto());
	  System.out.println("III = " + listino.get(2).getNomeProdotto() + ", iva corrispondente " +listino.get(2).getIvaProdotto());
	  System.out.println("IV = " + listino.get(3).getNomeProdotto() + " " +listino.get(3).getIvaProdotto());

	  Collections.reverse(listino);
	  
	  System.out.println("\n I = " + listino.get(0).getNomeProdotto() + ", iva corrispondente " +listino.get(0).getIvaProdotto());
	  System.out.println("II = " + listino.get(1).getNomeProdotto() + ", iva corrispondente " +listino.get(1).getIvaProdotto());
	  System.out.println("III = " + listino.get(2).getNomeProdotto() + ", iva corrispondente " +listino.get(2).getIvaProdotto());
	  System.out.println("IV = " + listino.get(3).getNomeProdotto() + " " +listino.get(3).getIvaProdotto());
	  
	  //Collections.sort(listino, new Comparator<Prodotto>() {
	  //    @Override
	  //  	public int compare(Prodotto a, Prodotto b)
	  //	{
	  //
	  //  		return  a.getIvaProdotto.compareTo(b.getIvaProdotto);
	  //   	}
	  //});  

	  //System.out.println("\n I = " + listino.get(0).getNomeProdotto() + " " +listino.get(0).getIvaProdotto());
	  //System.out.println("II = " + listino.get(1).getNomeProdotto() + " " +listino.get(1).getIvaProdotto());
	  //System.out.println("III = " + listino.get(2).getNomeProdotto() + " " +listino.get(2).getIvaProdotto());
	  //System.out.println("IV = " + listino.get(3).getNomeProdotto() + " " +listino.get(3).getIvaProdotto());


	}

	
}
