package LazyCat;

import LazyCat.Bus;

 class BusInitialization {
    Object[] arrayBuses = new Object[20];
    String [] lugares = {"Santiago" , "Copiapó", "La Serena", "Concepción", "Valdivia", "Temuco"};
    String [] horarios = {"Mañana","Tarde"};
    int[] precios = {10000,15000,19000,24000};

    //test para ver los cambios en git

    BusInitialization(){
        for (int i = 0 ; i < this.arrayBuses.length; i++){ //recorre todos los Objetos Buses

            for (int j = 0; j < this.horarios.length;j++){//recorre todos los horarios todo agregar lugares y ver el manejor de precios

                /*
                *Tengo que tener en cuenta que los de Santiago van al resto de lugares, y los de el
                *resto de lugares solo viajan a Santiago (santiago es el hub)

                */

            }

        }
    }
}
