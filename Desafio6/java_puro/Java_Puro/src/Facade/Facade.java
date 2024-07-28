package Facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facade {
	
	public void migrarCliente(String nome, String cep) {
		
		String cidade = CepApi.getCepApi().recuperarCidade();
		String estado = CepApi.getCepApi().recuperarEstado();
		
		CrmService.gravarCliente(nome, cep, cidade, estado);

	}
}
