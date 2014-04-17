package logico;
import java.util.LinkedList;
import java.util.List;


public class Treino {
	private String nome;
	private String descricao;
	private List<Exercicio> exercicio;
	
	public Treino(){
		exercicio = new LinkedList<Exercicio>();
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public List<Exercicio> getExercicio() {
		return exercicio;
	}
	public void setExercicio(List<Exercicio> exercicio) {
		this.exercicio = exercicio;
	}
	
}
