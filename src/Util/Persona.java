package Util;

public class Persona {

    public Persona() {
    }

    //Esto lo que hace es que les asigna valores por defecto a las variables
    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
    }

    //Declaracion de Metodo
    public boolean mayorEdad(Persona persona){

        if(persona.getEdad()>=18)
            return true;
        else
            return false;
    }


    private String nombre, sexo;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
