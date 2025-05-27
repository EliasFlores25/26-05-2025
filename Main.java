public class Main {

    public static void main(String[] args) {

        System.out.println("   Creación de Miembros del Equipo");
        
        Futbolista ronaldo = new Futbolista(1, "Cristiano", "Ronaldo", 38, 7, "Delantero");
        Entrenador ancelotti = new Entrenador(3, "Carlo", "Ancelotti", 64, "ESP-1234");
        Masajista pedro = new Masajista(4, "Pedro", "Lopez", 45, "Fisioterapeuta", 15);

        System.out.println("Demostración de Métodos Comunes (Heredados de SeleccionFutbol)");

        ronaldo.concentrarse();
        ronaldo.viajar();
        System.out.println(ronaldo.toString());

        ancelotti.concentrarse();
        ancelotti.viajar();
        System.out.println(ancelotti.toString());

        pedro.concentrarse();
        pedro.viajar();
        System.out.println(pedro.toString());

        System.out.println("Demostración de Métodos Específicos de cada Subclase");
        ronaldo.entrenar();
        ronaldo.jugarPartido();

        ancelotti.dirigirEntrenamiento();
        ancelotti.dirigirPartido();

        pedro.darMasaje();

        System.out.println("Acceso y Modificación de Atributos (Demostración de Encapsulamiento con Getters y Setters)");
        System.out.println("Dorsal de Ronaldo: " + ronaldo.getDorsal());
        ronaldo.setDorsal(9);
        System.out.println("Nuevo dorsal de Ronaldo: " + ronaldo.getDorsal());

        System.out.println("ID de Federación de Ancelotti: " + ancelotti.getIdFederacion());

        System.out.println("Titulación del Masajista Pedro: " + pedro.getTitulacion());
        System.out.println("Años de experiencia de Pedro: " + pedro.getAniosExperiencia());
        
        pedro.setAniosExperiencia(18);
        System.out.println("Nueva experiencia de Pedro: " + pedro.getAniosExperiencia());
    }
}