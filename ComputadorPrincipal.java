package exercicios;

public class ComputadorPrincipal {

	public static void main(String[] args) {
		Computador m1= new Computador();
		Computador m2= new Computador();
		m1.marca="HP";
		m1.cor="Azul";
		m1.modelo="250-G8";
		m1.nserie=2634;
		m1.preco=3500;
		
		m1.imprimir();
		m1.calcularValor();
		System.out.println("\n");
		m1.imprimir();
		
		System.out.println("\n");
		m2.marca="Samsung";
		m2.cor="Preta";
		m2.modelo="Book";
		m2.nserie=1208;
		m2.preco=5500;
	
		m2.imprimir();
		m2.calcularValor();
		
		m2.alterarValor(5500);
		if(m2.alterarValor(5500)==0) {
			System.out.println("Valor Alterado");
		}else
			System.out.println("Valor nao Alterado");
		
		
		
	}

}
