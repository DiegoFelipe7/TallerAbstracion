
package Main;

import java.util.ArrayList;
import Class.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Diego Felipe Muñoz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Manned_spaceship> manned_arrangement = new ArrayList<Manned_spaceship>();
        ArrayList<Unmanned_spacecraft>unmanned_arrangement  = new ArrayList<Unmanned_spacecraft>();
        ArrayList<Lancer_spaceship> lancer_arrangement = new ArrayList<Lancer_spaceship>();
        ArrayList<Robot_spaceship> robot_arrangement = new ArrayList<Robot_spaceship>();
        boolean bandera=true;
        String opcion,name,destination,Useful_load,ship_type,tipocombustible,height,widht,destination_kilometers,weight,speed,cargaUtil,fuel_type;
        while (bandera) {            
            opcion =JOptionPane.showInputDialog("!Welcome to the spacecraft creation system.¡ \n  select an option \n 1.create a spacecraft \n 2.launching a spacecraft \n  3.Exit");
            switch(opcion){
                case "1":
                    /*
                    *Declaramos variables para capturar los valores y enviarlos por medio del constructo
                    */
                    name =JOptionPane.showInputDialog("Enter the name");
                    height =JOptionPane.showInputDialog("Enter the stop");
                    widht =JOptionPane.showInputDialog("Enter the width");
                    weight=JOptionPane.showInputDialog("Enter the weight");
                    speed=JOptionPane.showInputDialog("Enter the speed");
                    destination_kilometers =JOptionPane.showInputDialog("Kilometros Destino");
                    destination=JOptionPane.showInputDialog("enter the target planet");
                    Useful_load=JOptionPane.showInputDialog("enter payload");
                    ship_type=JOptionPane.showInputDialog(" enter the type of spacecraft : \n manned spacecraft\n unmanned spacecraft \n lancer spacecraft \n robot spacecraft");
                    fuel_type=JOptionPane.showInputDialog("fuel capacity");
                    //Evaluamos con una condicion el tipo de nave es  para posterior mente ser almacenada en su respetivo arreglo
                    //Condicion para la nave tripulada
                    if(ship_type.equalsIgnoreCase("manned spacecraft")){
                         //llamamos el metodo constructo para llenar los datos de las naves tripuladas y realizamos un casteo para convertir valores de tipo string a entero
                         Spaceship manned_spaceship = new Manned_spaceship(name, Integer.parseInt(height), Integer.parseInt(widht), Integer.parseInt(weight), Integer.parseInt(speed), Integer.parseInt(destination_kilometers), destination, Useful_load, ship_type, Integer.parseInt(fuel_type));
                         manned_arrangement.add((Manned_spaceship)manned_spaceship);
                         JOptionPane.showMessageDialog(null, "spacecraft successfully created");
                    //condicion para nave no tripulada
                    }else if(ship_type.equalsIgnoreCase("unmanned spacecraft")){
                         Spaceship unmanned_spacecraft = new Unmanned_spacecraft(name, Integer.parseInt(height), Integer.parseInt(widht), Integer.parseInt(weight), Integer.parseInt(speed), Integer.parseInt(destination_kilometers), destination, Useful_load, ship_type, Integer.parseInt(fuel_type));
                         unmanned_arrangement.add((Unmanned_spacecraft) unmanned_spacecraft);
                         JOptionPane.showMessageDialog(null, "spacecraft successfully created");
                     //condicion para la nave lancero
                    }else if(ship_type.equalsIgnoreCase("lancer spacecraft")){
                         Spaceship lancer_spaceship = new Lancer_spaceship(name, Integer.parseInt(height), Integer.parseInt(widht), Integer.parseInt(weight), Integer.parseInt(speed), Integer.parseInt(destination_kilometers), destination, Useful_load, ship_type, Integer.parseInt(fuel_type));
                         lancer_arrangement.add((Lancer_spaceship) lancer_spaceship);
                         JOptionPane.showMessageDialog(null, "spacecraft successfully created");
                    //condicion para nave robot
                    }else if(ship_type.equalsIgnoreCase("robot spacecraft")){
                         Spaceship robot_spaceship = new Robot_spaceship(name, Integer.parseInt(height), Integer.parseInt(widht), Integer.parseInt(weight), Integer.parseInt(speed), Integer.parseInt(destination_kilometers), destination, Useful_load, ship_type, Integer.parseInt(fuel_type));
                         robot_arrangement.add((Robot_spaceship) robot_spaceship);
                         JOptionPane.showMessageDialog(null, "spacecraft successfully created");
                    }else{
                        JOptionPane.showMessageDialog(null, "this option does not exist");
                    }
                    break;
                   
                case "2":
                    /*
                    *Validamos el tipo de nave que va realizar el despeque 
                    *iteramos con un for los respetivos arraylist 
                    */
                      ship_type=JOptionPane.showInputDialog(" enter the type of spacecraft : \n manned spacecraft\n unmanned spacecraft \n lancer spacecraft \n robot spacecraft");
                        if(ship_type.equalsIgnoreCase("manned spacecraft")){
                            for (Manned_spaceship manned_spaceship : manned_arrangement) {
                                manned_spaceship.turn_on_spacecraft();
                                if(manned_spaceship.isTake_off()){
                                   manned_spaceship.Increase_Speed();
                                  JOptionPane.showMessageDialog(null,manned_spaceship.take_off());
                                  JOptionPane.showMessageDialog(null, "the spacecraft took off at a speed of "+manned_spaceship.getSpeed()+" km/h and the estimated time of arrival in "+manned_spaceship.getDestination() +" is " +manned_spaceship.estimated_arrival_time() +" minutes.");
                                }
                            }
                        }
                        else if(ship_type.equalsIgnoreCase("unmanned spacecraft")){
                            for (Unmanned_spacecraft unmanned_spacecraft : unmanned_arrangement) {
                                  unmanned_spacecraft.turn_on_spacecraft();
                                if(unmanned_spacecraft.isTake_off()){
                                   unmanned_spacecraft.Increase_Speed();
                                  JOptionPane.showMessageDialog(null,unmanned_spacecraft.take_off());
                                  JOptionPane.showMessageDialog(null, "the spacecraft took off at a speed of "+unmanned_spacecraft.getSpeed()+" km/h and the estimated time of arrival in "+unmanned_spacecraft.getDestination() +" is " +unmanned_spacecraft.estimated_arrival_time() +" hours.");
                                }
                            }
                            
                        } else if(ship_type.equalsIgnoreCase("lancer spacecraft")){
                            for (Lancer_spaceship lancer_spaceship : lancer_arrangement) {
                                  lancer_spaceship.turn_on_spacecraft();
                                if(lancer_spaceship.isTake_off()){
                                  JOptionPane.showMessageDialog(null,lancer_spaceship.take_off()); 
                                  JOptionPane.showConfirmDialog(null, "This spacecraft consumes" + lancer_spaceship.gasolina_performance() + "liters of fuel to travel one kilometer" );
                                  JOptionPane.showMessageDialog(null, "the spacecraft took off at a speed of "+lancer_spaceship.getSpeed()+" km/h and the estimated time of arrival in "+lancer_spaceship.getDestination() +" is " +lancer_spaceship.estimated_arrival_time() +" hours.");
                                  JOptionPane.showMessageDialog(null, lancer_arrangement.toString());
                                }else{
                                    JOptionPane.showMessageDialog(null, "spacecraft error occurred check ignition or tank capacity");
                                }
                            }
                            
                        } else if(ship_type.equalsIgnoreCase("robot spacecraft")){
                               for (Robot_spaceship robot_spaceship : robot_arrangement) {
                                  robot_spaceship.turn_on_spacecraft();
                                if(robot_spaceship.isTake_off() && robot_spaceship.minimum_weight()){
                                  JOptionPane.showMessageDialog(null,robot_spaceship.take_off());
                                  JOptionPane.showMessageDialog(null, "the spacecraft took off at a speed of "+robot_spaceship.getSpeed()+" km/h and the estimated time of arrival in "+robot_spaceship.getDestination() +" is " +robot_spaceship.estimated_arrival_time() +" hours.");
                                }else{
                                    JOptionPane.showMessageDialog(null, "verifies that the vessel is powered on and its weight is less than 3200 tons.");
                                }
                            }
                        }else{
                           JOptionPane.showMessageDialog(null, "this option does not exist");
                    
                        }
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "see you soon");
                    bandera=false;
                    
            }
        }
    
    }
    
}
