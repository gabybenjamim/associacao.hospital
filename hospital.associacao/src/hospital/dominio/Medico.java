package hospital.dominio;

public class Medico {
	private String nome;
	private String especialidade;
	private Paciente[] paciente;
	
	public Medico(String nome, String especialidade) {
		this.nome = nome;
		this.especialidade = especialidade;
	}
	
	public Medico(String nome, String especialidade, Paciente[] paciente) {
		this.nome = nome;
		this.especialidade = especialidade;
		this.paciente = paciente;
	}
	
	public void imprime() {
		System.out.println("--- MEDICO ---");
		System.out.println("Nome: "+this.nome+", especialidade: "+this.especialidade);
		if(paciente == null) return;
		System.out.println();
		System.out.println("--- PACIENTE  ---");
		for(Paciente pacientes: paciente) {
			System.out.println("nome: "+pacientes.getNome()+", idade: "+pacientes.getIdade());
			for(Consulta consultas: pacientes.getConsulta()) {
				System.out.println("data: "+consultas.getData()+", hora: "+consultas.getHora());
			}
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEspecialidade() {
		return especialidade;
	}
	
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	public Paciente[] getPaciente() {
		return paciente;
	}
	
	public void setPaciente(Paciente[] paciente) {
		this.paciente = paciente;
	}

}
