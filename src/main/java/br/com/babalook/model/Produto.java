package br.com.babalook.model;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
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
public class Produto {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
		private String codigoDeBarras;
		private String nome;
		@Enumerated(EnumType.STRING)
		private Departamento departamento;
		@Enumerated(EnumType.STRING)
		private Cor cor;
		private Integer quantidade; //(Alerta de falta no estoque quando faltar)
		private String descricao;
		private boolean inativo;
		private boolean locacao;
		
		@JoinColumn(unique = true)
		@OneToOne
		private Fabricante fabricante;		
			
		@JoinColumn(unique = true)
		@ManyToOne
		Fornecedor fornecedor;
		
		@JoinColumn(unique = true)
		@ManyToOne
		private Categoria categoria;
		
		@JoinColumn(unique = true)
		@ManyToOne
		private Medida medida;
		
		@JoinColumn(unique = true)
		@ManyToOne
		private Tamanho tamanho;
				
		@JoinColumn(unique = true)
		@OneToMany(mappedBy = "Vendas")
		private List<Vendas> vendas;

	    public List<Vendas> getMovimentacoes() {
	    	return vendas;
	    }

	    public String getCodigoDeBarras() {
			return codigoDeBarras;
		}
		public void setCodigoDeBarras(String codigoDeBarras) {
			this.codigoDeBarras = codigoDeBarras;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public Departamento getDepartamento() {
			return departamento;
		}
		public void setDepartamento(Departamento departamento) {
			this.departamento = departamento;
		}
		public Cor getCor() {
			return cor;
		}
		public void setCor(Cor cor) {
			this.cor = cor;
		}
		public Integer getQuantidade() {
			return quantidade;
		}
		public void setQuantidade(Integer quantidade) {
			this.quantidade = quantidade;
		}
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		public boolean isInativo() {
			return inativo;
		}
		public void setInativo(boolean inativo) {
			this.inativo = inativo;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Fabricante getFabricante() {
			return fabricante;
		}

		public void setFabricante(Fabricante fabricante) {
			this.fabricante = fabricante;
		}

		public Fornecedor getFornecedor() {
			return fornecedor;
		}

		public void setFornecedor(Fornecedor fornecedor) {
			this.fornecedor = fornecedor;
		}

		public Categoria getCategoria() {
			return categoria;
		}

		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}

		public List<Vendas> getVendas() {
			return vendas;
		}

		public void setVendas(List<Vendas> vendas) {
			this.vendas = vendas;
		}

		public Medida getMedida() {
			return medida;
		}

		public void setMedida(Medida medida) {
			this.medida = medida;
		}

		public Tamanho getTamanho() {
			return tamanho;
		}

		public void setTamanho(Tamanho tamanho) {
			this.tamanho = tamanho;
		}
}
