package Util;

public class Auto {

    private String color;
    private String marca;
    private int velocidad;

    public String getColor(){
        return color;
    }

    public String getMarca(){
        return marca;
    }

    public int getVelocidad(){
        return velocidad;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setMarca(String marca){//recibe string marca
        this.marca = marca;
    }

    public void setVelocidad(int velocidad){
        this.velocidad = velocidad;
    }
}