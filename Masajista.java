public class Masajista extends SuperClase {
   
    private String titulacion;
    private int aniosExperiencia; //Años(Ñ).

    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {

        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public void darMasaje() {
        System.out.println(getNombre() + " " + getApellidos() + " (Masajista) está dando un masaje.");
    }

    @Override
    public String toString() {
        return "Masajista: " + super.toString() + ", Titulación: " + titulacion + ", Años de Experiencia: " + aniosExperiencia;
    }
}