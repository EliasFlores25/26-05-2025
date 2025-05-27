public class Futbolista extends SuperClase {

    private int dorsal;
    private String demarcacion;

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public void jugarPartido() {
        System.out.println(getNombre() + " " + getApellidos() + " está jugando el partido.");
    }

    public void entrenar() {
        System.out.println(getNombre() + " " + getApellidos() + " está entrenando.");
    }

    @Override
    public String toString() {
        return "Futbolista: " + super.toString() + ", Dorsal: " + dorsal + ", Demarcación: " + demarcacion;
    }
}