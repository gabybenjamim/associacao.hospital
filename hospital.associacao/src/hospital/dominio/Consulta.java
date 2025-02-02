package hospital.dominio;

public class Consulta {
	private String data;
	private String hora;
	private Paciente paciente;
	private Medico medico;
	
	public Consulta(String data, String hora) {
		this.data = data;
		this.hora = hora;
	}
	
	public Consulta(String data, String hora, Paciente paciente) {
		this.data = data;
		this.hora = hora;
		this.paciente = paciente;
	}
	
	public Consulta(String data, String hora, Paciente paciente, Medico medico) {
		this.data = data;
		this.hora = hora;
		this.paciente = paciente;
		this.medico = medico;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public String getHora() {
		return hora;
	}
	
	public void setHora(String hora) {
		this.hora = hora;
	}
	
	public Paciente getPaciente() {
		return paciente;
	}
	
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	public Medico getMedico() {
		return medico;
	}
	
	public void setMedico(Medico medico) {
		this.medico = medico;
	}

}
