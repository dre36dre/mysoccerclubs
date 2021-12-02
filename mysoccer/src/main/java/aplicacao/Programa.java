package aplicacao;

import dominio.Clube;

public class Programa {
 public static void main(String[] args) {
	Clube c1= new Clube(1,"Palmeiras", "Allianz Park");
	Clube c2= new Clube(2,"Grêmio", "Arena do Grêmio");
	Clube c3= new Clube(3,"Atlêtico Paranaense", "Arena da Baixada");
	
	System.out.println(c1);
	System.out.println(c2);
	System.out.println(c3);
	
 }
}
