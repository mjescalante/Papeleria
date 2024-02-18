/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iestr.jmff.t1_p1.generador;

import iestr.jmff.t1_p1.modelo.Tablapapeleria;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 * <p>Clase destinada a alojar los métodos relacionados con la 
 * generación de Informes con JasperReports.</p>
 * 
 * @author Fuentes
 */
public abstract class GeneradorInformes {
    /** 
    * <p>Conecta con el archivo 'jasper' proporcionandole los datos 
    * de la tabla Tablapapeleria de la base de datos, para realizar
    * un informe con dichos datos.</p>
    * 
    * <p><b>IMPORTANTE</b> Debe modificar la ruta/nombre del archivo 'jasper'
    * directamente en el método, junto con el nombre del archivo de
    * salida.</p>
    *
    * @author Fuentes
    * @param lista
    */
    public static void leerinformeBD (List<Tablapapeleria> lista){
        try{
            JasperPrint print;
            HashMap param = new HashMap();
            param.put("fecha", LocalDateTime.now().toString());
            
            JRDataSource datasource = new JRBeanArrayDataSource(lista.toArray());

            String report = "src\\main\\resources\\report\\InformePapeleria.jasper";

            print = JasperFillManager.fillReport(report, param, datasource);
            JasperExportManager.exportReportToPdfFile(print,"Informe.pdf");
            JasperViewer.viewReport(print);
        }catch(JRException ex){
            Logger.getLogger(GeneradorInformes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
