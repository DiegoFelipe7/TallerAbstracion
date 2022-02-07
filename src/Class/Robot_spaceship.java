/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import Interface.Spacecraft_interface;

/**
 *Nave espacial robot
 * @author Diego Felipe muñoz
 * 
 * En esta clase vamos a heredar los metodos de la clase padre llamada Spacesship como tambien vamos a implementar
 * los metodos de la interfas
 */
public class Robot_spaceship  extends Spaceship implements Spacecraft_interface{

    public Robot_spaceship(String name, int height, int widht, int weight, int speed, int destination_kilometers, String destination, String Useful_load, String ship_type, int fuel_type) {
        super(name, height, widht, weight, speed, destination_kilometers, destination, Useful_load, ship_type, fuel_type);
    }

    public Robot_spaceship() {
    }

    public boolean  minimum_weight(){
        boolean value;
        if(getWeight()>3200){
            value=false;
        }else{
            value=true;
        }
        return value;
    }
    
    @Override
    public String take_off() {
       String mensaje="";
       if(isTake_off()){
         mensaje="Successful liftoff of the spacecraft";
       }else{
         mensaje="Failure of the ship to take off, check that the ship is powered on. ";
       }
       return mensaje;
    
    }

    @Override
    public int Increase_Speed() {
         if(getWeight()>800){
            this.speed=this.speed+10;
        }else{
            this.speed=this.speed+30;
        
        }
        return this.speed;   }

    @Override
    public double estimated_arrival_time() {
        //vamos a realizar un calcula para saber el numero de minutos que se demora una nave hasta un destino
        //tiempo=kilometros/velocidad*minutos aplicamos la formular
        return (getDestination_kilometers()/getSpeed())*60;
    }
    /*
    *Metodo para encender la nave espacial para el despeque
    */
    @Override
    public void turn_on_spacecraft() {
        setTake_off(true);
    }
    
}
