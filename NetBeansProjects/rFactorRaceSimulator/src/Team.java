/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sergio
 */
public class Team {
    private String name;
    private double reliability;
    
    public Team() {
        
    }
    
    //GETTERS
    public String get_name() {
        return name;
    }
    
    public double get_reliability() {
        return reliability;
    }
    
    //SETTERS
    public void set_name(String name) {
        this.name = name;
    }
    
    public void set_reliability(double reliability) {
        this.reliability = reliability;
    }
}
