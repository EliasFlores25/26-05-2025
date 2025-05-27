
public abstract class SuperClase {
    
    private int id;
    private String nombre;
    private String apellidos;
    private int edad;

    public SuperClase(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void concentrarse() {
        System.out.println(nombre + " " + apellidos + " se está concentrando.");
    }

    public void viajar() {
        System.out.println(nombre + " " + apellidos + " está viajando.");
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Apellidos: " + apellidos + ", Edad: " + edad;
    }
}