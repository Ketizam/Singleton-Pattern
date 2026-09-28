

public class Main {
    public static void main(String[] args) {
        BoilerController control = new BoilerController();
        System.out.println("Initial state: ");
        System.out.println("Resistance: "+control.getBoilerResistance());
        System.out.println("State:"+control.getBoilerState());

        System.out.println(control.fillBoiler());
        
        System.out.println("Resistance: "+control.getBoilerResistance());
        System.out.println("State:"+control.getBoilerState());

        System.out.println(control.mixBoiler());

        System.out.println("Resistance: "+control.getBoilerResistance());
        System.out.println("State:"+control.getBoilerState());

        System.out.println(control.emptyBoiler());
        System.out.println("Resistance: "+control.getBoilerResistance());
        System.out.println("State:"+control.getBoilerState());
    }
}
