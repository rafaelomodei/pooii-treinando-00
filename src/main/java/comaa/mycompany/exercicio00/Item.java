/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comaa.mycompany.exercicio00;

/**
 *
 * @author Rafae
 */
class Item {
   private String title;
   private Double time;
   private String comment;
   
   public Item(){}
   
   public Item(String title, Double time, String comment){
       this.title = title;
       this.time = time;
       this.comment = comment;
   }

    @Override
    public String toString(){
        return "Titulo: "+ this.title +"Time: " + this.time + "Comentários: " + this.comment;
    }

    public String getTitle() {
        return title;
    }

    public Double getTime() {
        return time;
    }

    public String getComment() {
        return comment;
    }
    
    
   
}
