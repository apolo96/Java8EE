
package Modulo3Thread;

/**
 *
 * @author Apolo
 */
public class Ratones extends Thread{ 
    private static int plato = 100;
    private String nombre;
    private int comida; 
    public Ratones(String nombre, int comida){
        this.nombre = nombre;
        this.comida = comida;
    } 
    synchronized private void comer(){
        System.out.println("Plato: "+ plato +" Comer: "+ this.comida);
        plato = plato - this.comida;
        if(plato < this.comida){
            this.llenar();
        }else{
            this.comer();
        }     
    }
    synchronized private void llenar(){
        plato += 100;
        System.out.println("Se a lleano el plato");
    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try{ 
                this.comer();
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e.toString());
            }
        }
    }     
    public static void main(String[] args) {
        new Ratones("r1",8).start();
        new Ratones("r2",15).start();
    }
}
