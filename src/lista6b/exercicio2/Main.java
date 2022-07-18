package src.lista6b.exercicio2;

import src.lista6b.exercicio1.Circulo;
import src.lista6b.exercicio1.Quadrado;
import src.lista6b.exercicio1.Retangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean repeticaoMenu = true;
        Scanner input = new Scanner(System.in);
        while (repeticaoMenu) {
            System.out.println("O que deseja fazer?");
            System.out.println("1: Calcular a área de um quadrado");
            System.out.println("2: Calcular a área de um retângulo");
            System.out.println("3: Calcular a área de um círculo");
            System.out.println("4: Finalizar");
            String opcaoMenu = input.next();
            switch (opcaoMenu) {
                case "1":
                    System.out.println("Informe o lado do quadrado:");
                    double lado = input.nextDouble();
                    src.lista6b.exercicio1.Quadrado quadrado = new Quadrado(lado);
                    quadrado.calcularArea();
                    System.out.println("A área do quadrado, cujo lado é " + lado + " é: " + quadrado.getAreaFigura());
                    break;
                case "2":
                    System.out.println("Informe a base do retângulo:");
                    double base = input.nextDouble();
                    System.out.println("Informe a altura do retângulo:");
                    double altura = input.nextDouble();
                    src.lista6b.exercicio1.Retangulo retangulo = new Retangulo(base, altura);
                    retangulo.calcularArea();
                    System.out.println("A área do retângulo, cuja base é " + base + " e a altura, " + altura + " é: " + retangulo.getAreaFigura());
                    break;
                case "3":
                    System.out.println("Informe o raio do círculo:");
                    double raio = input.nextDouble();
                    src.lista6b.exercicio1.Circulo circulo = new Circulo(raio);
                    circulo.calcularArea();
                    System.out.println("A área do círculo, cujo raio é " + raio + " é: " + circulo.getAreaFigura());
                    break;
                case "4":
                    System.out.println("Fim do programa!");
                    repeticaoMenu = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        input.close();
    }
}
