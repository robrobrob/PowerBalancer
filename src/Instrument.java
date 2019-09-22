import java.util.ArrayList;

public class Instrument implements Connectable{
    String name;
    float voltage;
    float amperage;
    float wattage;
    boolean constant;
    ArrayList<Connector> input;
    ArrayList<Connector> output;
    boolean hasPassThrough;
    ArrayList<Phase> phase;
    ArrayList<Stipulation> stipulation;


}
