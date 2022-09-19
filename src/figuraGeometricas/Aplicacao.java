package figuraGeometricas;

import java.util.Scanner;


public class Aplicacao {

	public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int op;
        double raio, lado, base, altura;
        
        do {
            menu();
            op = in.nextInt();in.nextLine();
            switch (op) {
                case 1:
                	System.out.println("Insira o valor do raio do c�rculo: ");
                	raio = in.nextDouble(); in.nextLine();
                	Circulo circulo = new Circulo(raio);
                	System.out.println(circulo);
                        break;
                case 2: 
                	System.out.println("Insira o valor da base do triangulo: ");
                	base = in.nextDouble(); in.nextLine();
                	System.out.println("Insira o valor da altura do triangulo: ");
                	altura = in.nextDouble(); in.nextLine();
                	Triangulo triangulo = new Triangulo(base, altura);
                	System.out.println(triangulo);
                        break;
                case 3:
                	System.out.println("Insira o valor do lado do quadrado: ");
                	lado = in.nextDouble(); in.nextLine();
                	Quadrado quadrado = new Quadrado(lado);
                	System.out.println(quadrado);
                        break;
                case 4: 
                	System.out.println("Insira o valor da base do quadrilatero: ");
                	base = in.nextDouble(); in.nextLine();
                	System.out.println("Insira o valor da altura do quadrilatero: ");
                	altura = in.nextDouble(); in.nextLine();
                	Quadrilatero quadrilatero = new Quadrilatero(base, altura);
                	System.out.println(quadrilatero);
                        break;

                case 0: 
                		System.out.println("Bye bye");
                        break;
                default: System.out.println("Opcao invalida");
            }           
        } while (op != 0);

	}
	
	public static void menu() {
        System.out.println("Opcoes");
        System.out.println("1 - Circulo");
        System.out.println("2 - Triangulo");
        System.out.println("3 - Quadrado");
        System.out.println("4 - Quadrilatero");
        System.out.println("0 - Sair");
        System.out.print("Digite a opcoes desejada: ");
	}

}
