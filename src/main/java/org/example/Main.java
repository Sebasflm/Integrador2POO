package org.example;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Videojuego> listavideojuegos = new ArrayList<Videojuego>();
        Videojuego videojuego1= new Videojuego(15,"GTAV", "PS5", 20000,"historia");
        Videojuego videojuego2= new Videojuego(10,"VALORANT", "PC", 150000,"shooter");
        Videojuego videojuego3= new Videojuego(5,"Fortnite", "PC", 300000,"battleroyale");
        Videojuego videojuego4= new Videojuego(20,"Dota", "PC", 1000,"MOBA");
        Videojuego videojuego5= new Videojuego(25,"FACRY", "PS5", 5000,"trama");
        listavideojuegos.add(videojuego1);
        listavideojuegos.add(videojuego2);
        listavideojuegos.add(videojuego3);
        listavideojuegos.add(videojuego4);
        listavideojuegos.add(videojuego5);
        /*
        for (Videojuego videjuegos: listavideojuegos){
            System.out.println(""+videjuegos.getTitulo());
        }
*/
        String consolaunica="PS5";
        for (Videojuego videjuegos: listavideojuegos) {
            if (videjuegos.getConsola().equals(consolaunica)) {
                System.out.println( "Titulo: " + videjuegos.getTitulo()+
                                    "\n Consola: "+videjuegos.getConsola()+
                                    "\n Cantidad de jugadores: "+videjuegos.getCantidadJugadores()+
                                    "\n Categoria: "+videjuegos.getCategoria());
            }
        }
    }
}