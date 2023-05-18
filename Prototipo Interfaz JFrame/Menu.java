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
    public JPanel panel4 = new JPanel();
    public JPanel panel5 = new JPanel();
    public JPanel panel6 = new JPanel();
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
        buscarDulces();
        removeDulces();
        mostrarDulces();
         
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
        ////////////////////////////////////////////////////////////////////////
        //PANEL4
        ////////////////////////////////////////////////////////////////////////
        panel4.setVisible(false);
        panel4.setLayout(null);
        panel4.setBackground(Color.PINK);
        ////////////////////////////////////////////////////////////////////////
        //PANEL5
        ////////////////////////////////////////////////////////////////////////
        panel5.setVisible(false);
        panel5.setLayout(null);
        panel5.setBackground(Color.PINK);
        ////////////////////////////////////////////////////////////////////////
        //PANEL6
        ////////////////////////////////////////////////////////////////////////

        panel6.setVisible(false);
        panel6.setLayout(null);
        panel6.setBackground(Color.PINK);


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
        JLabel etiquetaOpcion = new JLabel("Ingrese una opción (numero)");
        panel1.add(etiquetaOpcion);
        etiquetaOpcion.setBounds(168,210,170,30);

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
        etiqueta8.setBounds(50, 90, 300, 30);
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
        etiqueta10.setBounds(50, 90, 200, 30);
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
        // ----ACTION LISTENER DEL BOTO
        

        //////////////

        JButton boton1 = new JButton(/* "Aceptar" */);//creación del boton
        boton1.setText("Aceptar");//Se le proporciona un texto, sino como se muestra al crearlo
        boton1.setBounds(200,290,100,40);//Ubicacion del boton     
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
        TextPrompt holder2 = new TextPrompt("Ingrese el nombre del dulce",cajaTexto2);
        cajaTexto2.setBounds(80,130,170,30);
        JTextField cajaTextoTipo = new JTextField();
        TextPrompt holder3 = new TextPrompt("Ingrese el tipo del dulce",cajaTextoTipo);
        cajaTextoTipo.setBounds(250,130,170,30);

        panel2.add(cajaTexto2);
        panel2.add(cajaTextoTipo);

        JButton boton2 = new JButton(/* "Aceptar" */);//creación del boton
        boton2.setText("Agregar");//Se le proporciona un texto, sino como se muestra al crearlo
        boton2.setBounds(150,200,100,40);//Ubicacion del boton
        panel2.add(boton2);//Implementacion del boton
        boton2.setBackground(Color.magenta);

        ActionListener a = new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                String temporal_name = cajaTexto2.getText();
                String tempTipo = cajaTextoTipo.getText(); 
                Dulce n = new Dulce(temporal_name,tempTipo);
                arrayDulces.add(n);
                for (Dulce dulce: arrayDulces) {
                    System.out.println("Nombre: "+ dulce.getNombre());
                    System.out.println("Nombre: "+ dulce.getTipoDulce());
                }
            }
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

        /*
         * Panel 3 
         */
        JTextField cajaTexto3 = new JTextField();
        cajaTexto3.setText("Buscar Dulce");
        cajaTexto3.setBounds(80,130,170,30);
        panel3.add(cajaTexto3);

        JTextField cajaTextoBuscarTipo = new JTextField();
        cajaTextoBuscarTipo.setText("Buscar Dulce");
        cajaTextoBuscarTipo.setBounds(250,130,170,30);
        panel3.add(cajaTextoBuscarTipo);

        JButton boton4 = new JButton(/* "Aceptar" */);//creación del boton
        boton4.setText("Actualizar");//Se le proporciona un texto, sino como se muestra al crearlo
        boton4.setBounds(150,200,100,40);//Ubicacion del boton
        panel3.add(boton4);//Implementacion del boton
        boton4.setBackground(Color.magenta);

        ActionListener c = new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                String temporal_name = cajaTexto3.getText();
                String tempTipo = cajaTextoBuscarTipo.getText();///////////Editar esta parte ///////////////
                Dulce n = new Dulce(temporal_name,tempTipo);///////////Editar esta parte ///////////////
                arrayDulces.add(n);
                for (Dulce dulce: arrayDulces) {
                    System.out.println("Nombre: "+ dulce.getNombre());
                    System.out.println("Nombre: "+ dulce.getTipoDulce());
                }
            }
        };
        boton4.addActionListener(c);


        //////////////////////////////////////////////

        JButton boton5 = new JButton(/* "Aceptar" */);//creación del boton
        boton5.setText("Volver");//Se le proporciona un texto, sino como se muestra al crearlo
        boton5.setBounds(250,200,100,40);//Ubicacion del boton
        panel3.add(boton5);//Implementacion del boton
        boton5.setBackground(Color.magenta);

        ActionListener d = new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                panel3.setVisible(false);
                panel1.setVisible(true);
            }
        };
        boton5.addActionListener(d);

    };

    private void buscarDulces(){
        JLabel label1 = new JLabel("Digite el dulce que desea buscar (Total dulces: "+ arrayDulces.size() + ")");
        label1.setBounds(10, 10, 300, 30);


        JTextField ctext1 = new JTextField("");
        ctext1.setBounds(10, 40, 100, 30);

        JLabel label2 = new JLabel("");
        label2.setBounds(10,80,200,30);

        JButton button1 = new JButton("Actualizar");
        button1.setBounds(0, 400, 100, 100);
        ActionListener accionBoton = new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String tempName = ctext1.getText();
                int index = 0;

                for (Dulce dulce: arrayDulces){
                    String nombreD = arrayDulces.get(index).getNombre();
                    label1.setText("Digite el dulce que desea buscar(Total dulces: "+ arrayDulces.size() + ")");
                    
                    if(tempName.equals(nombreD)){
                        System.out.println(arrayDulces.get(index).getNombre());
                        label2.setText("'" + dulce.getNombre() + "'" + " si existe");
                    }
                    else{
                        label2.setText("El nombre de este dulce no existe");
                    }
                    index++;
                }
                
            }
            
        };
        button1.addActionListener(accionBoton);
        
        
        panel5.add(label1);
        panel5.add(ctext1);
        panel5.add(button1);
        panel5.add(label2);
        botonVolver(100, 400, 100, 100,panel5);

    }
        ///////// Remover dulces /////////
    private void removeDulces(){
        JLabel labelRemove = new JLabel(" Ingrese el nombre del dulce que desea eliminar ");
        labelRemove.setBounds(125,50,280,50);


        JTextField cTRemove = new JTextField("");
        cTRemove.setBounds(168,100,170,30);


        JButton botonRemove = new JButton("Remover");
        botonRemove.setBounds(150,150,100,40);

        JButton boton3 = new JButton(/* "Aceptar" */);//creación del boton
        boton3.setText("Volver");//Se le proporciona un texto, sino como se muestra al crearlo
        boton3.setBounds(250,150,100,40);//Ubicacion del boton
        
        ActionListener aRemove = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int index = 0;
                String tempName = cTRemove.getText();
                for (Dulce dulce: arrayDulces){
                    String nombreD = arrayDulces.get(index).getNombre();

                        if(tempName.equals(nombreD)){
                            arrayDulces.remove(dulce);
                            System.out.println(arrayDulces.get(index).getNombre());
                            return;
                        }
                    index++;
                    }
                }
            };
        botonRemove.addActionListener(aRemove);

        botonVolver(250, 150, 100, 40, panel4);
        panel4.add(labelRemove);
        panel4.add(cTRemove);
        panel4.add(botonRemove);
    }
        ///////// Mostrar dulces /////////
    private void mostrarDulces(){  //Mejorar diseño 
        JLabel tittle = new JLabel("Lista de Dulces: ");
        tittle.setBounds(10,10,200,50);

        JLabel nameType = new JLabel("Nombre                 Tipo ");  
        nameType.setBounds(10,28, 250, 100);  

        JButton button1 = new JButton("Actualizar");
        button1.setBounds(0, 400, 100, 100);
        ActionListener a = new ActionListener() {
            public void actionPerformed(ActionEvent e){
                panel6.removeAll();
                int index = 1;
                int cont = 40;

                for(Dulce dulce : arrayDulces) {
                    JLabel label = new JLabel(); 
                    JLabel label2 = new JLabel(); 
                    System.out.println(arrayDulces.get(index-1).getNombre());
                    label.setText(index + ": " + dulce.getNombre());
                    label2.setText(dulce.getTipoDulce());
                    label.setBounds(10,cont , 100, 100);
                    label2.setBounds(111,cont , 150, 100);
                    panel6.add(label);
                    panel6.add(label2);
                    index++;
                    cont+=10;   
                }
                panel6.revalidate(); // Volver a calcular el diseño del panel
                panel6.repaint(); // Repintar el panel en pantalla    
                panel6.add(tittle);
                panel6.add(nameType);
                panel6.add(button1);
                botonVolver(100, 400, 100, 100,panel6);
            }
        };
        botonVolver(100, 400, 100, 100,panel6);
        button1.addActionListener(a);
        panel6.add(tittle);
        panel6.add(nameType);
        panel6.add(button1);

        
    }
    public void botonVolver(int x,int y,int width,int height,JPanel panel) {
        JButton boton = new JButton(/* "Aceptar" */);//creación del boton
        boton.setText("Volver");//Se le proporciona un texto, sino como se muestra al crearlo
        boton.setBounds(x,y,width,height);//Ubicacion del boton
        panel.add(boton);//Implementacion del boton
        boton.setBackground(Color.magenta);

        ActionListener d = new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                panel.setVisible(false);
                panel1.setVisible(true);
            }
        };
        boton.addActionListener(d);
        panel.add(boton);
    }
    
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
                break;
            case 3:
                panel1.setVisible(false);
                panel4.setVisible(true);
                this.getContentPane().add(panel4);
                break;
            case 4:
                panel1.setVisible(false);
                panel5.setVisible(true);
                this.getContentPane().add(panel5);
                break;
            case 5:

                panel1.setVisible(false);
                panel6.setVisible(true);
                this.getContentPane().add(panel6);
                
                break;
            default:
                JOptionPane.showMessageDialog(null,"error, ingrese una opcion valida ");
                break;
        }
    }
}




