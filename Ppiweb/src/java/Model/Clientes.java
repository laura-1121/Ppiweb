
package Model;


/*Librerias importadas por defecto 
 * para el buen funcionamiento de los metodos
 *
 */
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;


 /*  Estas son las consultas que se generan
 *  ´por defecto
 */

@Entity
@Table(name = "CLIENTES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clientes.findAll", query = "SELECT c FROM Clientes c"),
    @NamedQuery(name = "Clientes.findByIdCliente", query = "SELECT c FROM Clientes c WHERE c.idCliente = :idCliente"),
    @NamedQuery(name = "Clientes.findByTipodocCliente", query = "SELECT c FROM Clientes c WHERE c.tipodocCliente = :tipodocCliente"),
    @NamedQuery(name = "Clientes.findByNombreCliente", query = "SELECT c FROM Clientes c WHERE c.nombreCliente = :nombreCliente"),
    @NamedQuery(name = "Clientes.findByApellidosCliente", query = "SELECT c FROM Clientes c WHERE c.apellidosCliente = :apellidosCliente"),
    @NamedQuery(name = "Clientes.findByTelefonoCliente", query = "SELECT c FROM Clientes c WHERE c.telefonoCliente = :telefonoCliente"),
    @NamedQuery(name = "Clientes.findByDireccCliente", query = "SELECT c FROM Clientes c WHERE c.direccCliente = :direccCliente"),
    @NamedQuery(name = "Clientes.findByGeneroCliente", query = "SELECT c FROM Clientes c WHERE c.generoCliente = :generoCliente"),
    @NamedQuery(name = "Clientes.findByFechNacCliente", query = "SELECT c FROM Clientes c WHERE c.fechNacCliente = :fechNacCliente"),
    @NamedQuery(name = "Clientes.findByCelCliente", query = "SELECT c FROM Clientes c WHERE c.celCliente = :celCliente")})


/* Aqui tenemos las columnas de la tabla Clientes
 *  Con su respectivo tipo de dato 
 *
 */
public class Clientes implements Serializable {
    private static final long serialVersionUID = 1L;   
    @Id
    @Basic(optional = false)
    @Column(name = "ID_CLIENTE")                        
    private String idCliente;                               
    @Column(name = "TIPODOC_CLIENTE")                   
    private String tipodocCliente;
    @Column(name = "NOMBRE_CLIENTE")
    private String nombreCliente;
    @Column(name = "APELLIDOS_CLIENTE")
    private String apellidosCliente;
    @Column(name = "TELEFONO_CLIENTE")
    private String telefonoCliente;
    @Column(name = "DIRECC_CLIENTE")
    private String direccCliente;
    @Column(name = "GENERO_CLIENTE")
    private String generoCliente;
    @Column(name = "FECH_NAC_CLIENTE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechNacCliente;
    @Column(name = "CEL_CLIENTE")
    private String celCliente;
    
    
    /* Este metodo contiene los get y los set ( los get son para guardar
     * la información y los set son para llevar la información) 
     *
     */

    public Clientes() {       
        
    }

    public Clientes(String idCliente) {     
        this.idCliente = idCliente;
    }

    public String getIdCliente() {          
        return idCliente;
    }

    public void setIdCliente(String idCliente) {      
        this.idCliente = idCliente;
    }

    public String getTipodocCliente() {     
        return tipodocCliente;
    }

    public void setTipodocCliente(String tipodocCliente) {   
        this.tipodocCliente = tipodocCliente;
    }

    public String getNombreCliente() {             
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {     
        this.nombreCliente = nombreCliente;
    }

    public String getApellidosCliente() {
        return apellidosCliente;
    }

    public void setApellidosCliente(String apellidosCliente) {
        this.apellidosCliente = apellidosCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getDireccCliente() {
        return direccCliente;
    }

    public void setDireccCliente(String direccCliente) {
        this.direccCliente = direccCliente;
    }

    public String getGeneroCliente() {
        return generoCliente;
    }

    public void setGeneroCliente(String generoCliente) {
        this.generoCliente = generoCliente;
    }

    public Date getFechNacCliente() {
        return fechNacCliente;
    }

    public void setFechNacCliente(Date fechNacCliente) {
        this.fechNacCliente = fechNacCliente;
    }

    public String getCelCliente() {
        return celCliente;
    }

    public void setCelCliente(String celCliente) {
        this.celCliente = celCliente;
    }

    
    /* Se agrupan objetos en base al calculo
    *  de los HashCode
    */
    
    @Override
    public int hashCode() {          
        int hash = 0;
        hash += (idCliente != null ? idCliente.hashCode() : 0);
        return hash;
    }

    
    /* Valida que el id del cliente
    *  no sea existente en la base de datos 
    */
    
    @Override
    public boolean equals(Object object) {        
        
        if (!(object instanceof Clientes)) {   
            return false;
        }
        Clientes other = (Clientes) object;
        if ((this.idCliente == null && other.idCliente != null) || (this.idCliente != null && !this.idCliente.equals(other.idCliente))) {
            return false;
        }
        return true;
    }

    /* Devuelve el Id del cliente
    *
    */
    @Override                                    
    public String toString() {
        return "Model.Clientes[ idCliente=" + idCliente + " ]";
    }

    public void addClientes(Clientes clientes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
