package persona;
import javax.swing.JOptionPane;

public class PruebaPersona {
    public static void main(String[] args) {
        // Solicitud de datos persona 1
        var n1 = JOptionPane.showInputDialog("Inrese su nombre");
        var a1 = JOptionPane.showInputDialog("Ingrese su apellido");
        var obj1 = new Persona();

        // Asignacion de valores
        obj1.setNombre(n1);
        obj1.setApellido(a1);
        // En automatico con println llama al metodo .toString sin necesidad de lamarlo
        System.out.println(obj1.toString());


    }
}
