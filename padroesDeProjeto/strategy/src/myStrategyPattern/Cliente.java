

//O que eh um Design Pattern, ou Padrao de Projetos?
//Um Padrao de Projetos eh uma solucao arquitetural para resolver
//um problema comum

//Exemplo: Problema de duplicacao de codigo com a heranca (veja package antipattern)
//Solucao: Design Patter Strategy
//Definicao: o Strategy ele ***encapsula*** algoritmos (como o de emprestimo) e os
//torna ***intercambiaveis*** (para torna-los intercabiaveis, usa polimorfismo).


public class Cliente {

	private Pagamento pagamento; //aqui o polimorfismo
	
	public void setPagamento(Pagamento pagamento){//argumento polimorfico
		this.pagamento = pagamento;
	}
	
	public void realizarPagamento() {
		this.pagamento.pagar();
	}
	
}