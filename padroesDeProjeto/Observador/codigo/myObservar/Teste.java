package myObservar;

public class Teste {

	public static void main(String[] args) {
		
		Escola e = new Escola();
		TelaPc tela = new TelaPc();
		TelaCelular cel = new TelaCelular();
		e.registerObserver(tela);
		e.registerObserver(cel);
		
		Aluno marilia = new Aluno(5.0, "12", "BD");
		
		marilia.nota = e.negativar(marilia, 1.0);
		
		
		
		
	}
}

