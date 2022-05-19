/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade08;

/**
 *
 * @author Claudio Leite
 */
//realizado correção
public class Lanche {
    private String nome;
    private String descricao;
    // preço em dolar
    private float preco;
    public Lanche (String nome, String descricao, float preco){
    this.nome = nome;
    this.descricao= descricao;
    this.preco= preco;
}
    
    public String getnome(){return this.nome;}
    public String getdescricao(){return this.descricao;}
    public float getpreco(){return this.preco;}
    public void setnome(String nome){this.nome = nome;}
    public void setdescricao(String descricao){this.descricao = descricao;}
    
    public boolean setPreco(float preco){
        if (preco >=0){
            this.preco = preco;
            return true;
        }
        return false;
    }
}