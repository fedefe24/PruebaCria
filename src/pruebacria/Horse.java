/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacria;

import java.util.Scanner;

/**
 *
 * @author fdicocco
 */
public class Horse {
    Scanner leer = new Scanner(System.in);
    public String nombre;
    public int edad;
    public String sexo;
    public int velocidad, aceleracion, arranque, agilidad, resistencia, fuerza, espiritu, temperamento, adaptabilidad, condicion;
    public int pace;
    public int evolucion;
    public int Xvelocidad, Xaceleracion, Xarranque, Xagilidad, Xresistencia, Xfuerza, Xespiritu, Xtemperamento, Xadaptabilidad, Xcondicion, Xpace, Xevolucion;
    

    public Horse() {
    }
    
    public Horse(String nombre, int edad, String sexo, int velocidad, int aceleracion, int arranque, int agilidad, int resistencia, int fuerza, int espiritu, int temperamento, int adaptabilidad, int condicion, int pace, int evolucion, int Xvelocidad, int Xaceleracion, int Xarranque, int Xagilidad, int Xresistencia, int Xfuerza, int Xespiritu, int Xtemperamento, int Xadaptabilidad, int Xcondicion, int Xpace, int Xevolucion) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.velocidad = velocidad;
        this.aceleracion = aceleracion;
        this.arranque = arranque;
        this.agilidad = agilidad;
        this.resistencia = resistencia;
        this.fuerza = fuerza;
        this.espiritu = espiritu;
        this.temperamento = temperamento;
        this.adaptabilidad = adaptabilidad;
        this.condicion = condicion;
        this.pace = pace;
        this.evolucion = evolucion;
        this.Xvelocidad = Xvelocidad;
        this.Xaceleracion = Xaceleracion;
        this.Xarranque = Xarranque;
        this.Xagilidad = Xagilidad;
        this.Xresistencia = Xresistencia;
        this.Xfuerza = Xfuerza;
        this.Xespiritu = Xespiritu;
        this.Xtemperamento = Xtemperamento;
        this.Xadaptabilidad = Xadaptabilidad;
        this.Xcondicion = Xcondicion;
        this.Xpace = Xpace;
        this.Xevolucion = Xevolucion;
    }

    public Horse(String nombre, int edad, String sexo, int velocidad, int aceleracion, int arranque, int agilidad, int resistencia, int fuerza, int espiritu, int temperamento, int adaptabilidad, int condicion, int pace, int evolucion) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.velocidad = velocidad;
        this.aceleracion = aceleracion;
        this.arranque = arranque;
        this.agilidad = agilidad;
        this.resistencia = resistencia;
        this.fuerza = fuerza;
        this.espiritu = espiritu;
        this.temperamento = temperamento;
        this.adaptabilidad = adaptabilidad;
        this.condicion = condicion;
        this.pace = pace;
        this.evolucion = evolucion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(int aceleracion) {
        this.aceleracion = aceleracion;
    }

    public int getArranque() {
        return arranque;
    }

    public void setArranque(int arranque) {
        this.arranque = arranque;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getEspiritu() {
        return espiritu;
    }

    public void setEspiritu(int espiritu) {
        this.espiritu = espiritu;
    }

    public int getTemperamento() {
        return temperamento;
    }

    public void setTemperamento(int temperamento) {
        this.temperamento = temperamento;
    }

    public int getAdaptabilidad() {
        return adaptabilidad;
    }

    public void setAdaptabilidad(int adaptabilidad) {
        this.adaptabilidad = adaptabilidad;
    }

    public int getCondicion() {
        return condicion;
    }

    public void setCondicion(int condicion) {
        this.condicion = condicion;
    }

    public int getPace() {
        return pace;
    }

    public void setPace(int pace) {
        this.pace = pace;
    }

    public int getEvolucion() {
        return evolucion;
    }

    public void setEvolucion(int evolucion) {
        this.evolucion = evolucion;
    }

    public int getXvelocidad() {
        return Xvelocidad;
    }

    public void setXvelocidad(int Xvelocidad) {
        this.Xvelocidad = Xvelocidad;
    }

    public int getXaceleracion() {
        return Xaceleracion;
    }

    public void setXaceleracion(int Xaceleracion) {
        this.Xaceleracion = Xaceleracion;
    }

    public int getXarranque() {
        return Xarranque;
    }

    public void setXarranque(int Xarranque) {
        this.Xarranque = Xarranque;
    }

    public int getXagilidad() {
        return Xagilidad;
    }

    public void setXagilidad(int Xagilidad) {
        this.Xagilidad = Xagilidad;
    }

    public int getXresistencia() {
        return Xresistencia;
    }

    public void setXresistencia(int Xresistencia) {
        this.Xresistencia = Xresistencia;
    }

    public int getXfuerza() {
        return Xfuerza;
    }

    public void setXfuerza(int Xfuerza) {
        this.Xfuerza = Xfuerza;
    }

    public int getXespiritu() {
        return Xespiritu;
    }

    public void setXespiritu(int Xespiritu) {
        this.Xespiritu = Xespiritu;
    }

    public int getXtemperamento() {
        return Xtemperamento;
    }

    public void setXtemperamento(int Xtemperamento) {
        this.Xtemperamento = Xtemperamento;
    }

    public int getXadaptabilidad() {
        return Xadaptabilidad;
    }

    public void setXadaptabilidad(int Xadaptabilidad) {
        this.Xadaptabilidad = Xadaptabilidad;
    }

    public int getXcondicion() {
        return Xcondicion;
    }

    public void setXcondicion(int Xcondicion) {
        this.Xcondicion = Xcondicion;
    }

    public int getXpace() {
        return Xpace;
    }

    public void setXpace(int Xpace) {
        this.Xpace = Xpace;
    }

    public int getXevolucion() {
        return Xevolucion;
    }

    public void setXevolucion(int Xevolucion) {
        this.Xevolucion = Xevolucion;
    }

//// METODOS ////
        
public int sorteoPatrones(){
    int sorteo;
    sorteo = (int) (Math.random()*10);
    if (sorteo < 4) return 0;
    else if (sorteo > 3 && sorteo < 7) return 1;
    else return 8;
    }

public Horse newHorse(Horse madre, Horse padre){
    Horse nuevoCaballo = new Horse();
     /// Definición del Sexo ///
    int a = (int) (Math.random()*100);   
    String sx;
    if (a % 2 == 0)
        sx = "Hembra";
    else sx = "Macho";             
    nuevoCaballo.setSexo(sx);
    
    ///Definición del nombre ///
    System.out.println("Por favor ingrese el nombre de su caballo, es " +nuevoCaballo.getSexo() +" :");
    String nombreCaballo = leer.nextLine();
    nuevoCaballo.setNombre(nombreCaballo);   
    
    ///Edad por defecto ///
    nuevoCaballo.setEdad(2);
    
    ///Definición de Atributos fuertes, medios y débiles ///
    nuevoCaballo.setXvelocidad(sorteoPatrones());
    nuevoCaballo.setXaceleracion(sorteoPatrones());
    nuevoCaballo.setXarranque(sorteoPatrones());
    nuevoCaballo.setXagilidad(sorteoPatrones());
    nuevoCaballo.setXresistencia(sorteoPatrones());
    nuevoCaballo.setXfuerza(sorteoPatrones());
    nuevoCaballo.setXespiritu(sorteoPatrones());
    nuevoCaballo.setXtemperamento(sorteoPatrones());
    nuevoCaballo.setXadaptabilidad(sorteoPatrones());
    nuevoCaballo.setXcondicion(sorteoPatrones());
    nuevoCaballo.setXpace(sorteoPatrones());
    nuevoCaballo.setXevolucion(sorteoPatrones());
    
    
    ///Definición del valor Máximo de cada Atributo ///
    int atributoFinal;
     if (padre.getXvelocidad() == 0 && madre.getXvelocidad()!=8){
        atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*padre.getVelocidad());}
     else if (padre.getXvelocidad() == 0 && madre.getXvelocidad()==8){
        atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*padre.getVelocidad())+1;}  
    else if (padre.getXvelocidad() == 1 && madre.getXvelocidad()!=1){
         atributoFinal = (int) (((padre.getVelocidad()+madre.getVelocidad())/2)*(((Math.random()-0.45)/10)+1));}
    else if (padre.getXvelocidad() == 1 && madre.getXvelocidad()==1){
         atributoFinal = (int) (((padre.getVelocidad()+madre.getVelocidad())/2)*(((Math.random()-0.45)/10)+1))+1;}  
    else if (padre.getXvelocidad() == 8 && madre.getXvelocidad()==0){
    atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*madre.getVelocidad())+1;}
    else if (padre.getXvelocidad() == 8 && madre.getXvelocidad()==1){
    atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*madre.getVelocidad())-1;} 
     else 
    atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*madre.getVelocidad())-2;
     
     nuevoCaballo.setVelocidad(atributoFinal);
          
     
  if (padre.getXaceleracion() == 0 && madre.getXaceleracion()!=8){
        atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*padre.getAceleracion());}
     else if (padre.getXaceleracion() == 0 && madre.getXaceleracion()==8){
        atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*padre.getAceleracion())+1;}  
    else if (padre.getXaceleracion() == 1 && madre.getXaceleracion()!=1){
         atributoFinal = (int) (((padre.getAceleracion()+madre.getAceleracion())/2)*(((Math.random()-0.45)/10)+1));}
    else if (padre.getXaceleracion() == 1 && madre.getXaceleracion()==1){
         atributoFinal = (int) (((padre.getAceleracion()+madre.getAceleracion())/2)*(((Math.random()-0.45)/10)+1))+1;}  
    else if (padre.getXaceleracion() == 8 && madre.getXaceleracion() == 0){
    atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*madre.getAceleracion())+1;}
    else if (padre.getXaceleracion() == 8 && madre.getXaceleracion()==1){
    atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*madre.getAceleracion())-1;} 
     else 
    atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*madre.getAceleracion())-2;
  
     nuevoCaballo.setAceleracion(atributoFinal);
     
     
     if (padre.getXarranque() == 0 && madre.getXarranque()!=8){
        atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*padre.getArranque());}
     else if (padre.getXarranque() == 0 && madre.getXarranque()==8){
        atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*padre.getArranque())+1;}  
    else if (padre.getXarranque() == 1 && madre.getXarranque()!=1){
         atributoFinal = (int) (((padre.getArranque()+madre.getArranque())/2)*(((Math.random()-0.45)/10)+1));}
    else if (padre.getXarranque() == 1 && madre.getXarranque()==1){
         atributoFinal = (int) (((padre.getArranque()+madre.getArranque())/2)*(((Math.random()-0.45)/10)+1))+1;}  
    else if (padre.getXarranque() == 8 && madre.getXarranque() == 0){
    atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*madre.getArranque())+1;}
    else if (padre.getXarranque() == 8 && madre.getXarranque()==1){
    atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*madre.getArranque())-1;} 
     else 
    atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*madre.getArranque())-2;

     nuevoCaballo.setArranque(atributoFinal);
     
     
          if (padre.getXagilidad() == 0 && madre.getXagilidad()!=8){
        atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*padre.getAgilidad());}
     else if (padre.getXagilidad() == 0 && madre.getXagilidad()==8){
        atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*padre.getAgilidad())+1;}  
    else if (padre.getXagilidad() == 1 && madre.getXagilidad()!=1){
         atributoFinal = (int) (((padre.getAgilidad()+madre.getAgilidad())/2)*(((Math.random()-0.45)/10)+1));}
    else if (padre.getXagilidad() == 1 && madre.getXagilidad()==1){
         atributoFinal = (int) (((padre.getAgilidad()+madre.getAgilidad())/2)*(((Math.random()-0.45)/10)+1))+1;}  
    else if (padre.getXagilidad() == 8 && madre.getXagilidad() == 0){
    atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*madre.getAgilidad())+1;}
    else if (padre.getXagilidad() == 8 && madre.getXagilidad()==1){
    atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*madre.getAgilidad())-1;} 
     else 
    atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*madre.getAgilidad())-2;     
     
     nuevoCaballo.setAgilidad(atributoFinal);
     
       
      if (padre.getXresistencia() == 0 && madre.getXresistencia()!=8){
        atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*padre.getResistencia());}
     else if (padre.getXresistencia() == 0 && madre.getXresistencia()==8){
        atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*padre.getResistencia())+1;}  
    else if (padre.getXresistencia() == 1 && madre.getXresistencia()!=1){
         atributoFinal = (int) (((padre.getResistencia()+madre.getResistencia())/2)*(((Math.random()-0.45)/10)+1));}
    else if (padre.getXresistencia() == 1 && madre.getXresistencia()==1){
         atributoFinal = (int) (((padre.getResistencia()+madre.getResistencia())/2)*(((Math.random()-0.45)/10)+1))+1;}  
    else if (padre.getXresistencia() == 8 && madre.getXresistencia() == 0){
    atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*madre.getResistencia())+1;}
    else if (padre.getXresistencia() == 8 && madre.getXresistencia()==1){
    atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*madre.getResistencia())-1;} 
     else 
    atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*madre.getResistencia())-2;         
     
     nuevoCaballo.setResistencia(atributoFinal);
     
     
