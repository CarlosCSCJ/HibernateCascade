package principal;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import modelo.Arma;
import modelo.Personaje;

public class Principal {
	
	public static void main(String[] args) {
		
		//Añadir un personaje sin arma
//		Personaje personaje1 = new Personaje("1", "Carlos", null);
//		
//    	SessionFactory sf = new Configuration().configure().buildSessionFactory();
//    	Session session = sf.openSession();
//    	Transaction t = session.beginTransaction();
//
//    	session.save(personaje1);
//    	
//    	t.commit();
//    	session.close();
    	
		//Añadir un personaje con arma
//		Personaje personaje1 = new Personaje("personaje1", "Carlos", null);
//		
//		List<Personaje> listaPersonajesArma1 = new ArrayList<Personaje>();
//		listaPersonajesArma1.add(personaje1);
//		Arma arma1 = new Arma("arma1", listaPersonajesArma1);
//		
//		personaje1.setArma(arma1);
//		
//		
//    	SessionFactory sf = new Configuration().configure().buildSessionFactory();
//    	Session session = sf.openSession();
//    	Transaction t = session.beginTransaction();
//
//    	session.save(personaje1);
//    	
//    	t.commit();
//    	session.close();
    	
    	
	}

}
