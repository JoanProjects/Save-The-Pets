package vista;

/**
 * Panel que representa la sección de Introducción del manual de usuario.
 * @author Walla Peguero
 */
public class ManualDeUsuario1 extends javax.swing.JPanel {

    /**
     * Creates new form ManualDeUsuario1
     */
    /**
     * Constructor del panel ManualDeUsuario1.
     * Inicializa los componentes y establece el foco en la etiqueta de título.
     */
    public ManualDeUsuario1() {
        initComponents();
        lblTitulo.requestFocus();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(15, 15, 15));

        lblTitulo.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Manual de Usuario del Programa \"Save the Pets\"");

        jTextArea1.setBackground(new java.awt.Color(15, 15, 15));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("1. Introducción:\n\nEl programa \" Save the Pets \" es una herramienta desarrollada en Java para\ngestionar y monitorear el ingreso de animales en un refugio de animales. Su diseño\nintuitivo y funcionalidad eficiente permiten llevar un control preciso y actualizado\nsobre el estado de los animales que se encuentren en el refugio.\n\nObjetivos:\n\nFacilitar la administración de registros de entrada de animales.\nGarantizar un manejo seguro y ordenado de los animales.\nPúblico objetivo: Personal administrativo o de logística encargado del registro y\nmonitoreo de los animales.\n\n2. Requisitos del Sistema:\n\nSistema Operativo: Windows, macOS o Linux.\nNetBeans IDE 22: JDK 23.\nEspacio en disco: 50 MB.\nRAM: Mínimo 512 MB.\n\n3. Instalación:\n\nDescargue el archivo Save-The-Pets.jar desde el enlace proporcionado.\nAsegúrese de tener instalado Java.\n");
        jTextArea1.setCaretPosition(0);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblTitulo)
                .addContainerGap(281, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextArea jTextArea1;
    public javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
