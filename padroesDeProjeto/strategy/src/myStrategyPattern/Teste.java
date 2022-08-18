public class Teste {

	public static void main(String[] args) {
		
		Cliente veioDoRio = new Cliente();
		//	quero que o veioDoRio não tenha cartão
		veioDoRio.setPagamento(new PagamentoBoleto());
		veioDoRio.realizarPagamento();
		
		System.out.println("--------------------------------");
		
		//agora o veioDoRio fechou com a nubank
		veioDoRio.setPagamento(new PagamentoCartao());
		veioDoRio.realizarPagamento();
		//note que as linhas 10 e 16 sao identicas, mas os comportamentos 
		//sao diferentes
		
	}
	
}