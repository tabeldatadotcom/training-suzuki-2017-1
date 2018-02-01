package com.tabeldata.example.entity;

public class Motor {
	
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
