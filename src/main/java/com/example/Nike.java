package com.example;

public class Nike extends Camiseta {
    public Nike(String marc)
    {
        nomeMarca = marc;
    }

    @Override
    public Camiseta clone() throws CloneNotSupportedException
    {
        return (Nike) super.clone();
    }
}
