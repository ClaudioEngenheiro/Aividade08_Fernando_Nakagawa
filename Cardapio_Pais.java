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
//realizado correcao
import java.util.ArrayList;

public class Cardapio_Pais {
    private String nomePais;
    private ArrayList<Lanche> lanches;
    public Cardapio_Pais(String nomePais){
        this.nomePais = nomePais;
        this.lanches = new ArrayList<>();
    }
    public void AdicionarLanche(Lanche lan){
        this.lanches.add(lan);
    }
    
    public void AdicionarLanche(String nome, String Descricao, float preco){
        Lanche lan = new Lanche(nome, Descricao, preco);
        AdicionarLanche(lan);
    }
    public void RemoverLanche(Lanche lan){
        this.lanches.remove(lan);
    }
    public String getNomePais() {return nomePais;}
    public ArrayList<Lanche> getLanches(){
        return lanches;
    }
}
