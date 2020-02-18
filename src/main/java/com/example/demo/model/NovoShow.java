package com.example.demo.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.NumberFormat;

@Entity
public class NovoShow {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@NotEmpty(message = "Nome Obrigatorio.")
	private String nomeEvento;
	
	
	private int capacidadeEvento;
	
	@NumberFormat(pattern = "#,##0.00")
	private BigDecimal valorEvento;
	
	@Temporal(TemporalType.DATE)
	private Date dataEvento;
	

	private String selecionarGenero;
	
	
	private String selecinarCasa;

	public String getNomeEvento() {
		return nomeEvento;
	}

	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}

	public int getCapacidadeEvento() {
		return capacidadeEvento;
	}

	public void setCapacidadeEvento(int capacidadeEvento) {
		this.capacidadeEvento = capacidadeEvento;
	}

	public BigDecimal getValorEvento() {
		return valorEvento;
	}

	public void setValorEvento(BigDecimal valorEvento) {
		this.valorEvento = valorEvento;
	}

	public Date getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(Date dataEvento) {
		this.dataEvento = dataEvento;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getSelecinarCasa() {
		return selecinarCasa;
	}

	public void setSelecinarCasa(String selecinarCasa) {
		this.selecinarCasa = selecinarCasa;
	}

	public String getSelecionarGenero() {
		return selecionarGenero;
	}

	public void setSelecionarGenero(String selecionarGenero) {
		this.selecionarGenero = selecionarGenero;
	}

	
}