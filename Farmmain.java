package Models;


import static java.time.Clock.system;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author İstanbul
 */
public class Farmmain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Farmmain Tiere = new Farmmain();  
    	Farmmain Pflanzenanbau = new Farmmain();  
	Farmmain Bauernmanagement = new Farmmain(); 
        
        System.out.println (Tiere) ;
        System.out.println (Pflanzenanbau) ;
        System.out.println (Bauernmanagement) ;
		
}

	
	public class Tiere extends Farmmain{  
			void haltung(){System.out.println("halten...");}  
			Farmmain geflügel = new Farmmain();  // Nesne 1
			Farmmain kuh = new Farmmain();  // Nesne 2
			Farmmain pferde= new Farmmain();  // Nesne 3
 
	public class Pflanzenanbau extends Farmmain{  
			void anbau(){System.out.println("anbauen...");}  
            }
	public class Bauernmanagement extends Farmmain{  
			void führung(){System.out.println("führen...");}  

            }

        }
}