if (padre.getXfuerza() == 0 && madre.getXfuerza()!=8){
        atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*padre.getFuerza());}
     else if (padre.getXfuerza() == 0 && madre.getXfuerza()==8){
        atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*padre.getFuerza())+1;}  
    else if (padre.getXfuerza() == 1 && madre.getXfuerza()!=1){
         atributoFinal = (int) (((padre.getFuerza()+madre.getFuerza())/2)*(((Math.random()-0.45)/10)+1));}
    else if (padre.getXfuerza() == 1 && madre.getXfuerza()==1){
         atributoFinal = (int) (((padre.getFuerza()+madre.getFuerza())/2)*(((Math.random()-0.45)/10)+1))+1;}  
    else if (padre.getXfuerza() == 8 && madre.getXfuerza() == 0){
    atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*madre.getFuerza())+1;}
    else if (padre.getXfuerza() == 8 && madre.getXfuerza()==1){
    atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*madre.getFuerza())-1;} 
     else 
    atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*madre.getFuerza())-2;         

     nuevoCaballo.setFuerza(atributoFinal);
     
    if (padre.getXespiritu() == 0 && madre.getXespiritu()!=8){
        atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*padre.getEspiritu());}
     else if (padre.getXespiritu() == 0 && madre.getXespiritu()==8){
        atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*padre.getEspiritu())+1;}  
    else if (padre.getXespiritu() == 1 && madre.getXespiritu()!=1){
         atributoFinal = (int) (((padre.getEspiritu()+madre.getEspiritu())/2)*(((Math.random()-0.45)/10)+1));}
    else if (padre.getXespiritu() == 1 && madre.getXespiritu()==1){
         atributoFinal = (int) (((padre.getEspiritu()+madre.getEspiritu())/2)*(((Math.random()-0.45)/10)+1))+1;}  
    else if (padre.getXespiritu() == 8 && madre.getXespiritu() == 0){
    atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*madre.getEspiritu())+1;}
    else if (padre.getXespiritu() == 8 && madre.getXespiritu()==1){
    atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*madre.getEspiritu())-1;} 
     else 
    atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*madre.getEspiritu())-2;    
         
     nuevoCaballo.setEspiritu(atributoFinal);
     
    if (padre.getXtemperamento() == 0 && madre.getXtemperamento()!=8){
        atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*padre.getTemperamento());}
     else if (padre.getXtemperamento() == 0 && madre.getXtemperamento()==8){
        atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*padre.getTemperamento())+1;}  
    else if (padre.getXtemperamento() == 1 && madre.getXtemperamento()!=1){
         atributoFinal = (int) (((padre.getTemperamento()+madre.getTemperamento())/2)*(((Math.random()-0.45)/10)+1));}
    else if (padre.getXtemperamento() == 1 && madre.getXtemperamento()==1){
         atributoFinal = (int) (((padre.getTemperamento()+madre.getTemperamento())/2)*(((Math.random()-0.45)/10)+1))+1;}  
    else if (padre.getXtemperamento() == 8 && madre.getXtemperamento() == 0){
    atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*madre.getTemperamento())+1;}
    else if (padre.getXtemperamento() == 8 && madre.getXtemperamento()==1){
    atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*madre.getTemperamento())-1;} 
     else 
    atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*madre.getTemperamento())-2;    
     
     nuevoCaballo.setTemperamento(atributoFinal);

    if (padre.getXadaptabilidad() == 0 && madre.getXadaptabilidad()!=8){
        atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*padre.getAdaptabilidad());}
     else if (padre.getXadaptabilidad() == 0 && madre.getXadaptabilidad()==8){
        atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*padre.getAdaptabilidad())+1;}  
    else if (padre.getXadaptabilidad() == 1 && madre.getXadaptabilidad()!=1){
         atributoFinal = (int) (((padre.getAdaptabilidad()+madre.getAdaptabilidad())/2)*(((Math.random()-0.45)/10)+1));}
    else if (padre.getXadaptabilidad() == 1 && madre.getXadaptabilidad()==1){
         atributoFinal = (int) (((padre.getAdaptabilidad()+madre.getAdaptabilidad())/2)*(((Math.random()-0.45)/10)+1))+1;}  
    else if (padre.getXadaptabilidad() == 8 && madre.getXadaptabilidad() == 0){
    atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*madre.getAdaptabilidad())+1;}
    else if (padre.getXadaptabilidad() == 8 && madre.getXadaptabilidad()==1){
    atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*madre.getAdaptabilidad())-1;} 
     else 
    atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*madre.getAdaptabilidad())-2;    
    
     nuevoCaballo.setAdaptabilidad(atributoFinal);
     
     
    if (padre.getXcondicion() == 0 && madre.getXcondicion()!=8){
        atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*padre.getCondicion());}
     else if (padre.getXcondicion() == 0 && madre.getXcondicion()==8){
        atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*padre.getCondicion())+1;}  
    else if (padre.getXcondicion() == 1 && madre.getXcondicion()!=1){
         atributoFinal = (int) (((padre.getCondicion()+madre.getCondicion())/2)*(((Math.random()-0.45)/10)+1));}
    else if (padre.getXcondicion() == 1 && madre.getXcondicion()==1){
         atributoFinal = (int) (((padre.getCondicion()+madre.getCondicion())/2)*(((Math.random()-0.45)/10)+1))+1;}  
    else if (padre.getXcondicion() == 8 && madre.getXcondicion() == 0){
    atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*madre.getCondicion())+1;}
    else if (padre.getXcondicion() == 8 && madre.getXcondicion()==1){
    atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*madre.getCondicion())-1;} 
     else 
    atributoFinal = (int) ((((Math.random()-0.45)/10)+1)*madre.getCondicion())-2;    
     
     nuevoCaballo.setCondicion(atributoFinal);
     
     
     if (padre.getXpace() == 0){       
        atributoFinal =padre.getPace();}
    else if (padre.getXpace() != 0 && madre.getXpace() == 0){
         atributoFinal = madre.getPace();}    
    else atributoFinal = (int) (Math.random()*10);
     
     nuevoCaballo.setPace(atributoFinal);
     
     
     if (padre.getXevolucion() == 0){  
        atributoFinal = padre.getEvolucion();}
    else if (padre.getXevolucion() != 0 && madre.getXevolucion() == 0){
        atributoFinal = madre.getEvolucion();}
    else  atributoFinal = (int) ((Math.random()*10+1)/2);
     
     nuevoCaballo.setEvolucion(atributoFinal);     
     

    
    return nuevoCaballo;
    
}    

 public void verTodoCaballo(){
     
System.out.println("Nombre: " +getNombre());
System.out.println("Edad: " +getEdad());
System.out.println("Sexo: "+getSexo());
System.out.println("VEL: "+getVelocidad());
System.out.println("ACE: " +getAceleracion());
System.out.println("ARR: " +getArranque());
System.out.println("AGI: "+getAgilidad());
System.out.println("RES: "+getResistencia());
System.out.println("FUE: "+getFuerza());
System.out.println("ESP: "+getEspiritu());
System.out.println("TEM: "+getTemperamento());
System.out.println("ADA: "+getAdaptabilidad());
System.out.println("COND: "+getCondicion());
System.out.println("PACE: "+getPace());
System.out.println("EVOL: "+getEvolucion());
System.out.println("ATR CRIA: " +getXvelocidad()+getXaceleracion()+getXarranque()+getXagilidad()+getXresistencia()+getXfuerza()+getXespiritu()+getXtemperamento()+getXadaptabilidad()+getXcondicion()+getXpace()+getXevolucion());
 }


}

