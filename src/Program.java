import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		
//		Exercicio 1************************************************************************************************
//		Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
//		System.out.print("Digite um número inteiro: ");
//		int numero = scan.nextInt();
//		
//		if( numero > 0 ) {
//			System.out.println("Positivo");
//		}else if ( numero < 0) {
//			System.out.println("Negativo");
//		}else {
//			System.out.println("Nulo");
//		}
//		
//		Exercício 2************************************************************************************************
//		Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar
//		System.out.print("Digite um número inteiro: ");
//		int numero = scan.nextInt();
//		
//		if ( numero % 2 == 0 ) {
//			System.out.println(numero + " é par.");
//		}else {
//			System.out.println(numero + " é ímpar.");
//		}
		
//		EXERCÍCIO 3************************************************************************************************
//		Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem 
//		"Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si. 
//		Atenção: os números devem poder ser digitados em
//		ordem crescente ou decrescente.
		
//		System.out.print("Digite um número inteiro A: ");
//		int numeroA = scan.nextInt();
//		System.out.print("Digite um número inteiro B: ");
//		int numeroB = scan.nextInt();
//		System.out.println("");//pula uma linha
//		if( numeroA >= numeroB && numeroA % numeroB == 0 ) {
//			System.out.print("São Múltiplos");
//		}else if( numeroA < numeroB && numeroB % numeroA == 0){
//			System.out.print("São Múltiplos");
//		}else {
//			System.out.print("Não são Múltiplos");
//		}
		
//		Exercício 4*************************************************************************************************
//		Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//		começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
		
//		System.out.print("Digite a Hora (inteiro de 0-23) de inicio do jogo? ");
//		int horaInicioJogo = scan.nextInt();
//		System.out.print("Digite a Hora (inteiro de 0-23) de término do jogo? ");		
//		int horaFimJogo = scan.nextInt();
//		System.out.println("");//pula 1 linha
//		int duracao;
//		if( horaFimJogo >  horaInicioJogo ) {
//			duracao = horaFimJogo - horaInicioJogo;
//			System.out.print("O JOGO DUROU " + duracao + " HORA(S)");
//		}else if(horaFimJogo < horaInicioJogo ) {
//			duracao = (24 - horaInicioJogo) + horaFimJogo;
//			System.out.print("O JOGO DUROU " + duracao + " HORA(S)");
//		}else {
//			duracao = 24;
//			System.out.print("O JOGO DUROU " + duracao + " HORA(S)");
//		}
		
//		Exercício 5***********************************************************************************************
//		Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//		seguir, calcule e mostre o valor da conta a pagar.
		
//		System.out.println("Código\t\tEspecificação\t\tPreço");
//		System.out.println("----------|------------------------|----------------|");
//		System.out.println("1\t\tCachorro quente\t\tR$ 4.00");
//		System.out.println("----------|------------------------|----------------|");
//		System.out.println("2\t\tX-Salada\t\tR$ 4.50");
//		System.out.println("----------|------------------------|----------------|");
//		System.out.println("3\t\tX-Bacon\t\t\tR$ 5.00");
//		System.out.println("----------|------------------------|----------------|");
//		System.out.println("4\t\tTorrada simples\t\tR$ 2.00");
//		System.out.println("----------|------------------------|----------------|");
//		System.out.println("5\t\tRefrigerante\t\tR$ 1.50");
//		System.out.println("----------|------------------------|----------------|");
//		System.out.print("\nDigite o código e a quantidade do produto que deseja? ");
//		int codigo = scan.nextInt();
//		int quantidade = scan.nextInt();
//		double total = 0;
//		switch(codigo) {
//			case 1: 
//				total = quantidade * 4.00;
//				break;
//			case 2:
//				total = quantidade * 4.50;
//				break;
//			case 3:
//				total = quantidade * 5.00;
//				break;
//			case 4: 
//				total = quantidade * 2.00;
//				break;
//			case 5:
//				total = quantidade * 1.50;
//				break;
//		}
//		System.out.println("\nTotal: R$ "+ String.format("%.2f", total));
		
//		Exercício 6***********************************************************************************************
//		Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
//		seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
//		nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
		
//		System.out.print("Digite um número Real: ");
//		double numReal = scan.nextDouble();
//		System.out.println("");//pula 1 linha
//		if( numReal >= 0 && numReal <= 25 ) {
//			System.out.print("Intervalo [0,25]");
//		}else if( numReal > 25 && numReal <= 50  ) {
//			System.out.print("Intervalo (25,50]");
//		}else if(  numReal > 50 && numReal <= 75  ) {
//			System.out.print("Intervalo (50,75]");
//		}else if( numReal > 75 && numReal <= 100  ) {
//			System.out.print("Intervalo (75,100]");
//		}else {
//			System.out.print("Fora de intervalo");
//		}
		
//		Exercício 7
//		Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
//		de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
//		ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
//		Se o ponto estiver na origem, escreva a mensagem “Origem”.
//		Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
//		situação.		
		
//		System.out.print("Digite X e y: ");	
//		double x = scan.nextDouble();
//		double y = scan.nextDouble();
//		
//		if ( x == 0.0 && y == 0.0 ) {
//			System.out.println("Origem");
//		}
//		else if ( y == 0.0 ) {
//			System.out.println("Eixo X");
//		}
//		else if ( x == 0.0 ) {
//			System.out.println("Eixo Y");
//		}
//		else if( x > 0.0 && y > 0.0) {
//			System.out.println("Q1");
//		}
//		else if ( x < 0.0 && y > 0.0 ) {
//			System.out.println("Q2");
//		}
//		else if( x < 0.0 && y < 0.0 ) {
//			System.out.println("Q3");
//		}
//		else {
//			System.out.println("Q4");
//		}
		
//		Exercício 8
//		Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
//		que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
//		qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
//		Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
//		mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
		
//		Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
//		salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
//		de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
//		duas casas decimais.
		
		//tabela
		System.out.println("\tRenda\t\t\t\tImposto de Renda\t\t");
		System.out.println("-------------------------------------|---------------------");
		System.out.println("\tde 0.00 a R$ 2000.00\t\t      Isento\t\t");
		System.out.println("-------------------------------------|---------------------");
		System.out.println("\tde R$ 2000.01 até R$ 3000.00\t\t8%\t\t");
		System.out.println("-------------------------------------|---------------------");
		System.out.println("\tde R$ 3000.01 até R$ 4500.00\t\t18%\t\t");
		System.out.println("-------------------------------------|---------------------");
		System.out.println("\tacima de R$ 4500.00\t\t\t28%\t\t");
		System.out.println("-------------------------------------|---------------------");
		
		System.out.println("");//pula 1 linha
		System.out.print("Digite o salário: R$ ");
		double salario = scan.nextDouble();
		double imposto;
		if( salario <= 2000.0) {
			imposto = 0.0;
		}
		else if( salario <= 3000.0 ) {
			imposto = (salario-2000) * (8.0/100.0);
		}
		else if ( salario <= 4500.0 ) {
			imposto = 1000 * (8.0/100.0);
			imposto+= (salario - 3000) * (18.0/100.0);
		}
		else {
			imposto  = 1000 * (8.0/100.0);
			imposto += 1500 * (18.0/100.0);
			imposto += (salario - 4500) * (28.0/100.0);
		}
		
		if ( imposto == 0.0 ) 
			System.out.println("Isento");
		else
			System.out.println("R$ " + String.format("%.2f", imposto));		
		
		scan.close();
		
		
				


	}

}
