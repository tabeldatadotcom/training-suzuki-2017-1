package com.gmail.maryanto.dimas;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.gmail.maryanto.dimas.entity.Kategori;
import com.gmail.maryanto.dimas.entity.Produk;

public class AplikasiUtama {
	
	public static void main(String[] args) {
		
		Produk p001 = new Produk();
		p001.setKode("p002");
		p001.setNama("Suzuki Ignis");
		p001.setTanggalBuat(Date.valueOf(LocalDate.now()));
		p001.setHargaJual(new BigDecimal("140000000"));
		p001.setAktif(false);
		
		Kategori k = new Kategori();
		k.setNama("Mobil");
		
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("contoh");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		k = em.find(Kategori.class, 1);
		p001.setKategori(k);
		em.persist(p001);
		
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
