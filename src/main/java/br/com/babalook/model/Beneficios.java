package br.com.babalook.model;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Beneficios {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private BigDecimal valeTransporte;
	private BigDecimal valeRefeicao;
	private BigDecimal valeAlimentacao;
	private BigDecimal outros;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar data;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@JoinColumn(unique = true)
	@ManyToOne
	Funcionario funcionario;

	public BigDecimal getValeTransporte() {
		return valeTransporte;
	}

	public void setValeTransporte(BigDecimal valeTransporte) {
		this.valeTransporte = valeTransporte;
	}

	public BigDecimal getValeRefeicao() {
		return valeRefeicao;
	}

	public void setValeRefeicao(BigDecimal valeRefeicao) {
		this.valeRefeicao = valeRefeicao;
	}

	public BigDecimal getValeAlimentacao() {
		return valeAlimentacao;
	}

	public void setValeAlimentacao(BigDecimal valeAlimentacao) {
		this.valeAlimentacao = valeAlimentacao;
	}

	public BigDecimal getOutros() {
		return outros;
	}

	public void setOutros(BigDecimal outros) {
		this.outros = outros;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
}
