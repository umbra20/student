package encapsulation;                                                                   
                                                                                         
public class Gamerr {                                                                    
    public static void main(String[] args) {                                             
        Gamer[] gamerArray = new Gamer[5];                                               
        gamerArray[0] = new Gamer("Никола ", true);                                      
        gamerArray[1] = new Gamer("Васька ", true);                                      
        gamerArray[2] = new Gamer("Санек ", true);                                       
        gamerArray[3] = new Gamer("Егор", false);                                        
        gamerArray[4] = new Gamer("Миша ", false);                                       
        for (int i = 0; i < gamerArray.length; i++) {                                    
            if (gamerArray[i].isActive()) {                                              
                System.out.println(gamerArray[i].getNickname() + "-" + " Игрок в сети"); 
            }                                                                            
            else                                                                         
           System.out.println(gamerArray[i].getNickname() +" - " +  " Не в сети");       
        }                                                                                
                                                                                         
    }                                                                                    
}                                                                                        
                                                                                         
