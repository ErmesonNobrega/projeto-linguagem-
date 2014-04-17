package logico;

import execoes.NomeInvalidoException;

public class Funcionario extends Pessoa{

    private String CPF;
    private String Ferias;
    private int Salario;

  public Funcionario(String nome,String dataNascimento,String sexo,String endereco, String email) throws Exception{
      super.setNome(nome);
      super.setDataNascimento(dataNascimento);
      super.setSexo(sexo);
      super.setEndereco(endereco);
      super.setEmail(email);
 }
 
 public String getCPF() {
      return CPF;
 }
  
 public void setCPF(String CPF) {
      this.CPF = CPF;
 }
 
 public String getFerias() {
		return Ferias;
 }
	
 public void setFerias(String Ferias) {
		this.Ferias = Ferias;
 }
 
 public int getSalario() {
		return Salario;
 }
	
 public void setSalario (int Salario) {
		this.Salario = Salario;
	}
}

