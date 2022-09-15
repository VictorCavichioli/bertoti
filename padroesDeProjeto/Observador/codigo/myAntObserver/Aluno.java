package myAntObserver;

public class Aluno {

    public double nota;
	public String frequencia;
	public String curso;
	
	public Aluno(double n, String f, String c){
		nota = n;
		frequencia = f;
		curso = c;
	}
    
    public void update(Aluno aluno, double nota){
        aluno.setNota(nota);
    };

    public void setNota(double nota){
        this.nota = nota;
    }
}
