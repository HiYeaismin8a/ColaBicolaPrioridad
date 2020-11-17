package Vista;

import Vista.Data;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HiYeaismin 8a
 */
public class Prioridad {

    protected Data[] cola= new Data[10];
    //prioridad char
    protected int ini = -1,tamaño;
    protected int fin = -1;
    protected Data valorEliminado;

    public Prioridad() {
        //ciclo for para construir en cada celdilla. con un objeto data. 
        for (int i = 0; i < cola.length; i++) {
            cola[i] = new Data();
        }

    }

    public boolean insertar(Data dato) {
        //Cola llena
        if (fin == cola.length - 1) {
            return false;
        }
        fin++;
        cola[fin] = dato;
        //Un elemento insertado
        if (fin == 0 && ini == -1) {
            ini++;
            
        }
        ordenarPrioridad();
        return true;
    }

    private void ordenarPrioridad() {
        //Código de tarea para el lunes.
        //valorf prioridad2
        //No hay necesidad de evaluar un solo elemento
        //hay un solo elemento elemento, por tanto no es necesario hacer comparación
        if (fin == 0) {
            return;
        }
        //el for evalua cuando hay muchos elementos

        for (int temp = fin;
                temp != ini && cola[temp].prioridad > cola[temp - 1].prioridad;
                temp--) {

            //Intercambio de la información.
            Data intercambio = new Data();
            int anterior = temp - 1;

            //Guardar en otro espacio la celdilla anterior. Si es de menor prioridad.
            intercambio.valor = cola[anterior].valor;
            intercambio.prioridad = cola[anterior].prioridad;
            //intercambio = cola[anterior];

            //SOBRE escribir la celdilla anterior con la celdilla ACTUAL
            cola[anterior].valor = cola[temp].valor;
            cola[anterior].prioridad = cola[temp].prioridad;

            //Moviendo valores de intercambio a la celdilla actual
            cola[temp].valor = intercambio.valor;
            cola[temp].prioridad = intercambio.prioridad;
        }

    }

      public boolean eliminar(){
          //Cola vacia
        if(ini ==-1 && fin==-1){
            return false;
        }
        
        valorEliminado= cola[ini];
        if(ini ==fin && ini !=-1){
            ini=-1;
            fin=-1;
            return true;
        }
        ini ++;
        return true;
    }
    
    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public void inicializararreglo() {
        cola = new Data[tamaño];
    }
}
