//Nomes
//Filipe Angelo de Oliveira
//Heloisa Mendes do Nascimento Barbosa

import java.util.Scanner;

public class ex1 {

    public static int diasSemana () {

        Scanner input = new Scanner(System.in);

        System.out.println("Insira quantos dias da semana será mapeado: ");

        int tamanho = input.nextInt();

        return tamanho;

    }

    public static float[] mapear(int tamanho) {

        Scanner input = new Scanner(System.in);

        float[] temp = new float[tamanho];

        for (int i = 0; i < tamanho; i++) {

            System.out.printf("Temperatura do dia[%d]: \n ", i);

            temp [i] = input.nextFloat();

        }

        return temp;

    }

    public static void verificacao (int tamanho, float[] mapear) {

        float menor = mapear[0];

        float maior = mapear[0];

        for(int i = 0; i < tamanho; i++) {

            if(mapear[i] < menor ) {

                menor = mapear[i];

            } else if(mapear[i] > maior) {

                maior = mapear[i];

            }

        }

        for(int i = 0; i < tamanho; i++) {

            if(mapear[i] == menor) {

                System.out.printf("Menor temperatura: %.1f\n", menor);

            } else if (mapear[i] ==maior) {

                System.out.printf("Maior temperatura: %.1f\n", maior);

            }

        }

    }

    public static float[] tempNegativa(int tamanho, float[] mapear) {

        Scanner input = new Scanner(System.in);

        float[] negativos = new float[tamanho];

        float valorNegativo = 0;

        for(int i = 0; i < tamanho; i++) {

            if(mapear[i] < 0) {

                valorNegativo = mapear[i];

                negativos[i] = valorNegativo;

                System.out.println("*___* Temperaturas Negativos *___*");
                System.out.println(negativos[i]
                        );

            }

        } return negativos;

    }

    public static void media(int tamanho, float[] mapear) {

        float soma = 0;

        for(int i = 0; i < tamanho; i++) {

            soma = soma + mapear[i];

        }

        float media = soma / mapear.length;

        System.out.println("* ___ * Média da Temperatura * ___*");

                System.out.println("Média: " + media);

    }

    public static void main(String[] args) {

        int dias = diasSemana();

        float[] map = mapear(dias);

        verificacao(dias, map);

        float[] neg = tempNegativa(dias, map);

        media(dias, map);

    }
}
