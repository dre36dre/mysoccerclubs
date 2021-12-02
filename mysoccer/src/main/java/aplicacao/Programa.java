package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Clube;

public class Programa {
 public static void main(String[] args) {
	Clube c1= new Clube(null,"Palmeiras", "Allianz Park");
	Clube c2= new Clube(null,"Grêmio", "Arena do Grêmio");
	Clube c3= new Clube(null,"Atlêtico Paranaense", "Arena da Baixada");
	
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("mysoccerclubs");
	EntityManager em=emf.createEntityManager(); 
	
	Clube c=em.find(Clube.class,3);
	
	em.getTransaction().begin();
	em.remove(c);
	em.getTransaction().commit();
	
	System.out.println(c);
	
	
	
	/*
	em.getTransaction().begin();
	em.persist(c1);
	em.persist(c2);
	em.persist(c3);
	em.getTransaction().commit();
	*/
	
	System.out.println("Pronto");
	em.close();
	emf.close();
 }
}
