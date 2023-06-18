package com.example;

public class Prototype {

    public static void main(String args[]) throws  CloneNotSupportedException{

        System.out.println("***Exemplo do padrão Prototype***\n");

        Camiseta puma = new Puma("Puma Active");
        puma.preco=100;

        Camiseta nike = new Nike("Nike Sb");
        nike.preco=250;

        Camiseta cs;

        //Clone do Objeto
        cs = puma.clone();

        //Configurando preço que será maior que 100
        cs.preco = puma.preco + Camiseta.setPreco();
        System.out.println("Modelo: "+ cs.getNomeMarca() + ", Preço do Modelo: "+  cs.preco);

        //Clone do Objeto Nike
        cs = nike.clone();

        //Configurando preço que será maior que 250
        cs.preco = nike.preco + Camiseta.setPreco();
        System.out.println("Modelo: "+ cs.getNomeMarca() + ", Preço do Modelo: "+ cs.preco);
    }
}
