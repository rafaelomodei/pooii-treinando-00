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
public class DVD extends Item{
    private String diretor;
    
    public DVD(String diretor, String title, Double time, String comment){
        super(title, time, comment);
        this.diretor = diretor;
    };

    @Override
    public String toString() {
        return "DVD: " +this.diretor;
    };
    
    
}
