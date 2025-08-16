package empresaIndustria;

import java.time.LocalDate;

public class Pessoa {
	private String nome;
	private LocalDate dataNascimento;
	
	public Pessoa(String nome, LocalDate dataNascimento) {
		setNome(nome);
		setDataNascimento(dataNascimento);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	

}
