
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sergio
 */
public class Driver 
{
    private String name;
    private int number;
    private String nationality;
    private String team;
    private ArrayList<Double> performance = new ArrayList();
    private float crash;
    
    public Driver() {
    }
    
    //GETTERS
    public String get_name() {
        return name;
    }
    
    public int get_number() {
        return number;
    }
    
    public String get_nationality() {
        return nationality;
    }
    
    public String get_team() {
        return team;
    }
    
    public ArrayList<Double> get_performance() {
        return performance;
    }
    
    public float get_crashProbability() {
        return crash;
    }
    
    //SETTERS
    public void set_name(String name) {
        this.name = name;
    }
    
    public void set_number(int number) {
        this.number = number;
    }
    
    public void set_nationality(String nationality) {
        this.nationality = nationality;
    }
    
    public void set_team(String team) {
        this.team = team;
    }
    
    public void set_performance(ArrayList<Double> perfor) {
        this.performance = perfor;
    }
    
    public void set_crashProbability(float crash) {
        this.crash = crash;
    }
    
    //OTHER FUNCTIONS
    
    public void add_performance(double f) {
        this.performance.add(f);
    }
    
    public void print_driver_info() {
        System.out.println("Name: " + this.name);
        System.out.println("Number: " + this.number);
        System.out.println("Nationality: " + this.nationality);
        System.out.println("Team: " + this.team);
        for(int i = 0; i < performance.size(); ++i) {
            System.out.println(performance.get(i));
        }
        System.out.println("AvgCrash: " + this.crash);
        
    }
}
