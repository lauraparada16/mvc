/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Labing I5
 */
public class BD {
    private ArrayList<Persona> personas;
    
    
    public BD(){
    this.personas=new ArrayList<>();
    this.personas.add(new Persona ("Diana","Palermo"));
    this.personas.add(new Persona ("Nicolas","Palermo"));
    this.personas.add(new Persona ("Alejandro","Palermo"));
    this.personas.add(new Persona ("Luis","Palermo"));
    this.personas.add(new Persona ("Olivia","Palermo"));
    
    }
    
        public ArrayList<Persona> getPersonas(){
        return personas;
    }
    
        public void addPersona(Persona persona){
        this.personas.add(persona);
    }
        
    
    
}
