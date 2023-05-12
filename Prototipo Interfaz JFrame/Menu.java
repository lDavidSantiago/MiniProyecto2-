import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class Menu extends JFrame{//Se importa JFrame para usar interfaces y que Menu lo herede
    /*ELEMENTOS DE LA PARTE GRAFICA SE HACEN ARRIBA POR BUENA PRACTICA */
    
    public JPanel panel = new JPanel();//Creacion del panel

    //Constructor de la clase Menu
    Menu(){
        //Se establecen los parametros de la ventana
        setSize(500, 500);
        setTitle("DUlCERIA DIAVETRIX");
        setLocationRelativeTo(null);//Establecemos la posicion inicial de la ventana en la mitad 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarComponentes();//Se da inicio a la aplicación
           
        
    }

    private void iniciarComponentes(){
        colocarPaneles();
        colocarEtiquetas(); 
        colocarBotones();
        colocarCajaTexto();
    }

    private void colocarPaneles(){
        panel.setLayout(null);
        panel.setBackground(Color.PINK);//Color del panel
        this.getContentPane().add(panel);//Se agrega el panel a la ventana
    }

    private void colocarEtiquetas(){
        JLabel etiqueta1 = new JLabel("MENU DE OPCIONES");//ETIQUETA
        etiqueta1.setFont(new Font ("arial",Font.BOLD,20));//Tipo, Fuente(negrita), Tamaño
        etiqueta1.setOpaque(true);//Permite ver el color del fondo de la etiqueta
        etiqueta1.setBackground(Color.magenta);//Se establece el color de la etiqueta
        etiqueta1.setBounds(50, 50, 400, 30);//Posicion y medidas de la etiqueta
        etiqueta1.setHorizontalAlignment(SwingConstants.CENTER);
        //etiqueta1.setForeground(Color.MAGENTa); --- de esta forma se logra cambiar el color de letra
        panel.add(etiqueta1);//Se agrega la etiqueta

        JLabel etiqueta2 = new JLabel("1. Insertar nuevos dulces");
        etiqueta2.setBounds(50, 90, 150, 30);
        panel.add(etiqueta2);

        JLabel etiqueta3 = new JLabel("2. Actualizar dulces");
        etiqueta3.setBounds(50, 110, 150, 30);
        panel.add(etiqueta3);

        JLabel etiqueta4 = new JLabel("3. Eliminar dulces");
        etiqueta4.setBounds(50, 130, 150, 30);
        panel.add(etiqueta4);
        
        JLabel etiqueta5 = new JLabel("4. Buscar dulce por nombre");
        etiqueta5.setBounds(50, 150, 200, 30);
        panel.add(etiqueta5);

        JLabel etiqueta6 = new JLabel("5. Listar todos los dulces");
        etiqueta6.setBounds(50, 170, 150, 30);
        panel.add(etiqueta6);
    }
    private void colocarBotones(){
        JButton boton1 = new JButton(/* "Aceptar" */);//creación del boton
        boton1.setText("Aceptar");//Se le proporciona un texto, sino como se muestra al crearlo
        boton1.setBounds(200,250,100,40);//Ubicacion del boton
        panel.add(boton1);//Implementacion del boton
        boton1.setBackground(Color.magenta);
        //boton1.setAction();
    }

    private void colocarCajaTexto(){
        JTextField cajaTexto1 = new JTextField("Ingrese una opción (numero)");
        cajaTexto1.setBounds(165,210,170,30);
        panel.add(cajaTexto1);
    }
}




