package myAntObserver;

import java.util.ArrayList;
import java.util.List;

public class Escola {

    private List<Aluno> alunos = new ArrayList<>();
	private Aluno a;
	
    public Escola (){
        
    }
	
	public void registerAluno(Aluno aluno){
        alunos.add(aluno);
	}
	
	public void removeAluno(Aluno aluno){
		int i = alunos.indexOf(aluno);
		if (i >= 0) {
			alunos.remove(i);
		}
	}
	
	public void notifyAlunos(double novaNota){
		for (int i = 0; i < alunos.size(); i++) {
			Aluno aluno = (Aluno)alunos.get(i);
			aluno.update(aluno, novaNota);
		}
	}
	
	public double negativar(Aluno a, double valor){
		
		a.nota = a.nota - valor;
		
		notifyAlunos(a.nota);
		return a.nota;
		
	}
    
}
