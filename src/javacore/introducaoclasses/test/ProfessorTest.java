package javacore.introducaoclasses.test;

import javacore.introducaoclasses.classes.Professor;

import java.util.Scanner;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        Scanner ler = new Scanner(System.in);

        do {
            System.out.println("digite nome do professor:");
            professor.nome = ler.next();
            System.out.println("digite a matricula:");
            professor.matricula = ler.next();
            System.out.println("digite o cpf:");
            professor.cpf = ler.nextInt();
            System.out.println("digite o rg:");
            professor.rg = ler.nextInt();
        }while (professor.nome.equalsIgnoreCase(""));
        System.out.println(professor.nome);
        System.out.println(professor.matricula);
        System.out.println(professor.cpf);
        System.out.println(professor.rg);
    }
}
