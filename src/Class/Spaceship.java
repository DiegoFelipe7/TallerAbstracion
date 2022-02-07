package Class;

/**
 *
 * @author Diego Felipe Muñoz
 */
public abstract class Spaceship {
 /*
 *Declaracion de todos los atributos de la nave;   
 */
    public String name;
    public int height;
    public int widht;
    private int weight;
    public int speed;
    public int destination_kilometers;
    private String destination;
    private String Useful_load;
    public String ship_type;
    public int fuel_type;
    private boolean take_off=false;

    public Spaceship(String name, int height, int widht, int weight, int speed, int destination_kilometers, String destination, String Useful_load, String ship_type, int fuel_type) {
        this.name = name;
        this.height = height;
        this.widht = widht;
        this.weight = weight;
        this.speed = speed;
        this.destination_kilometers = destination_kilometers;
        this.destination = destination;
        this.Useful_load = Useful_load;
        this.ship_type = ship_type;
        this.fuel_type = fuel_type;
    }
    
    public Spaceship(){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidht() {
        return widht;
    }

    public void setWidht(int widht) {
        this.widht = widht;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDestination_kilometers() {
        return destination_kilometers;
    }

    public void setDestination_kilometers(int destination_kilometers) {
        this.destination_kilometers = destination_kilometers;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getUseful_load() {
        return Useful_load;
    }

    public void setUseful_load(String Useful_load) {
        this.Useful_load = Useful_load;
    }

    public String getShip_type() {
        return ship_type;
    }

    public void setShip_type(String ship_type) {
        this.ship_type = ship_type;
    }

    public int getFuel_type() {
        return fuel_type;
    }

    public void setFuel_type(int fuel_type) {
        this.fuel_type = fuel_type;
    }

    public boolean isTake_off() {
        return take_off;
    }

    public void setTake_off(boolean take_off) {
        this.take_off = take_off;
    }
    
    //metodo abstracto para encender la nave espacial
    public abstract String take_off();
    //metodo abstracto para aumentar la velocida de alguna de las naves
    public abstract int Increase_Speed();
    
}
