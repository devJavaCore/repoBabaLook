package br.com.babalook.model;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String usuario;
	private String senha;
	private String email;
	private String rg;
	@Enumerated(EnumType.STRING)
	private Contrato contrato;
	@Enumerated(EnumType.STRING)
	private Departamento departamento;
	@Enumerated(EnumType.STRING)
	private Cargo cargo;
	@Enumerated(EnumType.STRING)
	private Escolaridade escolaridade;
	private String formação;
	private String ctps;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar horaEntrada;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar horaSaida;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar horaEntradaSabado;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar horaSaidaSabado;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataAdmissao;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataDemissao;
	@Enumerated(EnumType.STRING)
	private Calendar dataCadastro;
	@Enumerated(EnumType.STRING)
	private FollhaPagamento folhaPagamento;
	@Enumerated(EnumType.STRING)
	private HorarioTrabalho horarioTrabalho;
	private double Matricula;
	private String nomePai;
	private String  nomeMae;
	@Enumerated(EnumType.STRING)
	private EstadoCivil estadoCivil;
	private String nacionalidade;
	private String naturalidade;
	@Temporal(TemporalType.DATE)
	private Calendar dataNascimento;
	
	@JoinColumn(unique = true)
	@OneToOne
	private Pessoa pessoa;
	
	@OneToMany(mappedBy = "funcionario")
	private List<Beneficios> beneficios;

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Contrato getContrato() {
		return contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Escolaridade getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(Escolaridade escolaridade) {
		this.escolaridade = escolaridade;
	}

	public String getFormação() {
		return formação;
	}

	public void setFormação(String formação) {
		this.formação = formação;
	}

	public String getCtps() {
		return ctps;
	}

	public void setCtps(String ctps) {
		this.ctps = ctps;
	}

	
	public FollhaPagamento getFolhaPagamento() {
		return folhaPagamento;
	}

	public void setFolhaPagamento(FollhaPagamento folhaPagamento) {
		this.folhaPagamento = folhaPagamento;
	}

	public double getMatricula() {
		return Matricula;
	}

	public void setMatricula(double matricula) {
		Matricula = matricula;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Calendar getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(Calendar horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public Calendar getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(Calendar horaSaida) {
		this.horaSaida = horaSaida;
	}

	public Calendar getHoraEntradaSabado() {
		return horaEntradaSabado;
	}

	public void setHoraEntradaSabado(Calendar horaEntradaSabado) {
		this.horaEntradaSabado = horaEntradaSabado;
	}

	public Calendar getHoraSaidaSabado() {
		return horaSaidaSabado;
	}

	public void setHoraSaidaSabado(Calendar horaSaidaSabado) {
		this.horaSaidaSabado = horaSaidaSabado;
	}

	public Calendar getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Calendar dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public Calendar getDataDemissao() {
		return dataDemissao;
	}

	public void setDataDemissao(Calendar dataDemissao) {
		this.dataDemissao = dataDemissao;
	}

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}	
}
