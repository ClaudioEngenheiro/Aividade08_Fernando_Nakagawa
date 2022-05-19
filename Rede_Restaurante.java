/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade08;
import java.util.ArrayList;

/**
 *
 * @author Claudio Leite
 */
//realizado correção
public class Rede_Restaurante {
    
    private String nome;
    private ArrayList<Restaurante>restaurante;
    private ArrayList<Cardapio_Pais> cardapios;
    public Rede_Restaurante (String nome){
        this.nome = nome;
        this.restaurante = new ArrayList<>();
        this.cardapios = new ArrayList<>();
    }
    public static void AdicionarRestaurante(Restaurante Rest){
      //  this.restaurante.add(Rest);
    }
    public void RemoverRestaurante(Restaurante Rest){
        this.restaurante.remove(Rest);
    }
public void AdicionarCardapio(Cardapio_Pais c){
        this.cardapios.add(c);
    }
    public void RemoverCardapio(Cardapio_Pais c){
        this.cardapios.remove(c);
    }
    public String getNome(){
        return nome;
    }
        
    public ArrayList<Restaurante> getRestaurantes(){
        return restaurante;
    }
    public ArrayList<Cardapio_Pais> getCardapiosPais(){
        return cardapios;
    }
}