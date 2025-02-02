package hospital.dominio;

public class Paciente {
	private String nome;
	private int idade;
	private Medico medico;
	private Consulta[] consulta;
	
	public Paciente(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public Paciente(String nome, int idade, Medico medico) {
		this.nome = nome;
		this.idade = idade;
		this.medico = medico;
	}
	public Paciente(String nome, int idade, Medico medico, Consulta[] consulta) {
		this.nome = nome;
		this.idade = idade;
		this.medico = medico;
		this.consulta = consulta;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public Medico getMedico() {
		return medico;
	}
	
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	
	public Consulta[] getConsulta() {
		return consulta;
	}
	
	public void setConsulta(Consulta[] consulta) {
		this.consulta = consulta;
	}

}
