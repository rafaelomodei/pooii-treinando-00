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
public class App {
    
    public static void main(String [] args){ 
        Database db = new Database();
        
        Item cd = new CD("Pedro", 2, "Novas musicas", "Muito bom", 5.0);
        Item cd1 = new CD("Rafael", 1, "Novas musicas", "Muito bom", 3.0);
        Item cd2 = new CD("Pedro", 2, "Novas musicas", "Muito bom", 5.0);
        Item cd3 = new CD("Rafael", 1, "Novas musicas", "Muito bom", 3.0);
        

        Item dvd1 = new DVD("Rafa", "Show musicas", 30.0 ,"Muito bom" );
        Item dvd2 = new DVD("Pedro", "Show musicas", 55.0 ,"Muito bom");
        Item dvd3 = new DVD("Jeferson", "Show musicas", 123.0 ,"Muito bom");
        Item dvd4 = new DVD("Maria", "Show musicas", 564.0 ,"Muito bom");
        
        db.setItens(cd);
        db.setItens(cd1);
        db.setItens(cd2);
        db.setItens(cd3);
        
        db.setItens(dvd1);
        db.setItens(dvd2);
        db.setItens(dvd3);
        db.setItens(dvd4);
        

        System.out.println(" === LIST === ");
        db.list();
        
        System.out.println(" === LIST CD === ");
        db.listCD();
        
        System.out.println(" === LIST DVD === ");
        db.listDVD();
    }
}
