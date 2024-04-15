/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core;

import java.util.ArrayList;

/**
 *
 * @author jregalado
 */
public class Campeonato {
    private ArrayList<Juego> juegos;

    public Campeonato() {
        this.juegos=new ArrayList<>();
    }
    
    public boolean addJuego(Juego juego){
        this.juegos.add(juego);
        return true;
    }
    
    public Juego getJuego(int index){
        return this.juegos.get(index);
    }
    
    public void showResumen(){
        String ganador;
        System.out.println("------------- Resultados -------------\n");
        for(Juego juego :  this.juegos){
            System.out.println("Jugador 1: "+juego.getJugador1().getNombre()+"\nJugador 2: "+juego.getJugador2().getNombre());
            int i=1;
            for (Set set : juego.getSets()) {
                System.out.println("Set "+i+": "+set.getPuntosJugador1()+" - "+set.getPuntosJugador2());
                i+=1;
            }
            System.out.println("Ganador: "+juego.getGanador().getNombre()+"\n");
            if(juego.getJuegoSiguiente()=null){ganador=juego.getGanador().getNombre();}
        }
    }
}
