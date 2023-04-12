package org.example;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

import java.io.FileReader;

public class Teste3 {
    public static void main(String[] args) throws Exception {

        JSONArray ob = (JSONArray) new JSONParser().parse(new FileReader("/home/danilodameluz/IdeaProjects/Teste3/src/dados.json"));
        long diasComFaturamento = 0;
        long diaMenorFat = 0;
        long diaMaiorFat = 0;
        long diasAcimaMedia = 0;
        double maiorFat = 0.0;
        double menorFat = 50000.0;
        double valorTotal = 0.0;
        double mediaFaturamento = 0.0;

        for (Object o:ob){
            JSONObject faturamento = (JSONObject) o;

            long dia = (long) faturamento.get("dia");
            double valorDia = (double) faturamento.get("valor");

            if (valorDia != 0.0){
                diasComFaturamento += 1;
                valorTotal += valorDia;
            }

            if (valorDia > maiorFat){
                maiorFat = valorDia;
                diaMaiorFat = dia;
            }

            if (valorDia < menorFat && valorDia != 0.0){
                menorFat = valorDia;
                diaMenorFat = dia;
            }
        }
        mediaFaturamento = valorTotal/diasComFaturamento;

        for (Object o:ob) {
            JSONObject faturamento = (JSONObject) o;

            double valorDia = (double) faturamento.get("valor");

            if (valorDia >= mediaFaturamento){
                diasAcimaMedia += 1;
            }

        }


        System.out.println("Total de Dias com Faturamento: " + diasComFaturamento);
        System.out.println("Valor total de Faturamento: R$ " + valorTotal);
        System.out.println("Média de faturamento mensal: R$ " + mediaFaturamento);
        System.out.println("Dia com maior Faturamento: " + diaMaiorFat + " Faturamento de R$ " + maiorFat);
        System.out.println("Dia com menor Faturamento: " + diaMenorFat + " Faturamento de R$ " + menorFat);
        System.out.println("Quantidade de dias com Faturamento acima da média mensal : " + diasAcimaMedia);


    }
}