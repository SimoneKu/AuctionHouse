package com.the.simone.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(schema="public", name = "carta")
public class Carta {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nome;
	private String codice;
	private String condizioni;
	private String gradata;
	private double prezzo;
	private String giorno;
	private String anno;
	private String mese;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	public String getCondizioni() {
		return condizioni;
	}
	public void setCondizioni(String condizioni) {
		this.condizioni = condizioni;
	}
	public String getGradata() {
		return gradata;
	}
	public void setGradata(String gradata) {
		this.gradata = gradata;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public String getGiorno() {
		return giorno;
	}
	public void setGiorno(String giorno) {
		this.giorno = giorno;
	}
	public String getAnno() {
		return anno;
	}
	public void setAnno(String anno) {
		this.anno = anno;
	}
	public String getMese() {
		return mese;
	}
	public void setMese(String mese) {
		this.mese = mese;
	}
	public Carta() {
		super();
	}
	public Carta(Long id, String nome, String codice, String condizioni, String gradata, double prezzo) {
		super();
		this.id = id;
		this.nome = nome;
		this.codice = codice;
		this.condizioni = condizioni;
		this.gradata = gradata;
		this.prezzo = prezzo;
	}
	
	
	

}
