package com.vti.entity;

/*
Mr.Son
 */
public class Kysu extends  Canbo
{
    private String nganhdaotao;

    public Kysu(String firtName, String lastName) {
        super(firtName, lastName);
    }

    public String getNganhdaotao() {
        return nganhdaotao;
    }

    public void setNganhdaotao(String nganhdaotao) {
        this.nganhdaotao = nganhdaotao;
    }
}
