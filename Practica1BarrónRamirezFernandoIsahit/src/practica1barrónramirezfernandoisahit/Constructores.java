/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1barrónramirezfernandoisahit;

/**
 *
 * @author Alumno
 */
public class Constructores {
    private String marca;
    private String modelo;
    private String costo;
    private String año;
    private String talla;
    //Constructor sin parametros
    public Constructores(){
    this.marca="";
    this.modelo="";
    this.costo="";
    this.año="";
    this.talla="";
    }
    //Constructor con un parametro
    public Constructores(String marca){
    this.marca=marca;
    this.modelo="";
    this.costo="";
    this.año="";
    this.talla="";
    }
    //Constructores con dos parametros
    public Constructores(String marca, String modelo){
    this.marca=marca;
    this.modelo=modelo;
    this.costo="";
    this.año="";
    this.talla="";
    }
    //Constructor con tres parametros
    public Constructores(String marca, String modelo, String costo){
    this.marca=marca;
    this.modelo=modelo;
    this.costo=costo;
    this.año="";
    this.talla="";
    }
    //constructor con cuatro parametros
    public Constructores(String marca, String modelo, String costo, String año){
    this.marca=marca;
    this.modelo=modelo;
    this.costo=costo;
    this.año=año;
    this.talla="";
    }
    //constructor con cinco parametros
    public Constructores(String marca, String modelo, String costo, String año, String talla){
    this.marca=marca;
    this.modelo=modelo;
    this.costo=costo;
    this.año=año;
    this.talla=talla;
    }
    @Override
    public String toString() {
        StringBuilder value = new StringBuilder();
        value.append(String.format("Marca: %s%n", this.marca));
        value.append(String.format("Modelo: %s%n",this.modelo));
        value.append(String.format("Costo: %s%n",this.costo));
        value.append(String.format("Año: %s%n",this.año));
        value.append(String.format("Talla: %s%n",this.talla));
        return value.toString();
    }
}
