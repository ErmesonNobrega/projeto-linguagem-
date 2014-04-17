package logico;



import execoes.EmailInvalidoException;
import execoes.MatriculaInvalidaException;
import execoes.NomeInvalidoException;


public class Aluno extends Pessoa{
    
    
    private boolean ativo;
	private int matricula;
	
	public Aluno(){}
	public Aluno(String nome,int matricula,String dataNascimento,String sexo,String endereco, String email) throws NomeInvalidoException,EmailInvalidoException{
		super.setNome(nome);
		super.setDataNascimento(dataNascimento);
		super.setSexo(sexo);
		super.setEndereco(endereco);
		super.setEmail(email);
		this.matricula = matricula;
		
	}
	
	public boolean getAtivo() {
		return ativo;
	}
	
	public void setAtivo(boolean ativo){
		this.ativo = ativo;
	}
		
	public long getMatricula() {
		return matricula;
	}
	
	
	public void setMatricula(int matricula) throws MatriculaInvalidaException {
		if(matricula <= 0 ){
			MatriculaInvalidaException exception = new MatriculaInvalidaException("Matrícula inválida"); 
			throw exception;
		}
		this.matricula = matricula;
	}
	
	public String getNome() {
		return super.getNome();
	}
	
	public void setNome(String nome) throws NomeInvalidoException {
		super.setNome(nome);
	}
	
	
}	