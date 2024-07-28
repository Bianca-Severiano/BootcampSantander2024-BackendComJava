package strategy;
public class Teste {
	
	public static void main(String[] args) {
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();

		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();

	}

}
