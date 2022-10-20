package automata;

import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author daphn
 */
public class AutomataView extends javax.swing.JFrame {

    public AutomataView() {
        initComponents();
        initTablaDeTransiciones();
    }

    File archivo = null;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        diagramaImg = new javax.swing.JLabel();
        crearDiagrama = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTran = new javax.swing.JTable();
        botonAgregarEstado = new javax.swing.JButton();
        creaDiagrama = new javax.swing.JButton();
        input = new javax.swing.JTextField();
        evaluar = new javax.swing.JButton();
        botonEliminarEstado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        crearDiagrama.setText("Crear diagrama");
        crearDiagrama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearDiagramaActionPerformed(evt);
            }
        });

        tablaTran.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Estados", "vocal", "+", "-", ".", "/", "FDC"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaTran.setRowHeight(25);
        tablaTran.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaTran);
        if (tablaTran.getColumnModel().getColumnCount() > 0) {
            tablaTran.getColumnModel().getColumn(0).setResizable(false);
            tablaTran.getColumnModel().getColumn(1).setResizable(false);
            tablaTran.getColumnModel().getColumn(2).setResizable(false);
            tablaTran.getColumnModel().getColumn(3).setResizable(false);
            tablaTran.getColumnModel().getColumn(4).setResizable(false);
            tablaTran.getColumnModel().getColumn(5).setResizable(false);
            tablaTran.getColumnModel().getColumn(6).setResizable(false);
        }

        botonAgregarEstado.setText("+");
        botonAgregarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarEstadoActionPerformed(evt);
            }
        });

        creaDiagrama.setText("Crear Diagrama");
        creaDiagrama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creaDiagramaActionPerformed(evt);
            }
        });

        evaluar.setText("Evaluar");
        evaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evaluarActionPerformed(evt);
            }
        });

        botonEliminarEstado.setText("-");
        botonEliminarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(crearDiagrama)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(creaDiagrama))
                        .addComponent(diagramaImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(botonAgregarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botonEliminarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(evaluar)))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregarEstado)
                    .addComponent(botonEliminarEstado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crearDiagrama)
                    .addComponent(creaDiagrama))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diagramaImg, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(evaluar))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initTablaDeTransiciones() {
        comboBox.addItem("Error");
        comboBox.addItem("q0");
        setOpcionesDeEstados();
        DefaultTableModel model = (DefaultTableModel) tablaTran.getModel();
        model.addRow(new Object[]{"q0", "", "", "", "", "", "Error"});
        JComboBox fdcComboBox = new JComboBox();
        fdcComboBox.addItem("Error");
        fdcComboBox.addItem("Aceptar");
        TableColumn column6 = tablaTran.getColumnModel().getColumn(6);
        column6.setCellEditor(new DefaultCellEditor(fdcComboBox));
    }

    private void setOpcionesDeEstados() {
        TableColumn column1 = tablaTran.getColumnModel().getColumn(1);
        TableColumn column2 = tablaTran.getColumnModel().getColumn(2);
        TableColumn column3 = tablaTran.getColumnModel().getColumn(3);
        TableColumn column4 = tablaTran.getColumnModel().getColumn(4);
        TableColumn column5 = tablaTran.getColumnModel().getColumn(5);
        column1.setCellEditor(new DefaultCellEditor(comboBox));
        column2.setCellEditor(new DefaultCellEditor(comboBox));
        column3.setCellEditor(new DefaultCellEditor(comboBox));
        column4.setCellEditor(new DefaultCellEditor(comboBox));
        column5.setCellEditor(new DefaultCellEditor(comboBox));
    }
    private void botonAgregarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarEstadoActionPerformed
        int rowCount = tablaTran.getRowCount();
        if (rowCount >= 7) {
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tablaTran.getModel();
        String nombreEstado = "q" + Integer.toString(rowCount);
        model.addRow(new Object[]{nombreEstado, "", "", "", "", "", "Error"});
        comboBox.addItem(nombreEstado);
    }//GEN-LAST:event_botonAgregarEstadoActionPerformed

    private void creaDiagramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creaDiagramaActionPerformed
        int rowCount = tablaTran.getRowCount();
        List<Estado> estados = new ArrayList<>();
        for (int i = 0; i < rowCount; i++) {
            String nombreEstado = "q" + Integer.toString(i);
            boolean esFinal = false;
            String fdc = (String) tablaTran.getValueAt(i, 6);
            if (fdc.equals("Aceptar")) {
                esFinal = true;
            }
            Estado estado = new Estado(nombreEstado, esFinal);
            estados.add(estado);
        }
        for (int i = 0; i < rowCount; i++) {
            String column1 = (String) tablaTran.getValueAt(i, 1);
            String column2 = (String) tablaTran.getValueAt(i, 2);
            String column3 = (String) tablaTran.getValueAt(i, 3);
            String column4 = (String) tablaTran.getValueAt(i, 4);
            String column5 = (String) tablaTran.getValueAt(i, 5);
            if (!column1.isEmpty() && !column1.equals("Error")) {
                int indice = Estado.getIndice(column1);
                Transicion transicion = new Transicion('v', estados.get(indice));
                estados.get(i).agregarTransicion(transicion);
            }
            if (!column2.isEmpty() && !column2.equals("Error")) {
                int indice = Estado.getIndice(column2);
                Transicion transicion = new Transicion('+', estados.get(indice));
                estados.get(i).agregarTransicion(transicion);
            }
            if (!column3.isEmpty() && !column3.equals("Error")) {
                int indice = Estado.getIndice(column3);
                Transicion transicion = new Transicion('-', estados.get(indice));
                estados.get(i).agregarTransicion(transicion);
            }
            if (!column4.isEmpty() && !column4.equals("Error")) {
                int indice = Estado.getIndice(column4);
                Transicion transicion = new Transicion('.', estados.get(indice));
                estados.get(i).agregarTransicion(transicion);
            }
            if (!column5.isEmpty() && !column5.equals("Error")) {
                int indice = Estado.getIndice(column5);
                Transicion transicion = new Transicion('/', estados.get(indice));
                estados.get(i).agregarTransicion(transicion);
            }
        }

        automata.setEstados(estados);
        String directorio = new File("").getAbsolutePath();
        directorio = directorio.concat("\\automata.txt");
        try {
            FileWriter escritor = new FileWriter(directorio);
            PrintWriter impresor = new PrintWriter(escritor);
            String diagraph = automata.toDiagraph();
            impresor.print(diagraph);
            escritor.close();
        } catch (IOException ex) {
            Logger.getLogger(AutomataView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_creaDiagramaActionPerformed

    private void evaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evaluarActionPerformed
        if (automata.getEstados().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Automata vacío");
            return;
        }

        String expresion = input.getText();
        int longitud = automata.getEstados().size();
        Estado inicial = automata.getEstados().get(0);
        boolean inicialVacio = inicial.getTransiciones().isEmpty();
        boolean esFinal = inicial.esFinal();
        if (longitud == 1 && inicialVacio && esFinal && expresion.isEmpty()) {
            String mensaje = "El automata reconoce la palabra!";
            JOptionPane.showMessageDialog(rootPane, mensaje, "Éxito!", 3);
            return;
        }
        if (expresion.isEmpty()) {
            String mensaje = "El automata no reconoce la palabra.";
            JOptionPane.showMessageDialog(rootPane, mensaje, "Fallo", 0);
            return;
        }
        Estado estadoInicial = automata.getEstados().get(0);
        boolean esCorrecto = automata.evaluarExpresion(expresion, estadoInicial);
        if (esCorrecto) {
            String mensaje = "El automata reconoce la palabra!";
            JOptionPane.showMessageDialog(rootPane, mensaje, "Éxito!", 3);
        } else {
            String mensaje = "El automata no reconoce la palabra.";
            JOptionPane.showMessageDialog(rootPane, mensaje, "Fallo", 0);
        }
    }//GEN-LAST:event_evaluarActionPerformed

    private void botonEliminarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarEstadoActionPerformed
        DefaultTableModel model = (DefaultTableModel) tablaTran.getModel();
        int rowCount = model.getRowCount();
        if (rowCount == 1) {
            return;
        }
        model.removeRow(--rowCount);
        String nombreEstado = "q" + Integer.toString(rowCount);
        comboBox.removeItem(nombreEstado);
    }//GEN-LAST:event_botonEliminarEstadoActionPerformed

    private void crearDiagramaActionPerformed(java.awt.event.ActionEvent evt) {

        int nuevo = 0;
        String estadofinal = "";

        try {

            for (int i = 0; i < tablaTran.getRowCount(); i++) {
                if (tablaTran.getValueAt(i, 1) == null) {
                    JOptionPane.showMessageDialog(null, "Debe llenar todos los campos de la tabla de transiciones");
                    break;
                } else {
                    System.out.println("entra acaaaaa");
                }
            }

            for (int i = 0; i < tablaTran.getRowCount(); i++) {
                System.out.println("Estados: " + tablaTran.getValueAt(i, 0));
                System.out.println("Vocal: " + tablaTran.getValueAt(i, 1));
                System.out.println("+: " + tablaTran.getValueAt(i, 2));
                System.out.println("-: " + tablaTran.getValueAt(i, 3));
                System.out.println(".: " + tablaTran.getValueAt(i, 4));
                System.out.println("/: " + tablaTran.getValueAt(i, 5));
                System.out.println("FCP: " + tablaTran.getValueAt(i, 6));

                String palabraViene = tablaTran.getValueAt(i, nuevo++).toString();
                if (palabraViene.toUpperCase().equals("ERROR") || palabraViene.toUpperCase().equals("Q0")
                        || palabraViene.toUpperCase().equals("Q1")
                        || palabraViene.toUpperCase().equals("Q2")
                        || palabraViene.toUpperCase().equals("Q3")
                        || palabraViene.toUpperCase().equals("Q4")
                        || palabraViene.toUpperCase().equals("Q5")
                        || palabraViene.toUpperCase().equals("Q6")) {
                    System.out.println("Soy todo lo aceptado: desde ERROR hasta Q6 ");
                } else {
                    JOptionPane.showMessageDialog(null, "campos inválidos");
                    break;
                }

            }
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Error al abrir: " + ex);
        }

        List<String> fin = new ArrayList<>();
        fin.add(estadofinal);

        for (int i = 0; i < tablaTran.getRowCount(); i++) {
            System.out.println("FCP: " + tablaTran.getValueAt(i, 6));
            Object valores = tablaTran.getValueAt(i, 6);
            if (valores.equals("Aceptar")) {
                estadofinal = "doublecircle";
                //System.out.println(estadofinal);
                fin.add(estadofinal);
            } else {
                estadofinal = "circle";
                //System.out.println(estadofinal);
                fin.add(estadofinal);
            }
        }

        System.out.println(fin);

        //Aqui se crea el automata con el formato .dot y se guarda en un archivo txt
        FileWriter fichero = null;
        PrintWriter pw = null;

        String automata = "digraph Automata {\n"
                + "    rankdir=LR;\n"
                + "    size=\"8,5\"\n"
                + "\n"
                + "    node [shape = " + fin.get(1) + "]; q0;\n"
                + "    node [shape = " + fin.get(2) + "]; q1;\n"
                + "    node [shape = " + fin.get(3) + "]; q2;\n"
                + "    node [shape = " + fin.get(4) + "]; q3;\n"
                + "    node [shape = " + fin.get(5) + "]; q4;\n"
                + "    node [shape = " + fin.get(6) + "]; q5;\n"
                + "    node [shape = " + fin.get(7) + "]; q6;\n"
                + "    node [shape = point ]; qi\n"
                + "\n"
                //              + "    node [shape = circle];\n"
                + "    qi -> q0;\n"
                + "    q0  -> q1 [ label = \"a\" ];\n"
                + "    q0  -> q0  [ label = \"a\" ];\n"
                + "    q1 -> q0  [ label = \"a\" ];\n"
                + "    q1 -> q2 [ label = \"b\" ];\n"
                + "    q2 -> q1 [ label = \"b\" ];\n"
                + "    q2 -> q2 [ label = \"b\" ];\n"
                + "    q2  -> q3 [ label = \"a\" ];\n"
                + "    q3  -> q4 [ label = \"a\" ];\n"
                + "    q4  -> q5 [ label = \"a\" ];\n"
                + "    q5  -> q6 [ label = \"a\" ];\n"
                + "}";

        try {
            //fichero = new FileWriter("C:\\Users\\daphn\\OneDrive\\Documentos\\automata.txt");
            fichero = new FileWriter("C:\\Users\\kenne\\Desktop\\automata.txt");
            pw = new PrintWriter(fichero);

            //pw.println(a.toDot());
            pw.println(automata);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

//Aqui abre la imagen del automata que se creo        
        //archivo = new File ("C:\\Users\\daphn\\OneDrive\\Documentos\\automata.jpg");
        archivo = new File("C:\\Users\\kennet\\OneDrive\\Desktop\\automata.jpg");

        try {
            ImageIcon ImagIcon = new ImageIcon(archivo.toString());
            Image icono = ImagIcon.getImage().getScaledInstance(diagramaImg.getWidth(), diagramaImg.getHeight(), Image.SCALE_AREA_AVERAGING);
            Icon iconoEscalado = new ImageIcon(icono);
            diagramaImg.setIcon(iconoEscalado);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al abrir: " + ex);
        }

    }// GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        try {
            String dotPath = "C:\\Program Files\\Graphviz\\bin\\dot.exe";

            // String fileInputPath =
            // "C:\\Users\\daphn\\OneDrive\\Documentos\\automata.txt";
            String fileInputPath = "C:\\Users\\kenne\\OneDrive\\Desktop\\automata.txt";
            // String fileOutputPath =
            // "C:\\Users\\daphn\\OneDrive\\Documentos\\automata.jpg";
            String fileOutputPath = "C:\\Users\\kenne\\OneDrive\\Desktop\\automata.jpg";

            String tParam = "-Tjpg";
            String tOParam = "-o";

            String[] cmd = new String[5];
            cmd[0] = dotPath;
            cmd[1] = tParam;
            cmd[2] = fileInputPath;
            cmd[3] = tOParam;
            cmd[4] = fileOutputPath;

            Runtime rt = Runtime.getRuntime();

            rt.exec(cmd);

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AutomataView().setVisible(true);
            }
        });

    }

    JComboBox comboBox = new JComboBox();
    Automata automata = new Automata();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarEstado;
    private javax.swing.JButton botonEliminarEstado;
    private javax.swing.JButton creaDiagrama;
    private javax.swing.JButton crearDiagrama;
    public static javax.swing.JLabel diagramaImg;
    private javax.swing.JButton evaluar;
    private javax.swing.JTextField input;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaTran;
    // End of variables declaration//GEN-END:variables
}
