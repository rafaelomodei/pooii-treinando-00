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
public class CD extends Item{
    
   private String artist;
   private Integer track;
   
   

   public CD(){};
   
   public CD(String artist, Integer track, String title, String comment, Double time){
       super(title, time, comment );
       this.artist = artist;
       this.track = track;
   };
   
   @Override
   public String toString(){
       return "Artista: " + this.artist + " Faixa: " + this.track;
   };
}
