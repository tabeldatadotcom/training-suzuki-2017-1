package com.tabeldata.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "master_motor")
public class Motor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nama;
	private String aplikasi;
	
	public Motor() {
		
	}
	
	public Motor(String nama, String aplikasi) {
		this.nama = nama;
		this.aplikasi = aplikasi;
	}

	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getAplikasi() {
		return aplikasi;
	}
	public void setAplikasi(String aplikasi) {
		this.aplikasi = aplikasi;
	}
	
	

}
