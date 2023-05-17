import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Menu extends JFrame{//Se importa JFrame para usar interfaces y que Menu lo herede
    /*ELEMENTOS DE LA PARTE GRAFICA SE HACEN ARRIBA POR BUENA PRACTICA */
    int opcionnumeritos;
    public JPanel panel1 = new JPanel();//Creacion del panel
    public JPanel panel2 = new JPanel();
    public JPanel panel3 = new JPanel();
    ArrayList<Dulce> arrayDulces = new ArrayList<>();
    

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
        botonesCajasTexto();
    }

    private void colocarPaneles(){
        ////////////////////////////////////////////////////////////////////////
        //PANEL1
        ////////////////////////////////////////////////////////////////////////
        panel1.setLayout(null);
        panel1.setBackground(Color.PINK);//Color del panel
        this.getContentPane().add(panel1);//Se agrega el panel a la ventana
        ////////////////////////////////////////////////////////////////////////
        //PANEL2
        ////////////////////////////////////////////////////////////////////////
        panel2.setVisible(false);
        panel2.setLayout(null);
        panel2.setBackground(Color.PINK);
        //////
        panel3.setVisible(false);
        panel3.setLayout(null);
        panel3.setBackground(Color.PINK);

    }

    private void colocarEtiquetas(){
        ////////////////////////////////////////////////////////////////////////
        //PANEL1
        ////////////////////////////////////////////////////////////////////////
        JLabel etiqueta1 = new JLabel("MENU DE OPCIONES");//ETIQUETA
        etiqueta1.setFont(new Font ("arial",Font.BOLD,20));//Tipo, Fuente(negrita), Tamaño
        etiqueta1.setOpaque(true);//Permite ver el color del fondo de la etiqueta
        etiqueta1.setBackground(Color.magenta);//Se establece el color de la etiqueta
        etiqueta1.setBounds(50, 50, 400, 30);//Posicion y medidas de la etiqueta
        etiqueta1.setHorizontalAlignment(SwingConstants.CENTER);
        //etiqueta1.setForeground(Color.MAGENTa); --- de esta forma se logra cambiar el color de letra
        panel1.add(etiqueta1);//Se agrega la etiqueta

        JLabel etiqueta2 = new JLabel("1. Insertar nuevos dulces");
        etiqueta2.setBounds(50, 90, 150, 30);
        panel1.add(etiqueta2);

        JLabel etiqueta3 = new JLabel("2. Actualizar dulces");
        etiqueta3.setBounds(50, 110, 150, 30);
        panel1.add(etiqueta3);

        JLabel etiqueta4 = new JLabel("3. Eliminar dulces");
        etiqueta4.setBounds(50, 130, 150, 30);
        panel1.add(etiqueta4);
        
        JLabel etiqueta5 = new JLabel("4. Buscar dulce por nombre");
        etiqueta5.setBounds(50, 150, 200, 30);
        panel1.add(etiqueta5);

        JLabel etiqueta6 = new JLabel("5. Listar todos los dulces");
        etiqueta6.setBounds(50, 170, 150, 30);
        panel1.add(etiqueta6);

        ////////////////////////////////////////////////////////////////////////
        //PANEL2
        ////////////////////////////////////////////////////////////////////////

        JLabel etiqueta7 = new JLabel("INGRESA NUEVOS DULCES");//ETIQUETA
        etiqueta7.setFont(new Font ("arial",Font.BOLD,20));//Tipo, Fuente(negrita), Tamaño
        etiqueta7.setOpaque(true);//Permite ver el color del fondo de la etiqueta
        etiqueta7.setBackground(Color.magenta);//Se establece el color de la etiqueta
        etiqueta7.setBounds(50, 50, 400, 30);//Posicion y medidas de la etiqueta
        etiqueta7.setHorizontalAlignment(SwingConstants.CENTER);
        //etiqueta1.setForeground(Color.MAGENTa); --- de esta forma se logra cambiar el color de letra
        panel2.add(etiqueta7);//Se agrega la etiqueta

        JLabel etiqueta8 = new JLabel("AGREGA NUEVOS DULCES");
        etiqueta8.setBounds(50, 90, 150, 30);
        panel2.add(etiqueta8);
        //////////////////
        JLabel etiqueta9 = new JLabel("INGRESA NUEVOS DULCES");//ETIQUETA
        etiqueta9.setFont(new Font ("arial",Font.BOLD,20));//Tipo, Fuente(negrita), Tamaño
        etiqueta9.setOpaque(true);//Permite ver el color del fondo de la etiqueta
        etiqueta9.setBackground(Color.magenta);//Se establece el color de la etiqueta
        etiqueta9.setBounds(50, 50, 400, 30);//Posicion y medidas de la etiqueta
        etiqueta9.setHorizontalAlignment(SwingConstants.CENTER);
        //etiqueta1.setForeground(Color.MAGENTa); --- de esta forma se logra cambiar el color de letra
        panel3.add(etiqueta9);//Se agrega la etiqueta

        JLabel etiqueta10 = new JLabel("AGREGA NUEVOS DULCES");
        etiqueta10.setBounds(50, 90, 150, 30);
        panel3.add(etiqueta10);
        


    }
    
    private void botonesCajasTexto(){
        ////////////////////////////////////////////////////////////////////////
        //PANEL1
        ////////////////////////////////////////////////////////////////////////
        JTextField cajaTexto1 = new JTextField();
        cajaTexto1.setText("Ingrese una opción (numero)");
        cajaTexto1.setBounds(165,210,170,30);
        panel1.add(cajaTexto1);
        // ----ACTION LISTENER DEL BOTON
        

        //////////////

        JButton boton1 = new JButton(/* "Aceptar" */);//creación del boton
        boton1.setText("Aceptar");//Se le proporciona un texto, sino como se muestra al crearlo
        boton1.setBounds(200,250,100,40);//Ubicacion del boton
        panel1.add(boton1);//Implementacion del boton
        boton1.setBackground(Color.magenta);

        ActionListener al = new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                opcionnumeritos=Integer.parseInt(cajaTexto1.getText());
                seleccionMenuOpciones(opcionnumeritos);
            }
        };
        boton1.addActionListener(al);

        ///////////////////////
        ////////PANEL2/////////
        ///////////////////////

        JTextField cajaTexto2 = new JTextField();
        cajaTexto2.setText("Nombre del dulce");
        cajaTexto2.setBounds(165,130,170,30);
        panel2.add(cajaTexto2);

        JButton boton2 = new JButton(/* "Aceptar" */);//creación del boton
        boton2.setText("Agregar");//Se le proporciona un texto, sino como se muestra al crearlo
        boton2.setBounds(150,200,100,40);//Ubicacion del boton
        panel2.add(boton2);//Implementacion del boton
        boton2.setBackground(Color.magenta);

        ActionListener a = new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                String temporal_name = cajaTexto2.getText();
                Dulce n = new Dulce(temporal_name);
                arrayDulces.add(n);
                for (Dulce Dulce: arrayDulces) {
                    System.out.println("Nombre: "+ Dulce.getNombre());;
                }}
        };
        boton2.addActionListener(a);


        //////////////////////////////////////////////

        JButton boton3 = new JButton(/* "Aceptar" */);//creación del boton
        boton3.setText("Volver");//Se le proporciona un texto, sino como se muestra al crearlo
        boton3.setBounds(250,200,100,40);//Ubicacion del boton
        panel2.add(boton3);//Implementacion del boton
        boton3.setBackground(Color.magenta);

        ActionListener b = new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                panel2.setVisible(false);
                panel1.setVisible(true);
            }
        };
        boton3.addActionListener(b);

    };
    
    private void seleccionMenuOpciones(int opcion){
        switch(opcion){
            case 1:
                panel1.setVisible(false);
                panel2.setVisible(true);
                this.getContentPane().add(panel2);

                break;
            case 2:
                panel1.setVisible(false);
                panel3.setVisible(true);
                this.getContentPane().add(panel3);

                System.out.println("FINO OPCION 2");
                break;
            case 3:
                System.out.println("FINO OPCION 3");
                break;
            case 4:
                System.out.println("FINO OPCION 4");
                break;
            case 5:
                System.out.println("FINO OPCION 5");
                break;
            default:
                JOptionPane.showMessageDialog(null,"error, ingrese una opcion valida ");
                break;
        }
    }
}




