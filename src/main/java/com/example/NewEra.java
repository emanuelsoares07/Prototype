package com.example;

public class NewEra extends Camiseta{

    public NewEra(String marc)
    {
        nomeMarca = marc;
    }

    @Override
    public Camiseta clone() throws CloneNotSupportedException
    {
        return (NewEra) super.clone();
    }
}
