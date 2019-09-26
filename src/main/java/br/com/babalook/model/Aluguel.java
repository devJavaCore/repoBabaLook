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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Aluguel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataAluguel;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataDevolução;
	private BigDecimal pagamentoSinal;
	private BigDecimal pagamentoRestante;
	private BigDecimal pagamentoConserto;
	private BigDecimal frete;
	private boolean devolvido;
	@Enumerated(EnumType.STRING)
	private FormaPagamento formaPagamento;
	private Integer desconto;
	private boolean parceria;
	private boolean cortesia;
	
	private String loginAluguel;
	private String FuncionarioAluguel;
	
	@JoinColumn(unique = true)
	@OneToMany
	private Produto produto;
	
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

	public Calendar getDataAluguel() {
		return dataAluguel;
	}

	public void setDataAluguel(Calendar dataAluguel) {
		this.dataAluguel = dataAluguel;
	}

	public Calendar getDataDevolução() {
		return dataDevolução;
	}

	public void setDataDevolução(Calendar dataDevolução) {
		this.dataDevolução = dataDevolução;
	}

	public BigDecimal getPagamentoSinal() {
		return pagamentoSinal;
	}

	public void setPagamentoSinal(BigDecimal pagamentoSinal) {
		this.pagamentoSinal = pagamentoSinal;
	}

	public BigDecimal getPagamentoRestante() {
		return pagamentoRestante;
	}

	public void setPagamentoRestante(BigDecimal pagamentoRestante) {
		this.pagamentoRestante = pagamentoRestante;
	}

	public BigDecimal getPagamentoConserto() {
		return pagamentoConserto;
	}

	public void setPagamentoConserto(BigDecimal pagamentoConserto) {
		this.pagamentoConserto = pagamentoConserto;
	}

	public BigDecimal getFrete() {
		return frete;
	}

	public void setFrete(BigDecimal frete) {
		this.frete = frete;
	}

	public boolean isDevolvido() {
		return devolvido;
	}

	public void setDevolvido(boolean devolvido) {
		this.devolvido = devolvido;
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

	public String getLoginAluguel() {
		return loginAluguel;
	}

	public void setLoginAluguel(String loginAluguel) {
		this.loginAluguel = loginAluguel;
	}

	public String getFuncionarioAluguel() {
		return FuncionarioAluguel;
	}

	public void setFuncionarioAluguel(String funcionarioAluguel) {
		FuncionarioAluguel = funcionarioAluguel;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
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
	
	

}
