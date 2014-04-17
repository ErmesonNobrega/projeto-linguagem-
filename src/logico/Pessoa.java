package logico;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import execoes.EmailInvalidoException;
import execoes.NomeInvalidoException;

public class Pessoa{
    
    private String nome;
	private String dataNascimento;
	private String endereco;
	private long telefone;
	private String email;
	private String sexo;
	private String dataCadastro;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) throws NomeInvalidoException {
		if(validarNome(nome)){
			NomeInvalidoException exception = new NomeInvalidoException("O nome possui números");
			throw exception;
		}
		this.nome = nome;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public long getTelefone() {
		return telefone;
	}
	
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) throws EmailInvalidoException {
		if(validarEmail(email)){
			this.email = email;
		}else{
			EmailInvalidoException exception = new EmailInvalidoException("Email inválido");
			throw exception;
		}
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getDataCadastro() {
		return dataCadastro;
	}
	
	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	protected boolean validarNome(String nome){
		boolean temNumero = false;
		char[] letras = nome.toCharArray();
		for(int i =0; i < letras.length ;i++){
			if(letras[i] >= '0' && letras[i] <='9'){
				temNumero = true;
				break;
			}
		}
		return temNumero;
	}
	
	protected boolean validarEmail(String email){
		Pattern p = Pattern.compile(".+@.+\\.[a-z]+");  
		Matcher m = p.matcher(email); 
		return m.matches();    
	}
}
    


