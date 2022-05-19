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
public class Atividade08 {

    /**
     * @param args the command line arguments
     */
    //realizado correção
    public static void main(String[] args) {
        // TODO code application logic here
        Lanche lan1 = new Lanche("NecFeijoada", "Lanche delicioso de feijoada", 5.5f);
        Lanche lan2 = new Lanche("NecBacon", "Lanche de Bacon", 6.20f);
        Lanche lan3 = new Lanche("NecPicanha", "lanche com molho sabor picanha", 8f);
        Lanche lan4 = new Lanche("NecChimichurri", "Sabor de chimichurri", 7f);
        Lanche lan5 = new Lanche("NecCheddar", "Lanche com cheddar feito de petróleo", 4f);
        Cardapio_Pais cp1= new Cardapio_Pais("Brasil");
        cp1.AdicionarLanche(lan1);
        cp1.AdicionarLanche(lan2);
        //cp1.RemoverLanche(lan2);
        Cardapio_Pais cp2 = new Cardapio_Pais ("Brasil");
        cp2.AdicionarLanche(lan3);
        cp2.AdicionarLanche(lan4);
        Cardapio_Pais cp3 = new Cardapio_Pais("Mongólia");
        cp3.AdicionarLanche(lan2);
        cp3.AdicionarLanche(lan5);
        Restaurante Rest1 = new Restaurante("Loja Con Tour", cp1,"Avenida Tiradentes, 165 - Londrina");
        Restaurante Rest2 = new Restaurante("Loja MacFruits", cp2, "Rua Violeta, 54");
        Restaurante Rest3 = new Restaurante("Loja Quinta Avenida", cp3, "Rua Soldado Ferrerer, 34");
        Rede_Restaurante RR = new Rede_Restaurante("NecTronalds");
        RR.AdicionarRestaurante(Rest1);
        RR.AdicionarRestaurante(Rest2);
        RR.AdicionarRestaurante(Rest3);
        RR.AdicionarCardapio(cp1);
        RR.AdicionarCardapio(cp2);
        RR.AdicionarCardapio(cp3);
        //mostrarLanche(lan1);
        //mostrarCardapio(cp1);
        //mostrarCardapio(cp2);
        //mostrarCardapio(cp3);
        //mostrarCardapioPais(RR, "Brasil");
        //mostrarTodosCardapios(RR);
    }
    
    public static void mostrarLanche(Lanche lan){
        System.out.println(lan.getnome() + " " + lan.getpreco() + " " + lan.getdescricao());
    }
    public static void mostrarCardapio(Cardapio_Pais cp){
        System.out.println(cp.getNomePais());
        for(Lanche lan: cp.getLanches()){
            mostrarLanche(lan);
        }
    }
    public static void mostrarCardapioPais(Rede_Restaurante RR, String nome){
        for(Cardapio_Pais cp: RR.getCardapiosPais()){
            if (cp.getNomePais().equals(nome)){
                mostrarCardapio(cp);
            }
        }
    }
    public static void mostrarTodosCardapio(
            Rede_Restaurante RR){
        for (Cardapio_Pais cp: RR.getCardapiosPais()){
            mostrarCardapio(cp);
        }
    }
}
