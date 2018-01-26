package com.gmail.maryanto.dimas;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.gmail.maryanto.dimas.entity.Produk;

public class AplikasiUtama {
	
	public static void main(String[] args) {
		
		Produk p001 = new Produk();
//		p001.setKode("p001");
//		p001.setNama("Suzuki Ignis");
//		p001.setTanggalBuat(Date.valueOf(LocalDate.now()));
//		p001.setHargaJual(new BigDecimal("130000000"));
//		p001.setAktif(true);
		
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("contoh");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		p001 = em.find(Produk.class, 1l);
		p001.setNama("Suzuki ERTIGA");
		p001.setHargaJual(new BigDecimal("135000000"));
		
		em.merge(p001);
	
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
