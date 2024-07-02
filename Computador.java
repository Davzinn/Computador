package exercicios;

public class Computador {
String marca;
String cor;
String modelo;
int nserie;
double preco;


void imprimir() {
	System.out.println(marca);
	System.out.println(cor);
	System.out.println(modelo);
	System.out.println(nserie);
	System.out.println(preco);

	}

	void calcularValor() {
	
	if(marca.equalsIgnoreCase("HP")) {
		preco=preco+(preco*0.3);	
	}else if(marca.equalsIgnoreCase("Samsung")) {
		preco=preco+(preco*0.20);
	}else if(marca.equalsIgnoreCase("IBM")) {
		preco=preco+(preco*0.40);
	}else if(marca.equalsIgnoreCase("DELL") || marca.equalsIgnoreCase("Itautec") || marca.equalsIgnoreCase("Positivo")){
		preco=preco+(preco*0.05);
	}
	} 
	int alterarValor(double nValor) {
	int a=1;
	if(nValor>0) {
		preco=nValor;
		a=0;
	}
	return a;
}

	
}
