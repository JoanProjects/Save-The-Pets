package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Mascotas;
import modelo.MascotasDAO;
import vista.FormMascotas;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 *
 * @author JoanArroyo
 */
public class ControladorMascotas implements ActionListener {
    
    MascotasDAO dao = new MascotasDAO();
    Mascotas c = new Mascotas();
    FormMascotas vista = new FormMascotas();
    DefaultTableModel modelo = new DefaultTableModel();
    
    public ControladorMascotas(FormMascotas v) {
        this.vista = v;
        this.vista.btnGuardar.addActionListener(this);
        this.vista.btnEditar.addActionListener(this);
        this.vista.btnActualizar.addActionListener(this);
        this.vista.btnEliminar.addActionListener(this);
        this.vista.btnCancelar.addActionListener(this);
        this.vista.btnBuscar.addActionListener(this);
        this.vista.txtBuscar.addActionListener(this);

        this.vista.btnGuardar.setEnabled(true);
        this.vista.btnEditar.setEnabled(false);
        this.vista.btnActualizar.setEnabled(false);
        this.vista.btnCancelar.setEnabled(true);
        this.vista.btnEliminar.setEnabled(false);
        this.vista.btnBuscar.setEnabled(true);

        //Borrar datos del formulario y desplegar lista de mascotas.
        limpiarCampos(v);
        listar(vista.tblMascotas);
    }
    
    public void limpiarTabla() {
        for (int i = 0; i < vista.tblMascotas.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }
    
    public final void limpiarCampos(FormMascotas v) {
        vista.txtId.setText("");
        vista.txtNombre.setText("");
        vista.cbSexo.setSelectedItem("");
        vista.txtPesoKG.setText("");
        vista.cbEspecie.setSelectedItem("");
        vista.txtRaza.setText("");
        vista.cbVacunacionEstado.setSelectedItem("");
        vista.cbAdopcionEstado.setSelectedItem("");
        vista.txtIngresadoPor.setText("");
        vista.txtNombre.requestFocus();
    }

    public void listarMascota(JTable tabla) {
        limpiarTabla();
        modelo = (DefaultTableModel) tabla.getModel();
        List<Mascotas> lista = (List<Mascotas>) dao.listarRegistro(vista.txtBuscar.getText());
        Object[] object = new Object[9];
        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getId();
            object[1] = lista.get(i).getNombre();
            object[2] = lista.get(i).getSexo();
            object[3] = lista.get(i).getPesoKG();
            object[4] = lista.get(i).getEspecie();
            object[5] = lista.get(i).getRaza();
            object[6] = lista.get(i).getVacunacionEstado();
            object[7] = lista.get(i).getAdopcionEstado();
            object[8] = lista.get(i).getColaborador();
            modelo.addRow(object);
        }
        vista.tblMascotas.setModel(modelo);
    }
    
