package com.mvc.patterns.mvcpatterns.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.mvc.patterns.mvcpatterns.model.interfaces.Pagamento;

@Entity
public class Aluno {

	@Id
	private Integer id;

	@Column
    public double nota;

	@Column
	public String frequencia;

	@Column
	public String curso;

	private Pagamento pagamento;
	
	public Aluno(double n, String f, String c){
		this.nota = n;
		this.frequencia = f;
		this.curso = c;
	}

	public void setPagamento(Pagamento pagamento){//argumento polimorfico
		this.pagamento = pagamento;
	}
	
	public void realizarPagamento() {
		this.pagamento.pagar();
	}
}
