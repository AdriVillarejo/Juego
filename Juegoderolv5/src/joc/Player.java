package joc;

import java.util.ArrayList;

public class Player extends Team{
    private ArrayList<Team> Teams = new ArrayList();
    private ArrayList<Item> Items = new ArrayList();

    private String name;
    private int pAtaque;
    private int pDefensa;
    private int life;
    

    public Player(String name, int pAtaque, int pDefensa, int life, String NombreEquipo) {
        super(NombreEquipo);
        this.name = name;
        this.pAtaque = pAtaque;
        this.pDefensa = pDefensa;
        this.life = life;
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

    public void ataque(Player p) {

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
    
    public void add(Team t){
             Teams.add(t);
       }  
    
    public void remove(Team t){ 
             Teams.remove(t);
       }    
        
    
    public void getMembers(){      
         System.out.println(this);

        
    }
    public int extraAta(){
        int dañoextra = 0;
        for (Item i : Items){
            dañoextra=getpAtaque()+dañoextra;       
        }
        return dañoextra;
        
    }
    
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


public void addItem(Item i){
    
    this.Items.add(i);
    
   
}

public void removeItem(Item i){
    
    this.Items.remove(i); 
    
   
}


}
