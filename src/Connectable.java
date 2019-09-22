import java.util.ArrayList;

public interface Connectable {
    ArrayList<Connector> getInputs();
    ArrayList<Connector> getOutputs();
}