    public final void listar(JTable tabla) {
        limpiarTabla();
        modelo = (DefaultTableModel) tabla.getModel();
        List<Mascotas> lista = (List<Mascotas>) dao.listar();
        Object[] object = new Object[9];
        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getId();
            object[1] = lista.get(i).getNombre();
            object[2] = lista.get(i).getSexo();
            object[3] = lista.get(i).getPesoKG();
            object[4] = lista.get(i).getEspecie();
            object[5] = lista.get(i).getRaza();
            object[6] = lista.get(i).getVacunacionEstado();
            object[7] = lista.get(i).getAdopcionEstado();
            object[8] = lista.get(i).getColaborador();
            modelo.addRow(object);
        }
        vista.tblMascotas.setModel(modelo);
    }
    
    public class ConsoleOutputCapture {
        private static ByteArrayOutputStream baos;
        private static PrintStream oldStream;

        public static void startCapture() {
            baos = new ByteArrayOutputStream();
            oldStream = System.out;
            System.setOut(new PrintStream(baos));
        }

        public static String stopCapture() {
            System.setOut(oldStream);
            String output = baos.toString();
            baos.reset(); // Limpiar el búfer para futuras capturas
            return output;
        }
    }
    
    public boolean verificacionErroresDeConsola(String input) {
        boolean esUnError;
      
        switch (input.trim()) {
            case "ERROR no se pudo insertar datos: org.sqlite.SQLiteException: [SQLITE_CONSTRAINT_TRIGGER] A RAISE function within a trigger fired, causing the SQL statement to abort (La raza seleccionada no forma parte de esta especie!)":
                esUnError = true;
            break;
            
            case "ERROR no se pudieron actualizar datos: org.sqlite.SQLiteException: [SQLITE_CONSTRAINT_TRIGGER] A RAISE function within a trigger fired, causing the SQL statement to abort (La raza seleccionada no forma parte de esta especie!)":
                 esUnError = true;
            break;
            
            default:
                esUnError = false;
            break;
        }
        
        return esUnError;
    }   
    
    public void agregar() {

        int r;
        
        String nombre = vista.txtNombre.getText();
        String sexo = vista.cbSexo.getSelectedItem().toString();
        String pesoKG = vista.txtPesoKG.getText();
        String especie = vista.cbEspecie.getSelectedItem().toString();
        String raza = vista.txtRaza.getText();
        String vacunacionEstado = vista.cbVacunacionEstado.getSelectedItem().toString();
        String adopcionEstado = vista.cbAdopcionEstado.getSelectedItem().toString();
        String colaborador = vista.txtIngresadoPor.getText();
        
        c.setNombre(nombre);
        c.setSexo(sexo);
        c.setPesoKG(pesoKG);
        c.setEspecie(especie);
        c.setRaza(raza);
        c.setVacunacionEstado(vacunacionEstado);
        c.setAdopcionEstado(adopcionEstado);
        c.setColaborador(colaborador);

        if (validarCampos(vista) > 0) {
            ConsoleOutputCapture.startCapture();
            r = dao.agregar(c);
            String output = ConsoleOutputCapture.stopCapture();
            boolean outputVerification = verificacionErroresDeConsola(output);
            System.out.println(output);
 
            if (r == 1 && !outputVerification) {
                JOptionPane.showMessageDialog(vista, "La Mascota fue agregada con correctamente!", "Verificado!", JOptionPane.INFORMATION_MESSAGE);
                limpiarTabla();
                listar(vista.tblMascotas);
                limpiarCampos(vista);
            } else {
                JOptionPane.showMessageDialog(vista, "ERROR tratando de agregar Mascota.", "ERROR!", JOptionPane.ERROR_MESSAGE);
                limpiarTabla();
                listar(vista.tblMascotas);
                limpiarCampos(vista);
            }
        }
    }
    
    public void editar() {

        int fila = vista.tblMascotas.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(vista, "Selecciona la fila para editar.", "ERROR!", JOptionPane.ERROR_MESSAGE);
            limpiarTabla();
            listar(vista.tblMascotas);
            limpiarCampos(vista);
        } else {
            int id = Integer.parseInt((String) vista.tblMascotas.getValueAt(fila, 0).toString());
            String nombre = (String) vista.tblMascotas.getValueAt(fila, 1);
            String sexo = (String) vista.tblMascotas.getValueAt(fila, 2);
            String pesoKG = (String) vista.tblMascotas.getValueAt(fila, 3);
            String especie = (String) vista.tblMascotas.getValueAt(fila, 4);
            String raza = (String) vista.tblMascotas.getValueAt(fila, 5);
            String vacunacionEstado = (String) vista.tblMascotas.getValueAt(fila, 6);
            String adopcionEstado = (String) vista.tblMascotas.getValueAt(fila, 7);
            String colaborador = (String) vista.tblMascotas.getValueAt(fila, 8);
            
            vista.txtId.setText("" + id);
            vista.txtNombre.setText(nombre);
            vista.cbSexo.setSelectedItem(sexo);
            vista.txtPesoKG.setText(pesoKG);
            vista.cbEspecie.setSelectedItem(especie);
            vista.txtRaza.setText(raza);
            vista.cbVacunacionEstado.setSelectedItem(vacunacionEstado);
            vista.cbAdopcionEstado.setSelectedItem(adopcionEstado);
            vista.txtIngresadoPor.setText(colaborador);
            vista.txtNombre.requestFocus();
        }
    }
    
    public void actualizar() {
        int r;

        int fila = vista.tblMascotas.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(vista, "Selecciona la fila para actualizar.", "ERROR!", JOptionPane.ERROR_MESSAGE);
            limpiarTabla();
            listar(vista.tblMascotas);
            limpiarCampos(vista);
        } else {
            if (validarCampos(vista) > 0) {
                int id = Integer.parseInt(vista.txtId.getText());
                String nombre = vista.txtNombre.getText();
                String sexo = vista.cbSexo.getSelectedItem().toString();
                String pesoKG = vista.txtPesoKG.getText();
                String especie = vista.cbEspecie.getSelectedItem().toString();
                String raza = vista.txtRaza.getText();
                String vacunacionEstado = vista.cbVacunacionEstado.getSelectedItem().toString();
                String adopcionEstado = vista.cbAdopcionEstado.getSelectedItem().toString();
                String colaborador = vista.txtIngresadoPor.getText();
                
                c.setId(id);
                c.setNombre(nombre);
                c.setSexo(sexo);
                c.setPesoKG(pesoKG);
                c.setEspecie(especie);
                c.setRaza(raza);
                c.setVacunacionEstado(vacunacionEstado);
                c.setAdopcionEstado(adopcionEstado);
                c.setColaborador(colaborador);
                
                
                ConsoleOutputCapture.startCapture();                
                r = dao.actualizar(c);
                String output = ConsoleOutputCapture.stopCapture();
                boolean outputVerification = verificacionErroresDeConsola(output);
                System.out.println(output);
 
                if (r == 1 && !outputVerification) {
                    JOptionPane.showMessageDialog(vista, "La Mascota fue actualizada con correctamente!", "Verificado!", JOptionPane.INFORMATION_MESSAGE);
                    limpiarTabla();
                    listar(vista.tblMascotas);
                    limpiarCampos(vista);
                } else {
                    JOptionPane.showMessageDialog(vista, "ERROR tratando de actualizar Mascota.", "ERROR!", JOptionPane.ERROR_MESSAGE);
                    limpiarTabla();
                    listar(vista.tblMascotas);
                    limpiarCampos(vista);
                }
            }
        }
    }
    
    public void eliminar() {

        int fila = vista.tblMascotas.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(vista, "Selecciona una fila para borrar!", "ERROR!", JOptionPane.ERROR_MESSAGE);
            limpiarTabla();
            listar(vista.tblMascotas);
            limpiarCampos(vista);
        } else if (JOptionPane.showConfirmDialog(vista, "Esta seguro de eliminar esta Mascota?", "Borrar", JOptionPane.YES_NO_OPTION) == 0) {
            int id = Integer.parseInt((String) vista.tblMascotas.getValueAt(fila, 0).toString());

            dao.eliminar(id);
            JOptionPane.showMessageDialog(vista, "La Mascota ha sido eliminado con exito!", "Verificado!", JOptionPane.INFORMATION_MESSAGE);
            limpiarTabla();
            listar(vista.tblMascotas);
            limpiarCampos(vista);
        }
    }
    
    public int validarCampos(FormMascotas v) {

        int validacion = 1;
        
        if (v.txtNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(vista, "El campo Nombre, no puede estar vacio.", "ERROR!", JOptionPane.ERROR_MESSAGE);
            v.txtNombre.requestFocus();
            validacion = 0;
        } else if (v.cbSexo.getSelectedItem().toString().equals("") || v.cbSexo.getSelectedItem().toString().equals("Seleccione...")) {
            JOptionPane.showMessageDialog(vista, "El campo Sexo, no puede estar vacio.", "ERROR!", JOptionPane.ERROR_MESSAGE);
            v.cbSexo.requestFocus();
            validacion = 0;
        } else if (v.txtPesoKG.getText().equals("")) {
            JOptionPane.showMessageDialog(vista, "El campo Peso kg, no puede estar vacio.", "ERROR!", JOptionPane.ERROR_MESSAGE);
            v.txtPesoKG.requestFocus();
            validacion = 0;
        } else if (v.cbEspecie.getSelectedItem().toString().equals("") || v.cbEspecie.getSelectedItem().toString().equals("Seleccione...")) {
            JOptionPane.showMessageDialog(vista, "El campo Especie, no puede estar vacio.", "ERROR!", JOptionPane.ERROR_MESSAGE);
            v.cbEspecie.requestFocus();
            validacion = 0;
        } else if (v.txtRaza.getText().equals("")) {
            JOptionPane.showMessageDialog(vista, "El campo Raza, no puede estar vacio.", "ERROR!", JOptionPane.ERROR_MESSAGE);
            v.txtRaza.requestFocus();
            validacion = 0;
        } else if (v.cbVacunacionEstado.getSelectedItem().toString().equals("") || v.cbVacunacionEstado.getSelectedItem().toString().equals("Seleccione...")) {
            JOptionPane.showMessageDialog(vista, "El campo Estado de Vacunación, no puede estar vacio.", "ERROR!", JOptionPane.ERROR_MESSAGE);
            v.cbVacunacionEstado.requestFocus();
            validacion = 0;
        } else if (v.cbAdopcionEstado.getSelectedItem().toString().equals("") || v.cbAdopcionEstado.getSelectedItem().toString().equals("Seleccione...")) {
            JOptionPane.showMessageDialog(vista, "El campo Estado de Adopción, no puede estar vacio.", "ERROR!", JOptionPane.ERROR_MESSAGE);
            v.cbAdopcionEstado.requestFocus();
            validacion = 0;
        } else if (v.txtIngresadoPor.getText().equals("")) {
            JOptionPane.showMessageDialog(vista, "El campo Ingresado Por, no puede estar vacio.", "ERROR!", JOptionPane.ERROR_MESSAGE);
            v.txtIngresadoPor.requestFocus();
            validacion = 0;
        }
        
        return validacion;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnGuardar) {
            agregar();
            listar(vista.tblMascotas);
        }
        if (e.getSource() == vista.btnEditar) {
            editar();
            this.vista.btnEditar.setEnabled(false);
            this.vista.btnActualizar.setEnabled(true);
        }
        if (e.getSource() == vista.btnActualizar) {
            actualizar();
            this.vista.btnGuardar.setEnabled(true);
            this.vista.btnEditar.setEnabled(false);
            this.vista.btnActualizar.setEnabled(false);
            this.vista.btnCancelar.setEnabled(false);
            this.vista.btnEliminar.setEnabled(false);
            limpiarTabla();
            listar(vista.tblMascotas);
            vista.txtNombre.requestFocus();
        }
        if (e.getSource() == vista.btnEliminar) {
            eliminar();
            this.vista.btnGuardar.setEnabled(true);
            this.vista.btnEditar.setEnabled(false);
            this.vista.btnActualizar.setEnabled(false);
            this.vista.btnCancelar.setEnabled(false);
            this.vista.btnEliminar.setEnabled(false);
            limpiarCampos(vista);
            limpiarTabla();
            listar(vista.tblMascotas);
        }
        if (e.getSource() == vista.btnCancelar) {
            this.vista.btnGuardar.setEnabled(true);
            this.vista.btnEditar.setEnabled(false);
            this.vista.btnActualizar.setEnabled(false);
            this.vista.btnCancelar.setEnabled(false);
            this.vista.btnEliminar.setEnabled(false);
            vista.txtBuscar.setText("");
            limpiarCampos(vista);
            limpiarTabla();
            listar(vista.tblMascotas);
        }
        if (e.getSource() == vista.btnBuscar) {
            if (!this.vista.txtBuscar.getText().equals("")) {
                this.vista.btnGuardar.setEnabled(true);
                this.vista.btnEditar.setEnabled(false);
                this.vista.btnActualizar.setEnabled(false);
                this.vista.btnCancelar.setEnabled(true);
                this.vista.btnEliminar.setEnabled(false);
                limpiarCampos(vista);
                limpiarTabla();
                listarMascota(vista.tblMascotas);
            } else {
                this.vista.btnCancelar.setEnabled(true);
                JOptionPane.showMessageDialog(vista, "Introduzca valores a buscar!");
            }
        }
    }
}
