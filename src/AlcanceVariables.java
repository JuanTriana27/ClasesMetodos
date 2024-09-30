public class AlcanceVariables {
    
    String apellido = "Triana";
    
    
    public String holaMundo (String nombre){
        String apellido = "Narvaez";
        System.out.println("Hola = " + nombre);
        return nombre+this.apellido; //this cuando sea necesario usar la variable de la clase
    }
    
    public void setApellido(){
        System.out.println("apellido = " + apellido);
    }
}
