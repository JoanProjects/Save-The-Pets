![image](https://github.com/user-attachments/assets/0c90f12c-e86f-4eac-8dd7-028a9640985c)

## Descripción
Los albergues de mascotas, especialmente los de reciente creación, suelen enfrentar una serie de desafíos en la gestión de sus operaciones. 
Save The Pets fue desarrollado con el fin de solventar esta problematica.

## Arquitectura
Este proyecto implementa una arquitectura Modelo-Vista-Controlador (MVC) para separar las responsabilidades de la aplicación y facilitar su mantenimiento.

* **Modelo:** (Java)  Gestiona los datos y la lógica de negocio.  Incluye las clases que representan los datos (mascotas, usuarios, etc.) y las operaciones que se pueden realizar sobre ellos.
  
* **Vista:** (Java Swing con FlatLaf)  Proporciona la interfaz de usuario.  Utiliza Java Swing para crear los componentes de la interfaz y FlatLaf para proporcionar un estilo visual mejorado y moderno.
  
* **Controlador:** (Java)  Maneja las interacciones del usuario con la aplicación.  Recibe las acciones del usuario desde la vista, las procesa y actualiza el modelo.  Luego, notifica a la vista para que se actualice con los nuevos datos.
  
* **Base de datos:** (SQLite)  Almacena de forma persistente los datos del modelo.  Se utiliza SQLite por su sencillez y por ser un DBMS ligero, adecuado para esta aplicación.

## Tecnologías
* **Java:** Versión JDK 23
* **Java Swing:** Framework para la creación de interfaces gráficas de usuario.
* **FlatLaf:** Librería para personalizar el aspecto de las aplicaciones Java Swing.
* **SQLite:** Sistema de gestión de bases de datos ligero y embebido.

### Instalación
1. **Requisitos:**
   * Java JDK 23 o superior instalado.
   * Descargue el repositorio `Save-The-Pets`
2. **Ejecución:**
   * **Desde línea de comandos:**
     ```bash
     java -jar Save-The-Pets.jar
     ```
   * **Haciendo doble clic:**
     Si su sistema operativo está configurado para ejecutar archivos JAR, puede hacer doble clic en el archivo descargado.

## Librerias:
- flatLaf
- flatlaf-intellij-themes
- SQLite  

## Contacto
Para cualquier duda o sugerencia, por favor contacta con nosotros:
* **Correo electrónico:** speedsofttechnology@gmail.com
* **Teléfono:** 8098578140
 

## SpeedSoft 

<table style="width:100%; border-collapse: collapse;">
  <tr style="border: 1px solid black;">
    <th style="border: 1px solid black; padding: 8px;">Name</th>
    <th style="border: 1px solid black; padding: 8px;">Role</th>
  </tr>
  <tr style="border: 1px solid black;">
    <td style="border: 1px solid black; padding: 8px;">Joan Arroyo</td>
    <td style="border: 1px solid black; padding: 8px;">Team Lead, Backend Dev, DBM</td>
  </tr>
  <tr style="border: 1px solid black;">
    <td style="border: 1px solid black; padding: 8px;">Wallan Peguero</td>
    <td style="border: 1px solid black; padding: 8px;">Lead Frontend Developer, Software Designer</td>
  </tr>
  <tr style="border: 1px solid black;">
    <td style="border: 1px solid black; padding: 8px;">Wilfredo Valentin Feliz Caba</td>
    <td style="border: 1px solid black; padding: 8px;">Backend Developer, QA</td>
  </tr>
  <tr style="border: 1px solid black;">
    <td style="border: 1px solid black; padding: 8px;">Staisy Fortuna Tolentino</td>
    <td style="border: 1px solid black; padding: 8px;">Frontend Developer, Documentarian</td>
  </tr>
</table>

Fecha de Creación: 12/11/2024 
