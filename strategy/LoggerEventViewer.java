package br.padroes.strategy;

public class LoggerEventViewer implements Logger {

	@Override
	public void definirLog(Cliente cliente) {
		System.out.println("Registrando eventos no EventViewer");		
	}
	
	
	
//	@Override
//	public double calculaSalarioComImposto(Cliente umFuncionario) {
//		if (umFuncionario.getSalarioBase() > 2000) {
//			return umFuncionario.getSalarioBase() * 0.85;
//		}
//		return umFuncionario.getSalarioBase() * 0.9;
//	}
}
