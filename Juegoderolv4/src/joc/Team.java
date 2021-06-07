package joc;

import java.util.*;

public class Team {
    static Scanner sc = new Scanner(System.in);
    private ArrayList<Player> Players = new ArrayList();
    
    private String NombreEquipo;

    public Team(String NombreEquipo) {
        this.NombreEquipo = NombreEquipo;
    }

    public String getNombreEquipo() {
        return NombreEquipo;
    }

    public void setNombreEquipo(String NombreEquipo) {
        this.NombreEquipo = NombreEquipo;
    }
    
    
    

    public void add(Player p){
        
             Players.add(p);
       }    
        

    
    
    public void remove(Player p){
        
       Players.remove(p);
        
    }
    
     public void getMembers(){
         
         System.out.println(this);

        
    }

    @Override
 public String toString()
{
	StringBuilder res = new StringBuilder("Equipo: " +  getNombreEquipo());
	
	for (Player player : Players)
	{
		res.append("\n Jugador: ").append(player);
	}
	res.append("\n");
	
	return res.toString();
}
    
     
       
    
    public boolean equals (Team t){
        
        boolean r = true;
        if (this.getNombreEquipo().equals(t.getNombreEquipo())){
            r = true;
        }
        
        else if (!this.getNombreEquipo().equals(t.getNombreEquipo())){
            
            r = false;
        }
        
        return r;
    }
    
    
    
    

}


