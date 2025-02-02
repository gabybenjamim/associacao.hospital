package hospital.teste;

import hospital.dominio.Consulta;
import hospital.dominio.Medico;
import hospital.dominio.Paciente;

public class HospitalTeste {
	public static void main(String[] args) {
		Medico medico = new Medico("Maria", "dermatologista");
		Paciente paciente1 = new Paciente("João Pedro",19);
		Consulta consulta1 = new Consulta("12/10", "14h10");
		
		Paciente paciente2 = new Paciente("João", 20);
		Consulta consulta2 = new Consulta("12/10", "15h30");
		
		
		Paciente[] pacientes = {paciente1, paciente2};
		Consulta[] consultasP1 = {consulta1};
		Consulta[] consultasP2 = {consulta2};
		
		
		medico.setPaciente(pacientes);

		paciente1.setConsulta(consultasP1);
		consulta1.setMedico(medico);
		consulta1.setPaciente(paciente1);		
		
		paciente2.setConsulta(consultasP2);
		consulta2.setMedico(medico);
		consulta2.setPaciente(paciente2);
		
		
		medico.imprime();
		
	}

}
