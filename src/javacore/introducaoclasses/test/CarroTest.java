package javacore.introducaoclasses.test;

import javacore.introducaoclasses.classes.Carro;

import java.util.Scanner;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();

        for (int i= 0; i < 1; i++) {
            Scanner ler = new Scanner(System.in);
            carro.velocidadeMaxima = ler.nextInt();
            System.out.println(carro.velocidadeMaxima);
        }
    }
}
