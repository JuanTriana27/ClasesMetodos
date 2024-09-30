import Util.Persona;
import java.util.Calendar;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {

        Persona persona = new Persona();
        Persona persona2 = new Persona("Natalia", 23, "Femenino");

        persona.setNombre("Juan Esteban");
        String nombrePersona = persona.getNombre();

        persona.setEdad(22);
        int edadPersona = persona.getEdad();

        persona.setSexo("Masculino");
        String sexoPersona = persona.getSexo();

        System.out.println("Nombre: " + nombrePersona);
        System.out.println("Edad = " + edadPersona);
        System.out.println("Sexo = " + sexoPersona);

        System.out.println("Nombre: " + persona2.getNombre() + "\nEdad: "+ persona2.getEdad() + "\nSexo: " + persona.getSexo());

        boolean esMayorEdad = persona2.mayorEdad(persona2);
        System.out.println("Es mayo de edad? " + esMayorEdad);

        //Clase Math
        System.out.println("Raiz Cuadrada de la Edad; " + Math.sqrt(persona2.getEdad()));
        System.out.println("Valor Minimo: " + Math.min(persona.getEdad(), persona2.getEdad()));
    }
}