package br.com.babalook.model;

import java.math.BigDecimal;
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
public class ControleDeCaixa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Enumerated(EnumType.STRING)
	private TipoMovimentacaoCaixa tipoMovimentacaoCaixa; 
	private BigDecimal valor;
	private BigDecimal saldoCaixa;
	private String descricao;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar data;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public TipoMovimentacaoCaixa getTipoMovimentacaoCaixa() {
		return tipoMovimentacaoCaixa;
	}
	public void setTipoMovimentacaoCaixa(TipoMovimentacaoCaixa tipoMovimentacaoCaixa) {
		this.tipoMovimentacaoCaixa = tipoMovimentacaoCaixa;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public BigDecimal getSaldoCaixa() {
		return saldoCaixa;
	}
	public void setSaldoCaixa(BigDecimal saldoCaixa) {
		this.saldoCaixa = saldoCaixa;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	//(diminuir de acordo com pagamento a vista e retiradas no caixa, acrescentar de acordo que enjetem dinheiro no caixa)
	
	

}
