package joc;

import java.util.*;

public class Team {
    static Scanner sc = new Scanner(System.in);
    private ArrayList<Player> Players = new ArrayList();
    
    private String NombreEquipo;

    public Team(String NombreEquipo) {
        this.NombreEquipo = NombreEquipo;
    }
    
    public Team() {
        
    }

    public String getNombreEquipo() {
        return NombreEquipo;
    }

    public void setNombreEquipo(String NombreEquipo) {
        this.NombreEquipo = NombreEquipo;
    }
    
    // sirve para añadir jugadores de un equipo
    public void add(Player p) throws ExcepcionRepeJuga{
        if (Players.contains(p)) return;
            this.Players.add(p);
            p.add(this);
       }    
        
    // sirve para eliminar jugadores de un equipo
    public void remove(Player p) throws ExcepcionRepetido{
        
       if (!Players.contains(p)){
           
       
            this.Players.remove(p);
            p.remove(this);
       }
       else{
           throw new ExcepcionRepetido ("El jugador "+ p.getName() + " no pertenece al equipo " + this.NombreEquipo);
       }
    }
    // esto nos devuelve a que equipos pertenece la cada jugador
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
    
     
       
    // metodo equals para comparar
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


