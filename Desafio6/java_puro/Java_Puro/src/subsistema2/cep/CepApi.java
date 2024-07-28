package subsistema2.cep;

public class CepApi {

	private static CepApi instancia = new CepApi();
	
	private CepApi() {
		super();
	}
	
	public static CepApi getCepApi() {
		return instancia;
	}
	
	public String recuperarCidade() {
		return "Cidade";
	}
	
	public String recuperarEstado() {
		return "Estado";
	}
	
}
