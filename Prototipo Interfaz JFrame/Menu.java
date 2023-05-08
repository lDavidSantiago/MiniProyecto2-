import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;



public class Menu extends JFrame{//Se importa JFrame para usar interfaces y que Menu lo herede
    /*ELEMENTOS DE LA PARTE GRAFICA SE HACEN ARRIBA POR BUENA PRACTICA */

    //Constructor de la clase Menu
    Menu(){
        //Se establecen los parametros de la ventana
        setSize(500, 500);
        setTitle("DUlCERIA DIAVETRIX");
        setLocationRelativeTo(null);//Establecemos la posicion inicial de la ventana en la mitad 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarComponentes();    
        
    }
    private void iniciarComponentes(){
        JPanel panel = new JPanel();//Creacion del panel
        panel.setLayout(null);
        panel.setBackground(Color.PINK);
        this.getContentPane().add(panel);//Se agrega el panel a la ventana
        
        JLabel etiqueta1 = new JLabel("MENU DE OPCIONES");//ETIQUETA
        etiqueta1.setBounds(50, 50, 130, 30);//Posicion y medidas de la etiqueta
        //etiqueta1.setForeground(Color.MAGENTa); --- de esta forma se logra cambiar el color de letra
        panel.add(etiqueta1);//Se agrega la etiqueta

        JLabel etiqueta2 = new JLabel("1. Insertar nuevos dulces");
        etiqueta2.setBounds(50, 70, 150, 30);
        panel.add(etiqueta2);

        JLabel etiqueta3 = new JLabel("2. Actualizar dulces");
        etiqueta3.setBounds(50, 90, 150, 30);
        panel.add(etiqueta3);

        JLabel etiqueta4 = new JLabel("3. Eliminar dulces");
        etiqueta4.setBounds(50, 110, 150, 30);
        panel.add(etiqueta4);
        
        JLabel etiqueta5 = new JLabel("4. Buscar dulce por nombre");
        etiqueta5.setBounds(50, 130, 200, 30);
        panel.add(etiqueta5);

        JLabel etiqueta6 = new JLabel("5. Listar todos los dulces");
        etiqueta6.setBounds(50, 150, 150, 30);
        panel.add(etiqueta6);
    }
}


