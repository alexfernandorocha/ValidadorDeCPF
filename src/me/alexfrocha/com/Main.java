package me.alexfrocha.com;

import java.util.Scanner;

public class Main {

//    Inicio o arquivo Main.java declarando o método main junto com a declaração de variáveis e o envio do texto para o
//    Terminal e com requisitando uma informação do usuário e após tudo isso é feita as verificações do CPF informado.

    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Informe um CPF (Apenas números): ");
        String cpf = terminal.next();

        CPF CPF = new CPF(cpf);


        if(CPF.validarCPF()) {
            System.out.println();
            System.out.println("# CPF VÁLIDO! Aqui está ele Formado:");
            System.out.println(CPF.imprimirCPF());
        } else {
            System.out.println("CPF Inválido!");
        }
    }

}
