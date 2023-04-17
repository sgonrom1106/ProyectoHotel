/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.politecnicomalaga.hotelmain;
import java.util.ArrayList;

/**
 *
 * @author seryi
 */
public class Hotel {

    private String descripcion;
    private String nombre;
    private String direccionPostal;
    private String telefono;
    private String email;
    private ArrayList<Cliente> miCliente;
    
    public Hotel(String nDescripcion, String nNombre, String nDireccionPostal, String nTelefono, String nEmail) {

        this.descripcion = nDescripcion;
        this.nombre = nNombre;
        this.direccionPostal = nDireccionPostal;
        this.telefono = nTelefono;
        this.email = nEmail;
        this.miCliente = new ArrayList<>();
        
    }
    
    public void crearCliente(String DNI, String nombre, String apellidos, String direccion, String email, String telefono, String fechaNacimiento){
        
        miCliente.add(new Cliente(DNI,nombre,apellidos,direccion,email,telefono,fechaNacimiento));
    }   

    public void eliminarCliente(String DNI){
        Cliente c = this.buscarCliente(DNI);
        miCliente.remove(c);
    
    }
    
    public Cliente[] buscarCliente(String DNI){
        
        for(int i = 0; i< miCliente.size(); i++){
            
            if(miCliente.get(i).getDNI().contentEquals(DNI)){
                
              return i;  
                
            }
            
        }
        
        return -1;
        
    }

    
    public String mostrarClienteDNI(String DNI){
        
            if(buscarCliente(DNI) != -1){
                return miCliente.get(this.buscarCliente(DNI)).mostrarDatosCliente();
            }
        
        return null;
    }
    
    public Cliente[] todosClientes(){
        
        if(miCliente.size() == 0)
            return null;
        
        Cliente[] listaC = new Cliente[miCliente.size()];
        return miCliente.toArray(listaC);
        
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccionPostal() {
        return direccionPostal;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccionPostal(String direccionPostal) {
        this.direccionPostal = direccionPostal;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
