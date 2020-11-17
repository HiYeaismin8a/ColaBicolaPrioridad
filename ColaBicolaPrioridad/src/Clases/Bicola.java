package Clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HiYeaismin 8a
 */
public class Bicola extends ColaSimple{

    
    public boolean insertarPorIni(char valor) {
        // INSERTAR POR INI
        if (ini == 0) {
            //ES´TA LLENO POR LA IZQUIERDA
            return false;
        }
        //Unico elemento Insertado
        if (ini == -1 && fin == -1) {
            ini = fin = 0;
            cola[ini] = valor;
            return true;
        }
        ini = ini - 1;
        cola[ini] = valor;
        return true;      
    }
    
    //eliminar por fin
    public boolean eliminarPorFin(){
        //la cola está vacía?
           if(ini ==-1 && fin==-1){
            return false;
        }
        valorEliminado= cola[fin];
        //Estamos eliminando el único elemento?
        if(ini ==fin && ini !=-1){
            ini=-1;
            fin=-1;
            return true;
        }
        fin --;
        return true;
    }

    public char valorEliminador() {
        return valorEliminado;
    }

    public int valorIni() {
        return ini;
    }

    public int valorFin() {
        return fin;
    }

    public char[] contenidoCola() {
        return cola;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public void inicializararreglo() {
        cola = new char[tamaño];
    }

}
