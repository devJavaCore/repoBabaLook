package br.com.babalook.model;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ContasAPagar {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer descricao;
	private BigDecimal valorBoleto;
	private BigDecimal valorPago;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataCadastro;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataVencimento;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataPagamento;
	private boolean valorLiquidado;

	@JoinColumn(unique = true)
	@OneToOne
	private TipoBoleto tipoBoleto;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDescricao() {
		return descricao;
	}

	public void setDescricao(Integer descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValorBoleto() {
		return valorBoleto;
	}

	public void setValorBoleto(BigDecimal valorBoleto) {
		this.valorBoleto = valorBoleto;
	}

	public BigDecimal getValorPago() {
		return valorPago;
	}

	public void setValorPago(BigDecimal valorPago) {
		this.valorPago = valorPago;
	}

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Calendar getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Calendar dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Calendar getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Calendar dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public boolean isValorLiquidado() {
		return valorLiquidado;
	}

	public void setValorLiquidado(boolean valorLiquidado) {
		this.valorLiquidado = valorLiquidado;
	}

	public TipoBoleto getTipoBoleto() {
		return tipoBoleto;
	}

	public void setTipoBoleto(TipoBoleto tipoBoleto) {
		this.tipoBoleto = tipoBoleto;
	}	
}
