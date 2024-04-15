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
public class Juez extends Persona{
    private int edad;
    private ArrayList<Juego> juegos;

    public Juez(String nombre,int edad) {
        super(nombre);
        this.edad = edad;
        this.juegos = new ArrayList<>();
    }
    
    public boolean addJuego(Juego juego){
        this.juegos.add(juego);
        return true;
    }
}
