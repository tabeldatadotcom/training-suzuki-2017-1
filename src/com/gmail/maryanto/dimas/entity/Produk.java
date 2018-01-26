package com.gmail.maryanto.dimas.entity;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUK")
@SequenceGenerator(name = "product_seq", sequenceName = "product_seq")
public class Produk {

	@Id
	@GeneratedValue(generator = "product_seq")
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

	@OneToOne
	@JoinColumn(name = "kategori_id")
	private Kategori kategori;

	public Long getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(Long uniqueId) {
		this.uniqueId = uniqueId;
	}

	public String getKode() {
		return kode;
	}

	public void setKode(String kode) {
		this.kode = kode;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public Date getTanggalBuat() {
		return tanggalBuat;
	}

	public void setTanggalBuat(Date tanggalBuat) {
		this.tanggalBuat = tanggalBuat;
	}

	public boolean isAktif() {
		return aktif;
	}

	public void setAktif(boolean aktif) {
		this.aktif = aktif;
	}

	public BigDecimal getHargaJual() {
		return hargaJual;
	}

	public void setHargaJual(BigDecimal hargaJual) {
		this.hargaJual = hargaJual;
	}
	
	

	public Kategori getKategori() {
		return kategori;
	}

	public void setKategori(Kategori kategori) {
		this.kategori = kategori;
	}

	@Override
	public String toString() {

		return String.format("{ id: %s, kode: %s, nama: %s, tanggal: %s, aktif: %s , kategori : { id: %s, nama: %s}}", this.uniqueId, this.kode,
				this.nama, this.tanggalBuat, this.aktif, this.kategori.getId(), this.kategori.getNama());
	}

}
