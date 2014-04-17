package logico;
import java.util.*;

public class Academia{
    private String nome;
    private Aluno[]alunos;
    private Funcionario[]funcionarios;
    private int contadorAluno;
    private int contadorFuncionario;
    
    public Academia(String nome){
        this.nome = nome;
        contadorAluno = 0;
        contadorFuncionario = 0;
        alunos = new Aluno[100];
        funcionarios = new Funcionario[100];
   

    }

   public void cadastrarAluno(Aluno novoAluno){
        
        for (Aluno alunoAntigo : alunos){
            
            if((alunoAntigo != null) &&
                (alunoAntigo.getMatricula() == novoAluno.getMatricula())){
                return;
            }
            
        }
        
        alunos[contadorAluno++] = novoAluno;
        
    }
    
   public Aluno[] getAlunos(){
        return alunos;
    }
    
   public Aluno pesquisaAluno(String nome){
        
        for(int x = 0; x<alunos.length; x++){
            if(alunos[x].getNome().equals(nome)){
                return alunos[x];
            }
        }
        return null;
    }

   public void removerAluno(String nome) {   
        for(int x =0 ; x<contadorAluno; x++){
            if(alunos[x].getNome().equals(nome)){
                alunos[x]=null;
            }
        }
        contadorAluno--;
    }

   public void cadastrarFuncionario(Funcionario novoFuncionario){
        
        for (Funcionario funcionarioAntigo : funcionarios){
            
            if((funcionarioAntigo != null) &&
                (funcionarioAntigo.getNome() == novoFuncionario.getNome())){
                return;
            }
            
        }
        
        funcionarios[contadorFuncionario++] = novoFuncionario;
    }
    
    public Funcionario[] getFuncionarios(){
        return funcionarios;
    }
    
    public Funcionario pesquisaFuncionarios(String nome){
        
        for(int x = 0; x<funcionarios.length; x++){
            if(funcionarios[x].getNome().equals(nome)){
                return funcionarios [x];
            }
        }
        return null;
    }
    
    public void removerFuncionario(String nome){
        for(int x =0 ; x<contadorFuncionario; x++){
            if(funcionarios[x].getNome().equals(nome)){
                funcionarios[x]=null;
            }
        }
        contadorFuncionario--;
    }
    
}
