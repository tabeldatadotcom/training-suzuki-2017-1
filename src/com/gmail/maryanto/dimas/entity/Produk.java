package com.gmail.maryanto.dimas.entity;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUK")
public class Produk {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "data_unique")
	private Long uniqueId;
	
	@Column(name = "kode_produk", unique = true, nullable = false)
	private String kode;
	
	@Column(name = "nama_produk", nullable = false, length = 50)
	private String nama;
	
	@Column(name = "tanggal_buat", nullable = false)
	private Date tanggalBuat;
	
	@Column(name = "status_aktif", nullable = false) 
	private boolean aktif;
	
	@Column(name = "harga_jual")
	private BigDecimal hargaJual;

}
