public class Entrenador extends SuperClase {
  
    private String idFederacion;

    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public void dirigirPartido() {
        System.out.println(getNombre() + " " + getApellidos() + " (Entrenador) está dirigiendo el partido.");
    }

    public void dirigirEntrenamiento() {
        System.out.println(getNombre() + " " + getApellidos() + " (Entrenador) está dirigiendo el entrenamiento.");
    }

    @Override
    public String toString() {
        return "Entrenador: " + super.toString() + ", ID Federación: " + idFederacion;
    }
}