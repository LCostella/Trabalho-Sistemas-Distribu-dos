package receptor.udp;

import java.net.DatagramPacket;
import java.util.LinkedList;
import java.util.Queue;

public class ReceptorUDP {
    
    private static Queue<DatagramPacket> fila;
    private static ThreadInserirFila inserir;
    private static ThreadRetiraFila retirar;

    public Queue<DatagramPacket> getFila() {
        return fila;
    }

    public void setFila(Queue<DatagramPacket> fila) {
        this.fila = fila;
    }

    public ReceptorUDP() {
        
    }
    
    public static void main(String[] args) {
        //inicia a fila e as threads
        //fila = new LinkedList<>();
        Fila fila = new Fila();
        inserir = new ThreadInserirFila(fila, "inserir");
        retirar = new ThreadRetiraFila(fila, "retirar");
        inserir.start();
        retirar.start();
        System.out.println("iniciou as threads");
    }  
}
