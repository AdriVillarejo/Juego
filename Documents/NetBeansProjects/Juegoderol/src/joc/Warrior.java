package joc;

public class Warrior extends Player{

    public Warrior(String name, int pAtaque, int pDefensa, int life) {
        super(name, pAtaque, pDefensa, life);
       
    }

    public void ataque(Player p) {
        
        
        
        System.out.println(p.toString());
        int vidaAntes = p.life;
        p.hit(this.pAtaque);

        System.out.println("El jugador " + p.getName() + " ha sido atacado por el jugador " + getName() + " con " + getpAtaque() + " puntos de ataque"
                + ", se defendio con: " + p.getpDefensa() + " puntos de defensa. Antes del ataque tenía " + vidaAntes
                + " y después del ataque tiene: " + p.getLife());

        System.out.println(p.toString());
        System.out.println(" ");
        
        

    }

    protected void hit(int AtaqueP) {
        int daño;
        
        if (AtaqueP <5){
            AtaqueP = 0;
        }
        

        daño = AtaqueP - getpDefensa();

        int vida = getLife() - daño;
        setLife(vida);

    }        
    }
    
    
  
