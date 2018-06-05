
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sergio
 * Grid contiene todos los pilotos de la parrilla
 */
public class Grid {
    private ArrayList<Driver> parrilla = new ArrayList<>();
    private ArrayList<Team> escuderias = new ArrayList<>();
    
    public Grid() {
        
    }
    
    public ArrayList<Driver> get_parrilla() {
        return parrilla;
    }
    
    public ArrayList<Team> get_escuderias() {
        return escuderias;
    }
    
    public void add_driver(Driver d) {
        this.parrilla.add(d);
    }
    
    public void add_team(Team t) {
        this.escuderias.add(t);
    }
    
    public void updategrid(ArrayList<Driver> newgrid) {
        this.parrilla = newgrid;
    }
    
    public void updateteams(ArrayList<Team> newteams) {
        this.escuderias = newteams;
    }
    
    public void printDrivers() {
        for(int i = 0; i < parrilla.size(); ++i) {
            System.out.println(parrilla.get(i).get_name());
        }
    }
    
    public void printTeams() {
        for(int i = 0; i < escuderias.size(); ++i) {
            System.out.println(escuderias.get(i).get_name());
        }
    }
    
    public double findTeamReliability(Driver d) {
        double dnf = 0;
        boolean trobat = false;
        
        String equipo = d.get_team();
        int i = 0;
        while(i < escuderias.size() && !trobat) {
            if(escuderias.get(i).get_name().equals(equipo)) {
                trobat = true;
                dnf = escuderias.get(i).get_reliability();
            }
            ++i;
        } 
        return dnf;
    }
    
    public int findDriverNumber(String name) {
        boolean trobat = false;
        int num = 0;
        int i = 0;
        while(i < parrilla.size() && !trobat) {
            if(parrilla.get(i).get_name().equals(name)) {
                trobat = true;
                num = parrilla.get(i).get_number();
            }
            ++i;
        } 
        return num;
    }
}
