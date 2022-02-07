/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import Interface.Spacecraft_interface;
import javax.swing.JOptionPane;

/**
 *Nave lancero
 * @author Diego Felipe muñoz
 * 
 * En esta clase vamos a heredar los metodos de la clase padre llamada Spacesship como tambien vamos a implementar
 * los metodos de la interfas
 */
public class Lancer_spaceship extends Spaceship implements Spacecraft_interface{

    public Lancer_spaceship(String name, int height, int widht, int weight, int speed, int destination_kilometers, String destination, String Useful_load, String ship_type, int fuel_type) {
        super(name, height, widht, weight, speed, destination_kilometers, destination, Useful_load, ship_type, fuel_type);
    }
       
    public Lancer_spaceship(){
        
    }
    
    /*
     *Metodo par valida si la nave espacion despego exitosamente para esto utilizamos una validacion 
     *si la nave esta encendida siginifica que la nave puede despegar exitosa mente
     */
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
        this.speed=this.speed+10;
        return this.speed;
    }

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
    
    /*
    *Este metodo es para calcular el numero de kilometros que puede recorrer una nave espacial con un litro de 
    *combustible
    *
    */ public int gasolina_performance(){
          int tank=(getDestination_kilometers()/getFuel_type());
          return tank;
    }
  
    
  
    
}
