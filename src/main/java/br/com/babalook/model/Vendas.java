package br.com.babalook.model;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Vendas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataVenda;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataPrevistaEntrega;
	@Enumerated(EnumType.STRING)
	private FormaPagamento formaPagamento;
	private BigDecimal frete;
	private Integer desconto;
	private Integer  acrescimo;
	private BigDecimal precoVenda;
	private boolean parceria;
	private boolean cortesia;
	
	private String loginVenda;
	private String FuncionarioVenda;
	
	@JoinColumn(unique = true)
	@OneToMany
	private Produto produto;
	
	@JoinColumn(unique = true)
	@OneToMany
	private Servico servico;
	
	@JoinColumn(unique = true)
	@OneToOne
	private Pessoa cliente;

	@JoinColumn(unique = true)
	@OneToOne
	private Funcionario funcionario;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Calendar getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Calendar dataVenda) {
		this.dataVenda = dataVenda;
	}

	public Calendar getDataPrevistaEntrega() {
		return dataPrevistaEntrega;
	}

	public void setDataPrevistaEntrega(Calendar dataPrevistaEntrega) {
		this.dataPrevistaEntrega = dataPrevistaEntrega;
	}

	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public Integer getDesconto() {
		return desconto;
	}

	public void setDesconto(Integer desconto) {
		this.desconto = desconto;
	}

	public Integer getAcrescimo() {
		return acrescimo;
	}

	public void setAcrescimo(Integer acrescimo) {
		this.acrescimo = acrescimo;
	}

	public BigDecimal getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(BigDecimal precoVenda) {
		this.precoVenda = precoVenda;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public Pessoa getCliente() {
		return cliente;
	}

	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public BigDecimal getFrete() {
		return frete;
	}

	public void setFrete(BigDecimal frete) {
		this.frete = frete;
	}

	public boolean isParceria() {
		return parceria;
	}

	public void setParceria(boolean parceria) {
		this.parceria = parceria;
	}

	public boolean isCortesia() {
		return cortesia;
	}

	public void setCortesia(boolean cortesia) {
		this.cortesia = cortesia;
	}

	public String getLoginVenda() {
		return loginVenda;
	}

	public void setLoginVenda(String loginVenda) {
		this.loginVenda = loginVenda;
	}

	public String getFuncionarioVenda() {
		return FuncionarioVenda;
	}

	public void setFuncionarioVenda(String funcionarioVenda) {
		FuncionarioVenda = funcionarioVenda;
	}
	
	
}
