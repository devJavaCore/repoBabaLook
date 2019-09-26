package br.com.babalook.model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String  cpf;
	@Enumerated(EnumType.STRING)
	private Sexo sexo;
	private String email;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar data;
	private String telefone;
	
		
	public Pessoa(String nome, Sexo sexo, String telefone) {
		this(nome, null, sexo, null, telefone);
	}
	public Pessoa(String nome,Sexo sexo, String email, String telefone) {
		this(nome, null, sexo, email, telefone);
	}
	public Pessoa(String nome, String cpf, Sexo sexo, String email, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
		this.data = data;
		this.email = email;
		this.telefone = telefone;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}