package inici;
import java.util.*;
import joc.*;
import io.Utilidades;


public class Juegoderol {
    
   static Scanner sc = new Scanner (System.in); 
   // arrays
   static ArrayList<Player> Players1 = new ArrayList();
   static ArrayList<Team> Teams1 = new ArrayList();
   static ArrayList<Item> Items1 = new ArrayList();
   
    public static void main(String[] args) throws ExcepcionRepeJuga, ExcepcionPerte, ExcepcionORepetido {
        
        boolean fin = true;
        
        while (fin){
        
// menu
        System.out.println("Bienvenido al juego de rol!");
        System.out.println(" ");
        System.out.println("Menú");
        System.out.println(" ");
        System.out.println("Seleccione una opción: \n1.Configuracion \n2.Jugar \n3.Salir ");
        int opcion = sc.nextInt();
        sc.nextLine();
           //menu de configuracion
        if (opcion == 1){
                
            System.out.println("------Menu de la configuración------");
            System.out.println("Seleccione una opción: \n1.1 Gestión de jugadores. \n1.2 Gestión de equipos \n1.3 Gestion de objetos \n1.4. Salir" );
            double opcion_config = Utilidades.leerDouble("Elija su opción: ");
            // menu de los jugadores
            if (opcion_config == 1.1 ){
                System.out.println("Bienvenido al menú de los jugadores!");
                System.out.println("");
                System.out.println("Qué quiere hacer? \n1.1.1 Crear a un jugador. \n1.1.2 Mostrar jugadores \n1.1.3 Borrar jugadores \n1.1.4 Asignar un jugador a un equipo"
                            + " \n1.1.5 Asignar un objeto a un jugador \n1.1.6 Salir  ");
                String opcion_jugadores = sc.nextLine();
                
                // elección de jugadores
                if ("1.1.1".equals(opcion_jugadores)){
                        
                    System.out.println("Que clase quiere escoger? \nH: Humano \nW: Warrior \nA: Alien");
                    String clase = Utilidades.leerTexto("Elija su opción: ");
                        // humano
                    if ("H".equals(clase)){
                        System.out.println("Has seleccionado a un humano, buena elección! ");
                        String nombre_humano = Utilidades.leerTexto("Introduza el nombre del humano! ");
                        int pa = Utilidades.leerEntero("Introduce los puntos de ataque de tu personaje! ");
                        if (pa < 0 || pa > 100){    
                        pa = Utilidades.leerEntero("Los puntos de ataque no pueden ser mayores que 100 ni menores que 0, vuelve a intentarlo :( ");
                        }
                        
                        int pd = 100 - pa;
                        Human human1 = new Human(nombre_humano, pa, pd, 100);
                        boolean repetido = true;
                        
                        for (int i = 0; i < Players1.size(); i++)
                            {
                                
                                if (Players1.get(i).equals(human1))
                                { 
                                    repetido = true;
                                    System.out.println("No pueden haber 2 personajes con el mismo nombre, lo siento ");                                
                                }                           
                    }                      
                        if (repetido)
                        {
                            Players1.add(human1 );
                        }                            
            }
                    // warrior 
                    else if ("W".equals(clase)){
                        System.out.println("Has seleccionado a un warrior, buena elección! ");
                        String nombre_warrior = Utilidades.leerTexto("Introduza el nombre del warrior! ");
                        int pa = Utilidades.leerEntero("Introduce los puntos de ataque de tu personaje! ");
                        if (pa < 0 || pa > 100){    
                        pa = Utilidades.leerEntero("Los puntos de ataque no pueden ser mayores que 100 ni menores que 0, vuelve a intentarlo :( ");
                        }
                        
                        int pd = 100 - pa;
                        Warrior warrior1 = new Warrior(nombre_warrior, pa, pd, 100);
                        boolean repetido = true;
                        
                        for (int i = 0; i < Players1.size(); i++)
                            {             
                                if (Players1.get(i).equals(warrior1))
                                { 
                                    repetido = true;
                                    System.out.println("No pueden haber 2 personajes con el mismo nombre, lo siento ");                                
                                }                           
                    }                      
                        if (repetido)
                        {
                            Players1.add(warrior1);
                        }                            
            } 
                    // alien
                    else if ("A".equals(clase)){
                        System.out.println("Has seleccionado a un alien, buena elección! ");
                        String nombre_alien = Utilidades.leerTexto("Introduza el nombre del alien! ");
                        int pa = Utilidades.leerEntero("Introduce los puntos de ataque de tu personaje! ");
                        if (pa < 0 || pa > 100){    
                        pa = Utilidades.leerEntero("Los puntos de ataque no pueden ser mayores que 100 ni menores que 0, vuelve a intentarlo :( ");
                        }
                        
                        int pd = 100 - pa;
                        Alien alien1 = new Alien (nombre_alien, pa, pd, 100);
                        boolean repetido = true;
                        // bucle que recorre players1
                        for (int i = 0; i < Players1.size(); i++)
                            {
                                
                                if (Players1.get(i).equals(alien1))
                                { 
                                    repetido = true;
                                    System.out.println("No pueden haber 2 personajes con el mismo nombre, lo siento ");                                
                                }                           
                    }                      
                        if (repetido)
                        {
                            Players1.add(alien1);
                        }                            
            } 
                }
                    // devuelve el arraylist de players
                else if ("1.1.2".equals(opcion_jugadores)){
                        System.out.println(Players1);     
                    } 
                    
                
                // sirve para eliminar un jugador de un arraylist
                else if ("1.1.3".equals(opcion_jugadores)){
                    
                      String borrar = Utilidades.leerTexto("Introduce el nombre del jugador que quieres eliminar ");                      
                    for (int i = 0; i < Players1.size(); i++)
            {
                
                    if (Players1.get(i).getName().equals(borrar))
                            {               
                        Players1.remove(i);  
                            }
                        else
                            {   
                        System.out.println("El jugador no se encuentra en la lista "); 
                            }
                        
                    }
                }
                    // añadir un equipo a un jugador
                else if ("1.1.4".equals(opcion_jugadores)){
                        
                    Team equipo1 = new Team();
                    Player jugador1 = new Player();
                    
                    String jugador_equipo = "";
                    String equipo_jugador = "";
                    
                    System.out.println("Introduce el nombre del jugador!");
                    jugador_equipo = sc.nextLine();
                    
                    System.out.println("Ahora dime a qué equipo lo quieres añadir! ");
                    equipo_jugador = sc.nextLine();
                // bucle que recorre players1
                    for (int i = 0; i < Players1.size(); i++) {
                        if (Players1.get(i).getName().equals(jugador_equipo)) { jugador1 = Players1.get(i); }
                        }
                    // bucle que recorre teams1
                    for (int i = 0; i < Teams1.size(); i++) {
                        if (Teams1.get(i).getNombreEquipo().equals(equipo_jugador)) { equipo1 = Teams1.get(i); }
                            }
                    try
                    {

                        jugador1.add(equipo1);
                        equipo1.add(jugador1);

                    }
                    catch(ExcepcionRepeJuga ex)
                    {

                        System.out.println("Error: " + ex.getMessage());

                    }




                }
            
                        
                                  // añadir un item a un jugador
                else if ("1.1.5".equals(opcion_jugadores)){
                    
                    Item añadir_item = new Item();
                    Player item_jugador = new Player();

                    String ni_jugador = "";
                    String n_item = "";
                    System.out.println("Dime el nombre del jugador al que quieres añadir un objeto");
                    ni_jugador = sc.nextLine();
                    System.out.println("Dime el nombre del objeto que quieres darle");
                    n_item = sc.nextLine();

                        for (int i = 0; i < Players1.size(); i++) {
                            if (Players1.get(i).getName().equals(ni_jugador)) {
                                item_jugador = Players1.get(i);
                                        }
                                    }
                        for (int i = 0; i < Teams1.size(); i++) {

                            if (Items1.get(i).getName().equals(n_item))
                                        {
                                añadir_item = Items1.get(i);
                                        }
                                    }
                        item_jugador.addItem(añadir_item);
                    }
                        
                    // salir
                else if ("1.1.6".equals(opcion_jugadores)){
                         
                    break;
                    }
                
            }
            // menu de los equipos
            else if (opcion_config == 1.2){
                
                System.out.println("Bienvenido al menú de los equipos! ");
                System.out.println("");
                System.out.println("Elige una opción: \n 1.2.1 Crear equipo \n1.2.2 Mostrar equipos \n 1.2.3 Borrar equipo \n1.2.4 Assignar equipo a un jugador \n1.2.5 Salir");
                String opcion_s = sc.nextLine();
                
                // sirve para crear un equipo nuevo
                if ("1.2.1".equals(opcion_s)){
                    
                    String nombreteam = Utilidades.leerTexto("Introduce el nombre del nuevo equipo! ");
                    Team equipo = new Team(nombreteam);
                    
                    boolean repetido = true;
                    for (int i = 0; i < Teams1.size(); i++)
                       {       
                           if (Teams1.get(i).equals(equipo))
                           { 
                               repetido = true;
                               System.out.println("El nombre del equipo ya existe.");    
                           }                 
                       }                      
                       if (repetido)
                           {        
                               Teams1.add(equipo);                          
                           }                  
                    }
                // muestra el arraylist de los equipos
                else if ("1.2.2".equals(opcion_s)){
                    
                    System.out.println(Teams1);
                }
                // eliminar equipos del array
                else if ("1.2.3".equals(opcion_s)){
                    
                    String borrar = Utilidades.leerTexto("Introduce el nombre del equipo que quieres eliminar ");
                                    
                    for (int i = 0; i < Teams1.size(); i++)
            {
                
                    if (Teams1.get(i).getNombreEquipo().equals(borrar))
                            {               
                        Teams1.remove(i);  
                            }
                        else
                            {   
                        System.out.println("El equipo no se encuentra en la lista "); 
                            }
                        
                    }
            
                }
                
                // metodo para añadir un jugador a un equipo
                else if ("1.2.4".equals(opcion_s)){
                    
                    Team equipo1 = new Team();
                    Player jugador1 = new Player();
                    
                    String jugador_equipo = "";
                    String equipo_jugador = "";
                    
                    System.out.println("Introduce el nombre del jugador!");
                    jugador_equipo = sc.nextLine();
                    
                    System.out.println("Ahora dime a qué equipo lo quieres añadir! ");
                    equipo_jugador = sc.nextLine();

                    for (int i = 0; i < Players1.size(); i++) {
                        if (Players1.get(i).getName().equals(jugador_equipo)) { jugador1 = Players1.get(i); }
                        }
                    
                    for (int i = 0; i < Teams1.size(); i++) {
                        if (Teams1.get(i).getNombreEquipo().equals(equipo_jugador)) { equipo1 = Teams1.get(i); }
                            }

                    try
                    {

                        equipo1.add(jugador1);
                        jugador1.add(equipo1);

                    }
                    catch(ExcepcionRepeJuga ex)
                    {

                        System.out.println("Error: " + ex.getMessage());

                    }

                }
            // metodo para salir
                else if ("1.2.5".equals(opcion_s)){
                   
                    break;
                    
                    
                }
                    
                }
            // menu de objetos 
            else if (opcion_config == 1.3) {
                System.out.println("Bienvenido al menú de los objetos!");
                System.out.println("");
                System.out.println("Elige una opción: \n1.3.1 Crear objeto \n1.3.2 Mostrar objetos \n1.3.3 Borrar objetos \n1.3.4 Asignar un objeto a un jugador \n1.3.5 Salir");
                String opcion_item = sc.nextLine();
            // metodo para crear un nuevo item
            
                if ("1.3.1".equals(opcion_item)) {


                    String nombreitem = Utilidades.leerTexto("Introduce el nombre del nuevo item! ");
                    int pa = Utilidades.leerEntero("Introduce los puntos de ataque del item! ");
                    if (pa < 0 || pa > 100) {
                        pa = Utilidades.leerEntero("Los puntos de ataque no pueden ser mayores que 100 ni menores que 0, vuelve a intentarlo :( ");
                    }
                    int pd = 100 - pa;
                    Item item1 = new Item(pa, pd, nombreitem);
                    boolean repetido = true;
                    for (int i = 0; i < Items1.size(); i++) {
                        if (Items1.get(i).equals(item1)) {
                            repetido = true;
                            System.out.println("El nombre del item ya existe.");
                        }
                    }
                    if (repetido) {
                        Items1.add(item1);
                    }
                    
                    // muestra el array de items
                } else if ("1.3.2".equals(opcion_item)) {

                    System.out.println(Items1);

                    // metodo para eliminar un item del array
                } else if ("1.3.3".equals(opcion_item)) {

                    String borrar = Utilidades.leerTexto("Introduce el nombre del item que quieres eliminar ");

                    for (int i = 0; i < Items1.size(); i++) {

                        if (Items1.get(i).getName().equals(borrar)) {
                            Items1.remove(i);
                        } else {
                            System.out.println("El item no se encuentra en la lista ");
                        }

                    }


                    // metodo para añadir un item a un jugador
                } else if ("1.3.4".equals(opcion_item)) {

                    Item añadir_item = new Item();
                    Player item_jugador = new Player();

                    String ni_jugador = "";
                    String n_item = "";
                    System.out.println("Dime el nombre del jugador al que quieres añadir un objeto");
                    ni_jugador = sc.nextLine();
                    System.out.println("Dime el nombre del objeto que quieres darle");
                    n_item = sc.nextLine();

                    for (int i = 0; i < Players1.size(); i++) {
                        if (Players1.get(i).getName().equals(ni_jugador)) {
                            item_jugador = Players1.get(i);
                        }
                    }
                    for (int i = 0; i < Teams1.size(); i++) {

                        if (Items1.get(i).getName().equals(n_item)) {
                            añadir_item = Items1.get(i);
                        }
                    }
                    item_jugador.addItem(añadir_item);

            }
                // metodo para salir
                else if ("1.3.5".equals(opcion_item)){
                    
                    break;
                }
            }
    
        }
        
        else if(opcion == 2){
            
            Random random = new Random();
                
                System.out.println("Vamos a jugar!");
                // cremos 2 personajes default
                Alien Default = new Alien("NPC 1", 30, 6, 100);
                Human Default1 = new Human("NPC 2", 15, 15, 100);

 // los añadimos al array
                Players1.add(Default);
                Players1.add(Default1);

                
                Player Prueba = new Alien();
                Player Prueba2 = new Human();
                
                // aqui empieza el juego con el bucle while
                while (Players1.size() > 1)
                {
                       
                Scanner scanner = new Scanner(System.in);
                String finalizar = "fin";
                System.out.println("Pulse enter para continuar ");        
                do{
                    finalizar  = scanner.nextLine();
                    System.out.println(finalizar);
                        
                    
                    boolean correcto = false;
                    boolean findeljuego = true;
                    
                    Player Jugador1 = Players1.get(random.nextInt(Players1.size()));
                    Player Jugador2 = Players1.get(random.nextInt(Players1.size()));
                     
                    System.out.println(Players1);
                  
                        
                    
                    if (Prueba != Jugador1 && Prueba2 != Jugador2 && Jugador1 != Jugador2)
                    {   
                        correcto = true;        
                    }
                    
                    Prueba = Jugador1;
                    Prueba2 = Jugador2;
                    

                    if (correcto == true) {
                        if (Players1.size() >= 2)
                            {
                                Jugador1.ataque(Jugador2);
                             
                                if (Jugador2.getLife() > 0)
                                {
                                    Jugador2.ataque(Jugador1);
                                } 
                            }
                        
                        if (Jugador1.getLife() <= 0)
                        {
                            
                        Players1.remove(Jugador1);     
                        }
                        if (Jugador2.getLife() <= 0)
                        {
                            Players1.remove(Jugador2);                            
                        }

                        else if (Players1.size() == 1)
                        {   
                            System.out.println("El jugador " + Players1 + " \nHa ganado, enhorabuena campeón!");

                        }

                    }
                    
                     }
                     while(finalizar.equals("fin"));
                }

            }
// fin del juego
        else if (opcion == 3){
            fin = false;
        }
    }
}
}


    

    /**
        public static void provaFase(){
        
        // CREANDO LAS CLASES
        System.out.println("Creando el humano...");
        Human human1 = new Human("Passif", 20 , 8 , 55, "Fila 8");
        System.out.println("Humano creado :)");
        System.out.println(" ");
        
        System.out.println("Creando el guerrero...");
        Warrior warrior1 = new Warrior("Parrilla", 15, 10, 65, "Fila 4,5");
        System.out.println("Guerrrero creado :) ");
        System.out.println(" ");
        
        System.out.println("Creando el alien...");
        Alien alien1 = new Alien("Jorge" , 30 , 6 , 50, "Fila 5");
        System.out.println("Alien creado :)");
        System.out.println(" ");
        
        
        // ITEMS
        Item item1 = new Item(10,5, "EspadaTruco");
        human1.addItem(item1);
        
        
        // ATAQUES
        human1.ataque(alien1);
        
        warrior1.ataque(human1);
        
        alien1.ataque(warrior1);
             
        // EQUIPOS
        Team ClanComputacion = new Team("Clan Computación");
        Team XancletaTeam = new Team ("Xancleta Team");
        
        ClanComputacion.add(alien1);
        ClanComputacion.add(human1);
        ClanComputacion.add(warrior1);
        XancletaTeam.add(alien1);
        
        System.out.println(" ");
        ClanComputacion.getMembers();
        System.out.println(" ");
        XancletaTeam.getMembers();  
         }
        */
        
       
        
        
       
    
        
             
       
        
            
    

