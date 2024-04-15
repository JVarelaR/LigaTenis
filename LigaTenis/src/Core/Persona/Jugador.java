/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core.Persona;

import Core.Juego;
import java.util.ArrayList;

/**
 *
 * @author jregalado
 */
public class Jugador extends Persona{
    private int sueldo;
    private ArrayList<Juego> juegos;

    public Jugador(String nombre,int sueldo) {
        super(nombre);
        this.sueldo = sueldo;
        this.juegos= new ArrayList<>();
    }
    
    public boolean addJuego(Juego juego){
        this.juegos.add(juego);
        return true;
    }


    
    
}
