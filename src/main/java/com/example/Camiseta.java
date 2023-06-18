package com.example;

import java.util.Random;

public class Camiseta implements Cloneable{

    public String nomeMarca;
    public int preco;

    public static int setPreco() {
        return 0;
    }

    public String getNomeMarca(){
        return nomeMarca;
    }

    public void setNomeMarca(String nomeMarca){
        this.nomeMarca = nomeMarca;
    }


    public Camiseta clone() throws CloneNotSupportedException
    {
        return (Camiseta) super.clone();
    }
}
