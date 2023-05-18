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
        panel1.setBackground(new Color(25,34,43));//Color del panel
        this.getContentPane().add(panel1);//Se agrega el panel a la ventana
        ////////////////////////////////////////////////////////////////////////
        //PANEL2
        ////////////////////////////////////////////////////////////////////////
        panel2.setVisible(false);
        panel2.setLayout(null);
        panel2.setBackground(new Color(25,34,43));
        //////
        panel3.setVisible(false);
        panel3.setLayout(null);
        panel3.setBackground(new Color(25,34,43));
        ////////////////////////////////////////////////////////////////////////
        //PANEL4
        ////////////////////////////////////////////////////////////////////////
        panel4.setVisible(false);
        panel4.setLayout(null);
        panel4.setBackground(new Color(25,34,43));
        ////////////////////////////////////////////////////////////////////////
        //PANEL5
        ////////////////////////////////////////////////////////////////////////
        panel5.setVisible(false);
        panel5.setLayout(null);
        panel5.setBackground(new Color(25,34,43));
        ////////////////////////////////////////////////////////////////////////
        //PANEL6
        ////////////////////////////////////////////////////////////////////////

        panel6.setVisible(false);
        panel6.setLayout(null);
        panel6.setBackground(new Color(25,34,43));


    }

    private void colocarEtiquetas(){
        ////////////////////////////////////////////////////////////////////////
        //PANEL1
        ////////////////////////////////////////////////////////////////////////
        JLabel etiqueta1 = new JLabel("MENU DE OPCIONES");//ETIQUETA
        etiqueta1.setFont(new Font ("arial",Font.BOLD,20));
        etiqueta1.setForeground(new Color(189, 146, 64));
        etiqueta1.setBounds(50, 50, 400, 30);//Posicion y medidas de la etiqueta
        etiqueta1.setHorizontalAlignment(SwingConstants.CENTER);
        
        panel1.add(etiqueta1);//Se agrega la etiqueta

        JLabel etiqueta2 = new JLabel("1. Insertar nuevos dulces");
        etiqueta2.setBounds(50, 90, 150, 30);
        etiqueta2.setForeground(new Color(189, 146, 64));
        panel1.add(etiqueta2);

        JLabel etiqueta3 = new JLabel("2. Actualizar dulces");
        etiqueta3.setBounds(50, 110, 150, 30);
        etiqueta3.setForeground(new Color(189, 146, 64));
        panel1.add(etiqueta3);

        JLabel etiqueta4 = new JLabel("3. Eliminar dulces");
        etiqueta4.setBounds(50, 130, 150, 30);
        etiqueta4.setForeground(new Color(189, 146, 64));
        panel1.add(etiqueta4);
        
        JLabel etiqueta5 = new JLabel("4. Buscar dulce por nombre");
        etiqueta5.setBounds(50, 150, 200, 30);
        etiqueta5.setForeground(new Color(189, 146, 64));
        panel1.add(etiqueta5);

        JLabel etiqueta6 = new JLabel("5. Listar todos los dulces");
        etiqueta6.setBounds(50, 170, 150, 30);
        etiqueta6.setForeground(new Color(189, 146, 64));
        panel1.add(etiqueta6);
        

        ////////////////////////////////////////////////////////////////////////
        //PANEL2
        ////////////////////////////////////////////////////////////////////////

        JLabel etiqueta7 = new JLabel("INGRESA NUEVOS DULCES");//ETIQUETA
        etiqueta7.setFont(new Font ("arial",Font.BOLD,20));
        etiqueta7.setForeground(new Color(189, 146, 64));
        etiqueta7.setBounds(50, 50, 400, 30);
        etiqueta7.setHorizontalAlignment(SwingConstants.CENTER);
        panel2.add(etiqueta7);//Se agrega la etiqueta

        JLabel etiqueta8 = new JLabel("AGREGA NUEVOS DULCES");
        etiqueta8.setBounds(50, 90, 300, 30);
        etiqueta8.setForeground(new Color(189, 146, 64));
        panel2.add(etiqueta8);
        //////////////////
        JLabel etiqueta9 = new JLabel("ACTUALIZAR DULCES");//ETIQUETA
        etiqueta9.setFont(new Font ("arial",Font.BOLD,20));
        etiqueta9.setForeground(new Color(189, 146, 64));
        etiqueta9.setBounds(50, 50, 400, 30);//Posicion y medidas de la etiqueta
        etiqueta9.setHorizontalAlignment(SwingConstants.CENTER);
        panel3.add(etiqueta9);

        JLabel etiqueta10 = new JLabel("ACTUALIZA UN DULCE");
        etiqueta10.setBounds(50, 90, 300, 30);
        etiqueta10.setForeground(new Color(189, 146, 64));
        panel3.add(etiqueta10);
        ////////////
        //PANEL4
        //////

        JLabel etiqueta11 = new JLabel("ELIMINAR DULCES");//ETIQUETA
        etiqueta11.setFont(new Font ("arial",Font.BOLD,20));
        etiqueta11.setForeground(new Color(189, 146, 64));
        etiqueta11.setBounds(50, 30, 400, 30);//Posicion y medidas de la etiqueta
        etiqueta11.setHorizontalAlignment(SwingConstants.CENTER);
        
        panel4.add(etiqueta11);


    }
    
    private void botonesCajasTexto(){
        ////////////////////////////////////////////////////////////////////////
        //PANEL1
        ////////////////////////////////////////////////////////////////////////
        JTextField cajaTexto1 = new JTextField();
        TextPrompt holder = new TextPrompt("Ingrese la opcion (numero)",cajaTexto1);
        holder.setFont(new Font ("arial",Font.BOLD,10));
        holder.setForeground(new Color(189, 146, 64));

        cajaTexto1.setBounds(165,210,180,30);
        cajaTexto1.setFont(new Font ("arial",Font.BOLD,10));
        cajaTexto1.setForeground(new Color(189, 146, 64));
        panel1.add(cajaTexto1);
        // ----ACTION LISTENER DEL BOTO
        

        //////////////

        JButton boton1 = new JButton();
        boton1.setText("Aceptar");
        boton1.setForeground(new Color(189, 146, 64));;
        boton1.setFont(new Font ("arial",Font.BOLD,15));
        boton1.setBackground(new Color(184, 67, 87));
        boton1.setBounds(200,290,100,40);//Ubicacion del boton     
        panel1.add(boton1);//Implementacion del boton

        ActionListener al = new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                opcionnumeritos=Integer.parseInt(cajaTexto1.getText());
                seleccionMenuOpciones(opcionnumeritos);
                cajaTexto1.setText("");
            }
        };
        boton1.addActionListener(al);

        ///////////////////////
        ////////PANEL2/////////
        ///////////////////////

        JTextField cajaTexto2 = new JTextField();
        TextPrompt holder2 = new TextPrompt("Ingrese el nombre del dulce",cajaTexto2);
        holder2.setFont(new Font ("arial",Font.BOLD,10));
        holder2.setForeground(new Color(189, 146, 64));
        cajaTexto2.setBounds(80,130,170,30);
        cajaTexto2.setFont(new Font ("arial",Font.BOLD,10));
        cajaTexto2.setForeground(new Color(189, 146, 64));
        JTextField cajaTextoTipo = new JTextField();
        TextPrompt holder3 = new TextPrompt("Ingrese el tipo del dulce",cajaTextoTipo);
        holder3.setFont(new Font ("arial",Font.BOLD,10));
        holder3.setForeground(new Color(189, 146, 64));
        cajaTextoTipo.setBounds(250,130,170,30);
        cajaTextoTipo.setFont(new Font ("arial",Font.BOLD,10));
        cajaTextoTipo.setForeground(new Color(189, 146, 64));

        panel2.add(cajaTexto2);
        panel2.add(cajaTextoTipo);

        JButton boton2 = new JButton(/* "Aceptar" */);//creación del boton
        boton2.setText("Agregar");//Se le proporciona un texto, sino como se muestra al crearlo
        boton2.setBounds(150,200,100,40);//Ubicacion del boton
        boton2.setForeground(new Color(189, 146, 64));;
        boton2.setFont(new Font ("arial",Font.BOLD,15));
        boton2.setBackground(new Color(184, 67, 87));
        panel2.add(boton2);//Implementacion del boton


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
        boton3.setForeground(new Color(189, 146, 64));
        boton3.setFont(new Font ("arial",Font.BOLD,15));
        boton3.setBackground(new Color(184, 67, 87));
        panel2.add(boton3);//Implementacion del boton

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
        TextPrompt holder4 = new TextPrompt("Nombre del dulce",cajaTexto3);
        holder4.setFont(new Font ("arial",Font.BOLD,10));
        holder4.setForeground(new Color(189, 146, 64));
        cajaTexto3.setBounds(150,150,180,30);
        cajaTexto3.setFont(new Font ("arial",Font.BOLD,10));
        cajaTexto3.setForeground(new Color(189, 146, 64));
        panel3.add(cajaTexto3);

        JTextField cajaTextoActualizarNombre = new JTextField();
        TextPrompt holder5 = new TextPrompt("Nuevo nombre ",cajaTextoActualizarNombre);
        holder5.setFont(new Font ("arial",Font.BOLD,10));
        holder5.setForeground(new Color(189, 146, 64));
        

        cajaTextoActualizarNombre.setBounds(90,250,140,30);
        cajaTextoActualizarNombre.setFont(new Font ("arial",Font.BOLD,10));
        cajaTextoActualizarNombre.setForeground(new Color(189, 146, 64));
        panel3.add(cajaTextoActualizarNombre);

        JTextField cajaTextoActualizarTipo = new JTextField();
        TextPrompt holder6 = new TextPrompt("Nuevo Tipo",cajaTextoActualizarTipo);
        holder6.setFont(new Font ("arial",Font.BOLD,10));
        holder6.setForeground(new Color(189, 146, 64));

        cajaTextoActualizarTipo.setBounds(250,250,140,30);
        cajaTextoActualizarTipo.setFont(new Font ("arial",Font.BOLD,10));
        cajaTextoActualizarTipo.setForeground(new Color(189, 146, 64));
        panel3.add(cajaTextoActualizarTipo);

        cajaTextoActualizarNombre.setEditable(false);cajaTextoActualizarTipo.setEditable(false);

        JButton boton4 = new JButton(/* "Aceptar" */);//creación del boton
        boton4.setText("Buscar");//Se le proporciona un texto, sino como se muestra al crearlo
        boton4.setBounds(190,190,100,40);//Ubicacion del boton
        boton4.setForeground(new Color(189, 146, 64));
        boton4.setFont(new Font ("arial",Font.BOLD,15));
        boton4.setBackground(new Color(184, 67, 87));
        panel3.add(boton4);//Implementacion del boton

        ActionListener c = new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                String temporal_name = cajaTexto3.getText();
                
                int indexid=0;
                for (Dulce dulce: arrayDulces) {
                    if(temporal_name.equals(arrayDulces.get(indexid).getNombre())){
                        cajaTextoActualizarNombre.setEditable(true);cajaTextoActualizarTipo.setEditable(true);
                        cajaTexto3.setEditable(false);}
                        indexid++;   
                }                
            }
        };
        boton4.addActionListener(c);
        JButton botonS = new JButton(/* "Aceptar" */);//creación del boton
        botonS.setText("Actualizar");//Se le proporciona un texto, sino como se muestra al crearlo
        botonS.setBounds(120,300,100,40);//Ubicacion del boton
        botonS.setForeground(new Color(189, 146, 64));
        botonS.setFont(new Font ("arial",Font.BOLD,15));
        botonS.setBackground(new Color(184, 67, 87));
        panel3.add(botonS);//Implementacion del boton
        ActionListener act = new ActionListener(){
        public void actionPerformed(ActionEvent act){
            String temporal_name = cajaTexto3.getText();

            int i =0;
            for (Dulce dulce: arrayDulces) {
                if(temporal_name.equals(arrayDulces.get(i).getNombre())){
            arrayDulces.get(i).setNombre(cajaTextoActualizarNombre.getText());
            arrayDulces.get(i).setTipoDulce(cajaTextoActualizarTipo.getText());
            cajaTexto3.setEditable(true);
            cajaTextoActualizarNombre.setEditable(false);cajaTextoActualizarTipo.setEditable(false);}
            i++;
            }
            cajaTexto3.setText("");cajaTextoActualizarNombre.setText("");cajaTextoActualizarTipo.setText("");

        }};
        botonS.addActionListener(act);
        //////////////////////////////////////////////
        
        JButton boton5 = new JButton(/* "Aceptar" */);//creación del boton
        boton5.setText("Volver");//Se le proporciona un texto, sino como se muestra al crearlo
        boton5.setBounds(270,300,100,40);//Ubicacion del boton
        boton5.setForeground(new Color(189, 146, 64));
        boton5.setFont(new Font ("arial",Font.BOLD,15));
        boton5.setBackground(new Color(184, 67, 87));
        panel3.add(boton5);//Implementacion del boton


        ActionListener d = new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                panel3.setVisible(false);
                panel1.setVisible(true);
            }
        };
        boton5.addActionListener(d);

    };

    private void buscarDulces(){

        JLabel etiqueta1 = new JLabel("BUSCAR DULCE");//ETIQUETA
        etiqueta1.setFont(new Font ("arial",Font.BOLD,20));
        etiqueta1.setForeground(new Color(189, 146, 64));
        etiqueta1.setBounds(50, 50, 400, 30);//Posicion y medidas de la etiqueta
        etiqueta1.setHorizontalAlignment(SwingConstants.CENTER);
        panel5.add(etiqueta1);//Se agrega la etiqueta

        JLabel label1 = new JLabel("Digite el dulce que desea buscar (Total dulces: "+ arrayDulces.size() + ")");
        label1.setBounds(10, 90, 300, 30);
        label1.setForeground(new Color(189, 146, 64));


        JTextField ctext1 = new JTextField("");
        ctext1.setBounds(10, 120, 100, 30);
        

        JLabel label2 = new JLabel("");
        label2.setBounds(10,160,200,30);
        label2.setForeground(new Color(189, 146, 64));
        

        JButton button1 = new JButton("Actualizar");
        button1.setBounds(0, 200, 180, 40);
        button1.setForeground(new Color(189, 146, 64));
        button1.setFont(new Font ("arial",Font.BOLD,15));
        button1.setBackground(new Color(184, 67, 87));
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
        botonVolver(180, 200, 100, 40,panel5);

    }
        ///////// Remover dulces /////////
    private void removeDulces(){
        JLabel etiqueta1 = new JLabel("ELIMINAR DULCES");//ETIQUETA
        etiqueta1.setFont(new Font ("arial",Font.BOLD,20));
        etiqueta1.setForeground(new Color(189, 146, 64));
        etiqueta1.setBounds(50, 30, 400, 30);//Posicion y medidas de la etiqueta
        etiqueta1.setHorizontalAlignment(SwingConstants.CENTER);
        panel4.add(etiqueta1);//Se agrega la etiqueta

        JLabel labelRemove = new JLabel(" Ingrese el nombre del dulce que desea eliminar ");
        labelRemove.setBounds(110,55,280,50);
        labelRemove.setForeground(new Color(189, 146, 64));


        JTextField cTRemove = new JTextField("");
        cTRemove.setBounds(168,100,170,30);


        JButton botonRemove = new JButton("Remover");
        botonRemove.setBounds(150,150,100,40);
        botonRemove.setForeground(new Color(189, 146, 64));
        botonRemove.setFont(new Font ("arial",Font.BOLD,15));
        botonRemove.setBackground(new Color(184, 67, 87));

        JButton boton3 = new JButton(/* "Aceptar" */);//creación del boton
        boton3.setText("Volver");//Se le proporciona un texto, sino como se muestra al crearlo
        boton3.setBounds(250,150,100,40);//Ubicacion del boton
        boton3.setForeground(new Color(189, 146, 64));
        boton3.setFont(new Font ("arial",Font.BOLD,15));
        boton3.setBackground(new Color(184, 67, 87));
        
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
        tittle.setForeground(new Color(189, 146, 64));

        JLabel nameType = new JLabel("Nombre                 Tipo ");  
        nameType.setBounds(10,20, 250, 100);  
        nameType.setForeground(new Color(189, 146, 64));

        JButton button1 = new JButton("Actualizar");
        button1.setBounds(0, 400, 180, 40);
        button1.setForeground(new Color(189, 146, 64));
        button1.setFont(new Font ("arial",Font.BOLD,15));
        button1.setBackground(new Color(184, 67, 87));
        ActionListener a = new ActionListener() {
            public void actionPerformed(ActionEvent e){
                panel6.removeAll();
                int index = 1;
                int cont = 40;

                for(Dulce dulce : arrayDulces) {
                    JLabel label = new JLabel(); 
                    JLabel label2 = new JLabel(); 
                    label.setForeground(new Color(189, 146, 64));
                    label2.setForeground(new Color(189, 146, 64));
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
                botonVolver(180, 400, 100, 40,panel6);
            }
        };
        botonVolver(180, 400, 100, 40,panel6);
        button1.addActionListener(a);
        panel6.add(tittle);
        panel6.add(nameType);
        panel6.add(button1);

        
    }
    public void botonVolver(int x,int y,int width,int height,JPanel panel) {
        JButton boton = new JButton(/* "Aceptar" */);//creación del boton
        boton.setText("Volver");//Se le proporciona un texto, sino como se muestra al crearlo
        boton.setBounds(x,y,width,height);//Ubicacion del boton
        boton.setForeground(new Color(189, 146, 64));
        boton.setFont(new Font ("arial",Font.BOLD,15));
        boton.setBackground(new Color(184, 67, 87));
        panel.add(boton);//Implementacion del boton


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




