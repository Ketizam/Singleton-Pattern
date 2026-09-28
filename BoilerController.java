


public class BoilerController {
    private final Boiler boiler = Boiler.getInstance();

    
    public String fillBoiler(){
        if (boiler.getState().equalsIgnoreCase("empty") && boiler.getResistance().equalsIgnoreCase("off")){
            boiler.setState("full");
            return "Boiler filled with chocolate and milk";
        }
        return "Boiler could not be filled";
    }

    public String mixBoiler(){
        if (boiler.getState().equalsIgnoreCase("full") && boiler.getResistance().equalsIgnoreCase("off")){
            boiler.setResistance("on");
            return "Boiler mix procces started";
        }
        return "Boiler could not be mixed";
    }

    public String emptyBoiler(){
        if (!boiler.getState().equalsIgnoreCase("empty") && boiler.getResistance().equalsIgnoreCase("on")){
            boiler.setState("empty");
            boiler.setResistance("off");
            return "Boiler emptied";
        }
        return "Boiler could not be emptied";
    }

    public String getBoilerState() {
        return boiler.getState();
    }

    public String getBoilerResistance() {
        return boiler.getResistance();
    }
}
