package ListaDuplamenteLigada;

public class TestaListaLigada {

	public static void main(String[] args) {
		
		ListaDuplamenteLigada lista = new ListaDuplamenteLigada();
		
		
		lista.adicionaNoComeco("mauricio");
		System.out.println(lista);
		
		lista.adicionaNoComeco("paulo");
		System.out.println(lista);
		
		lista.adicionaNoComeco("guilerme");
		System.out.println(lista);
		
		lista.adiconaFim("Margo");
		System.out.println(lista);
		
		lista.adiconaEmQualquerPosicao(1, "Batman");
		System.out.println(lista);
				
		lista.adiconaFim("kleberson");		
		System.out.println(lista);
		
		lista.removeQualquerPosicao(1);
		System.out.println(lista);
		
		lista.removeFim();
		System.out.println(lista);
		
		lista.removeInicio();
		System.out.println(lista);
		
		System.out.println(lista.contem("Margo"));
		System.out.println(lista.contem("w"));
		
		
		
	}
}
