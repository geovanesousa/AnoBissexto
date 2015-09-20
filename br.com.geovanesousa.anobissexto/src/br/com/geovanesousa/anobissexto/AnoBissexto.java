package br.com.geovanesousa.anobissexto;

import java.util.Scanner;

public class AnoBissexto {

    public static void main(String[] args) {
        Scanner leitorDeTeclado = new Scanner(System.in);
        int anoBase;
        int qtdAnosBissextos;
        
        System.out.println("Digite o ano base: ");
        anoBase = leitorDeTeclado.nextInt();
        System.out.println("Quantidade de anos bissextos: ");
        qtdAnosBissextos = leitorDeTeclado.nextInt();
        
        while(qtdAnosBissextos>0){
            if((anoBase%4)==0){
                System.out.println("Bissexto: "+anoBase);
                qtdAnosBissextos = qtdAnosBissextos - 1;
                anoBase = anoBase + 1;
            }
            anoBase = anoBase + 1;
        }
        
    }
    
}
