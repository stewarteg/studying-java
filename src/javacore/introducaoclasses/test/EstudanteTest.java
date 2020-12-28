package javacore.introducaoclasses.test;

import javacore.introducaoclasses.classes.Estudante;

import java.util.Scanner;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante joao = new Estudante();
       // joao.nome = "Joao";
      //  joao.matricula ="1212";
        //joao.idade = 15;
        Scanner scan = new Scanner(System.in);

        System.out.println("digite o nome");
        joao.nome = scan.next();
        System.out.println("digite o matricula");
        joao.matricula = scan.next();
        System.out.println("digite a idade");
        joao.idade = scan.nextInt();

        System.out.println(joao.nome);
        System.out.println(joao.matricula);
        System.out.println(joao.idade);
    }
}
