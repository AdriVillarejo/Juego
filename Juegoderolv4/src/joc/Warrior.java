package joc;

public class Warrior extends Player{

    public Warrior(String name, int pAtaque, int pDefensa, int life, String NombreEquipo) {
        super(name, pAtaque, pDefensa, life, NombreEquipo);
       
    }

    public void ataque(Player p) {
        
        
        
        System.out.println(p.toString());
        int vidaAntes = p.getLife();
        p.hit(this.getpAtaque());

        System.out.println("El jugador " + p.getName() + " ha sido atacado por el jugador " + getName() + " con " + getpAtaque() + " puntos de ataque"
                + ", se defendio con: " + p.getpDefensa() + " puntos de defensa. Antes del ataque tenía " + vidaAntes
                + " y después del ataque tiene: " + p.getLife());

        System.out.println(p.toString());
        System.out.println(" ");
        
        

    }

    protected void hit(int AtaqueP) {
        int daño;
        daño = AtaqueP - getpDefensa();
        
        if (daño <5){
            daño = 0;
        }
      
        int vida = getLife();
        
        vida = vida - daño;
        setLife(vida);
             
    }        
    }
    
    
  
