package LazyCat;

public class Bus {
    private String salida= null;
    private String destino = null;
    private boolean [] asientos;
    private String horario = null;
    private int valor;


    public Bus(String salida, String destino, String horario, int valor) {
        salida = salida;
        destino = destino;
        asientos = new boolean[40];
        horario = horario;
        valor = valor;
    }

    void checkAsientos(){
        String ocupado;
        for (int i = 0 ; i < asientos.length; i++){
            ocupado = (asientos[i]) ? "X" : "O";
            System.out.print(i+1 + ":" + ocupado);
            if (i == 9 || i == 29){
                System.out.print("\n");
            }
            if (i==19){
                System.out.println("\n");
            }
        }
    }

    boolean setAsiento (int numAsiento){

        boolean done = false;

        if (!asientos[numAsiento-1]){
            asientos[numAsiento-1] = true;
            done = true;
        }else {
            System.out.println("Asiento N°:" + numAsiento + " Ocupado");
        }

        return done;
    }
}
