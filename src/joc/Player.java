package joc;

import java.util.ArrayList;

public class Player{
    private ArrayList<Team> Teams = new ArrayList();
    private ArrayList<Item> Items = new ArrayList();

    private String name;
    private int pAtaque;
    private int pDefensa;
    private int life;
    

    public Player(String name, int pAtaque, int pDefensa, int life) {
        this.name = name;
        this.Teams = new ArrayList<Team>();
        this.pAtaque = pAtaque;
        this.pDefensa = pDefensa;
        this.life = life;
        
    }
    
    public Player() {
    
    
    }
    
    public ArrayList<Team> getTeams() {
        return Teams;
    }
 
    public String getName() {
        return name;
    }

    public int getpAtaque() {
        return pAtaque;
    }

    public int getpDefensa() {
        return pDefensa;
    }

    public int getLife() {
        return life;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setpAtaque(int pAtaque) {
        this.pAtaque = pAtaque;
    }

    public void setpDefensa(int pDefensa) {
        this.pDefensa = pDefensa;
    }

    public void setLife(int life) {
        this.life = life;
    }

    
    // METODO ATAQUE PARA ATACAR A UN JUGDAOR
    public void ataque(Player p) throws ExcepcionRepeJuga {
        
        if (this.getLife() <= 0)
        {
            throw new ExcepcionRepeJuga("El jugador " +this.getName()+ " está muerto y no le puedes atacar");
        }
        
        if (p.getLife() <= 0){
            
            throw new ExcepcionRepeJuga("El jugador: " +p.getName()+ " está muerto y no puede ser atacado ");
            
        }

        System.out.println(p.toString());
        int vidaAntes = p.life;
        p.hit(this.pAtaque);

        System.out.println("El jugador " + p.getName() + " ha sido atacado por el jugador " + getName() + " con " + getpAtaque() + " puntos de ataque"
                + ", se defendió con: " + p.getpDefensa() + " puntos de defensa. Antes del ataque tenía " + vidaAntes
                + " puntos de vida y después del ataque tiene: " + p.getLife()+ " puntos de vida");

        System.out.println(p.toString());
        System.out.println(" ");
    }

    protected void hit(int AtaqueP) {
        int daño;
        daño = AtaqueP + extraAta() - getpDefensa();
        
        if (daño <= 0){
        daño = 0;
        }
        
        int vida = getLife();
        
        vida = vida - daño;
        setLife(vida);
        

    }
    
    // metodo para añadir un equipo a un jugador
    public void add(Team t) throws ExcepcionRepeJuga{ 
             if (this.Teams.contains(t)){
 
            this.Teams.add(t);
            t.add(this);
             }
            else {
                 throw new ExcepcionRepeJuga("El Equipo " + t.getNombreEquipo() + " ya contiene al jugador " + this.getName());
                    
                    }
       }  
    
    // metodo para eliminar un equipo de un jugador
    public void remove(Team t) throws ExcepcionRepetido{ 
            if (!this.Teams.contains(t))
            {
            this.Teams.remove(t);
            t.remove(this);
    }
            
            else{
                    throw new ExcepcionRepetido("El Equipo " + t.getNombreEquipo() + " ya contiene al jugador " + this.getName());
                    }
       }        
        
    
    public void getMembers(){      
         System.out.println(this);

        
    }
    
    // metodo para el ataque extra
    public int extraAta(){
        int dañoextra = 0;
        for (Item i : Items){
            dañoextra=getpAtaque()+dañoextra;       
        }
        return dañoextra;
        
    }
    
    
   // metodo para la defensa extra
    public void extraDef(){
        int defensaextra = 0;
        for (Item i : Items){
            setpAtaque(getpAtaque() + defensaextra);
        }
        
    }
        

    @Override
    public String toString() {
        String objeto = "";
    for (Item t : this.Items){
      objeto+=" " +t+ "\n";
    }
        return "Jugador: " + getName() + " PA: " + getpAtaque() + " /  PD: " + getpDefensa() + " /  PV: " + getLife() + "  y tiene los items:"
                + "\n " +objeto;
    }

// añadir item a un array
public void addItem(Item i) throws ExcepcionORepetido{
    
    if (this.Items.contains(i)){
        this.Items.add(i);
    }
    else{
        throw new ExcepcionORepetido ("El Objeto " + i.getName() + " ya se encuentra en: " + this.getName());
    }
    
   
}
// eliminar un item

public void removeItem(Item i){
   
        if (!this.Items.contains(i)) return;
        this.Items.remove(i); 
    
   
}


}
