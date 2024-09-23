package org.example;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("honda",
                "ex",
                "branco",
                "DGG-4267",
                "civic",
                false);

        if(carro.cor == "branco"  && carro.nome == "civic"){
            System.out.println("O carro é branco");
        } else{
            System.out.println("o carro é de outra cor");
        }

        String resultado = carro.cor == "branco" && carro.modelo == "ex"
                                            ? "Carro é branco" : "Carro de outra cor";

        System.out.println(resultado);

        double num = 75;

        if (num %2 == 0 ){
        System.out.println("O numero é par");
        } else {
            System.out.println("O numero é impar");
        }

        String banana = num%2 == 0 ? "o numero e par" : "o numero e impar";

        System.out.println(banana);

    }
}