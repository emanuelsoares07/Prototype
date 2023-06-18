package com.example;

public class Puma extends Camiseta{

    public Puma(String marc)
    {
        nomeMarca = marc;
    }

    @Override
    public Camiseta clone() throws CloneNotSupportedException
    {
        return (Puma) super.clone();
    }
}
