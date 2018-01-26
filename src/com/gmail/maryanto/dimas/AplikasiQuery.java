package com.gmail.maryanto.dimas;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.gmail.maryanto.dimas.entity.Produk;

public class AplikasiQuery {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contoh");
		EntityManager em = emf.createEntityManager();

		Query query = em.createQuery("select p from Produk p where p.kode = :kodeProduk");
		query.setParameter("kodeProduk", "p002");
		Produk produk = (Produk) query.getSingleResult();

		System.out.println(produk.toString());

		em.close();
		emf.close();
	}
}
