package br.unipe.minic;

import java.io.File;

public class GeradorClassesJflex {

    public static void main(String[] args) {

        jflex.Main.generate(new File("especificacoes/Minic.flex"));

        try {

            System.out.println("\n\n------------------- Movendo arquivo gerado -------------------");

            String nome = "AnalisadorLexico.java";
            File gerado = new File("especificacoes/" + nome);
            File criado = new File("src/main/java/br/unipe/minic/" + nome);
            gerado.renameTo(criado);
            System.out.println("  Aquivo: " + gerado.getPath() + " -> " + criado.getPath());

        } catch (Exception e) {
            System.out.println("   Erro ao mover arquivo");
        }
    }
}
