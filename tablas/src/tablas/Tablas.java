/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas;

/**
 *
 * @author APRENDIZ
 */
public class Tablas {
    
    
    

    


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=1,c=1,b=1;
        
    
        for(b=1;b<=10;b++) {
            System.out.println("");
       
        
         System.out.println("La tabla del "+b+" es");
                for(a=1;a<=10;a++){
    c=b*a;
   
             
           
           System.out.print(+b+" * "+a+" = "+c);
              if (c % 2 == 0){System.out.println(" Es par");}
              else{System.out.println(" Es impar");} 
              
                };

        // TODO code application logic here
    }}
                
       
    
}
 
