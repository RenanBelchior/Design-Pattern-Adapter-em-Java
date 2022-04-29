package PadraoAdapter;


public class MinhaAplicacao {

	public static void main(String[] args) {
		//Target
		TomadaBrasileira tomadaBras = new TomadaBrasileira();
		
		//Adaptador
		PlugAmericano plugEUA = new PlugAmericano();
		
		AdapterEUAtoBrasil tomadaModificada = new AdapterEUAtoBrasil();
		String s = tomadaModificada.conecta(plugEUA);
		
		System.out.println(s);

	}

}
