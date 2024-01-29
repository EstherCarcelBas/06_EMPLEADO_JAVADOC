/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicanoevaluable_estudiantes;

/**
 *
 * @author Esther Cárcel Bastidas
 * esthercarcelbas@gmail.com
 * 
 * @version 18/05/1989
 * 
 */

  
public class Empleado {
    private String nombre;
    private String apellido;
    private int edad;
    private double salario;
    
    //Metodos publicos
    
       /**
     * Suma un plus de 89 euros al salario del empleado si el empleado tiene más de 35 años
     *
     * @param sueldoPlus cantidad en euros que se suma al salario
     * 
     * @return <ul>
     *                  <li> true: se suma el plus al sueldo </li>
     *                  <li>false: no se suma el plus al sueldo</li>
     *                  </ul>
     * 
     */
    
    public boolean plus(double sueldoPlus) {
        boolean aumento = false;
        if (edad > 40 && compruebaNombre()) {
            salario += sueldoPlus;
            aumento = true;
        }
        return aumento;
    }
    
 
    
  //Metodos Privados
    
    private boolean compruebaNombre() {
        if (nombre.equals(" "))  {
            return false;
        }
        return true;
    }
    
    //Constructores
    
    /**
     * Constructor por defecto
     */
    
    public Empleado (){
        this(" ", " ", 0, 0);
    }
    
     /**
    * Constructor con 4 parametros
    * Crea los objetos empleado, con nombre, apellidos y salario
    * @param nombre Nombre del empleado
    * @param apellido Apellido del empleado
    * @param edad Edad del empleado
    * @param salario Salario del empleado
    * 
    */
    public Empleado(String nombre, String apellido, int edad, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }
}
