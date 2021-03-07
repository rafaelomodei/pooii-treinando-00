/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comaa.mycompany.exercicio00;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafae
 */
public class Database {
    
    List<Item> itens;
    
    public void list(){
       for(Item i : this.itens){
            System.out.println(i.toString());
       }
    };
    public void listCD(){
        for(Item i : this.itens){
            if(i instanceof CD){
                System.out.println(i.toString());
            }
        }
      
    };
    public void listDVD(){
        for(Item i : this.itens){
            if(i instanceof DVD){
                System.out.println(i.toString());
            }
        }
    };
    
    public Database() {
        itens = new ArrayList<>();
    }

    public void setItens(Item item) {
        itens.add(item);
    }
    
}
