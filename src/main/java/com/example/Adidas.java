package com.example;

public class Adidas extends Camiseta{

    public Adidas(String marc)
    {
        nomeMarca = marc;
    }

    @Override
    public Camiseta clone() throws CloneNotSupportedException
    {
        return (Adidas) super.clone();
    }
}
