/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import Interface.Spacecraft_interface;

/**
 *Nave espacial no tripulada
 * @author Diego Felipe muñoz
 * 
 * En esta clase vamos a heredar los metodos de la clase padre llamada Spacesship como tambien vamos a implementar
 * los metodos de la interfas
 */
public class Unmanned_spacecraft extends Spaceship implements Spacecraft_interface {

    public Unmanned_spacecraft(String name, int height, int widht, int weight, int speed, int destination_kilometers, String destination, String Useful_load, String ship_type, int fuel_type) {
        super(name, height, widht, weight, speed, destination_kilometers, destination, Useful_load, ship_type, fuel_type);
    }

    public Unmanned_spacecraft() {
    }

    @Override
    public void turn_on_spacecraft() {
     setTake_off(true);
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
    /*
     *metodo par aumentar la velocidad de una nave espacial en este caso utilizamos una validacion
    *en la cual se evalua si el peso de la nave es mayor a 800 kilos el incremente de velocidad sera de 10
    *de lo contrario el incremento de velocidad sera de 30
    */
    @Override
    public int Increase_Speed() {
        if(getWeight()>800){
            this.speed=this.speed+10;
        }else{
            this.speed=this.speed+30;
        
        }
        return this.speed;
    }
    /*
    *vamos a realizar un calculo para saber el numero de horas que se demora una nave hasta un destino
    *tiempo=kilometros/velocidad aplicamos la formular
        
    */
    @Override
    public double estimated_arrival_time() {
        return (getDestination_kilometers()/getSpeed());
    }
    
}
