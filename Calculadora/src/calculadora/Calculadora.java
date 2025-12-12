
package calculadora;

public class Calculadora {

    public static void main(String[] args) {
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadoraa().setVisible(true);
            }
        });
        
    }
    
}
