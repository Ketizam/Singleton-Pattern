


public class Boiler {
    
    private static Boiler instance; 
    private String state;
    private String resistance;
    private Boiler(){
        this.state = "empty";
        this.resistance = "off";
    }

    public static Boiler getInstance(){
        if(instance == null){
            instance = new Boiler();
        }
        
        return instance;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getResistance() {
        return resistance;
    }

    public void setResistance(String resistance) {
        this.resistance = resistance;
    }

}
