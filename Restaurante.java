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
public class Restaurante {
    private String nome;
    private Cardapio_Pais Cardapio;
    private String Endereco;
    public Restaurante (String nome, Cardapio_Pais Cardapio, String Endereco){
        this.nome= nome;
        this.Endereco = Endereco;
        this.Cardapio = Cardapio;
    }
    public String getnome(){return nome;}
    public String getEndereco(){return Endereco;}
    public Cardapio_Pais getCardapio(){return Cardapio;}
    public void setnome(String nome){this.nome=nome;}
    public void setEndereco(String Endereco){this.Endereco = Endereco;}
}
