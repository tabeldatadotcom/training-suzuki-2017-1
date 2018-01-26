package com.gmail.maryanto.dimas;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AplikasiUtama {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("contoh");
		EntityManager em = emf.createEntityManager();
		
		em.close();
		emf.close();
	}

}
