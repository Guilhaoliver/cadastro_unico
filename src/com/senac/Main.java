package com.senac;

public class Main {

    public static void main(String[] args) {

        String cor = "Pardo";
        boolean maiorDeIdade = true;
        boolean direitosPoliticos = true;
        boolean quitacaoEleitoral = true;
        boolean ensinoMedioCompleto = true;
        boolean passagemPolicial = false;
        boolean cadUnico = true;
        String vericarAprovacaoDoCandidato = "está aprovado";

        boolean  resultado = vericarAprovacaoDoCandidato(cor , maiorDeIdade , direitosPoliticos , quitacaoEleitoral);

        System.out.println();

    }

    private static boolean vericarAprovacaoDoCandidato(String cor, boolean maiorDeIdade, boolean direitosPoliticos, boolean quitacaoEleitoral) {

        if(cor.equals("Pardo") && maiorDeIdade && direitosPoliticos && direitosPoliticos && quitacaoEleitoral){

            return true;
        }
        return false;
    }


}
