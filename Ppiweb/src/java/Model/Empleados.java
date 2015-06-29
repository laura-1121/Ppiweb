/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

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

/**
 *
 * @author Laura
 */
@Entity
@Table(name = "EMPLEADOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empleados.findAll", query = "SELECT e FROM Empleados e"),
    @NamedQuery(name = "Empleados.findByIdEmpleado", query = "SELECT e FROM Empleados e WHERE e.idEmpleado = :idEmpleado"),
    @NamedQuery(name = "Empleados.findByTipodocEmpleado", query = "SELECT e FROM Empleados e WHERE e.tipodocEmpleado = :tipodocEmpleado"),
    @NamedQuery(name = "Empleados.findByNombreEmpleado", query = "SELECT e FROM Empleados e WHERE e.nombreEmpleado = :nombreEmpleado"),
    @NamedQuery(name = "Empleados.findByApellidosEmpleado", query = "SELECT e FROM Empleados e WHERE e.apellidosEmpleado = :apellidosEmpleado"),
    @NamedQuery(name = "Empleados.findByFechaNacEmpleado", query = "SELECT e FROM Empleados e WHERE e.fechaNacEmpleado = :fechaNacEmpleado"),
    @NamedQuery(name = "Empleados.findByCorreoEmpleado", query = "SELECT e FROM Empleados e WHERE e.correoEmpleado = :correoEmpleado"),
    @NamedQuery(name = "Empleados.findByTelefonoEmpleado", query = "SELECT e FROM Empleados e WHERE e.telefonoEmpleado = :telefonoEmpleado"),
    @NamedQuery(name = "Empleados.findByDireccionEmpleado", query = "SELECT e FROM Empleados e WHERE e.direccionEmpleado = :direccionEmpleado"),
    @NamedQuery(name = "Empleados.findByCelularEmpleado", query = "SELECT e FROM Empleados e WHERE e.celularEmpleado = :celularEmpleado"),
    @NamedQuery(name = "Empleados.findByGeneroEmpleado", query = "SELECT e FROM Empleados e WHERE e.generoEmpleado = :generoEmpleado"),
    @NamedQuery(name = "Empleados.findByDepartamentoEmpleado", query = "SELECT e FROM Empleados e WHERE e.departamentoEmpleado = :departamentoEmpleado"),
    @NamedQuery(name = "Empleados.findByCargoEmpleado", query = "SELECT e FROM Empleados e WHERE e.cargoEmpleado = :cargoEmpleado"),
    @NamedQuery(name = "Empleados.findByRefLaboralesEmpleado", query = "SELECT e FROM Empleados e WHERE e.refLaboralesEmpleado = :refLaboralesEmpleado"),
    @NamedQuery(name = "Empleados.findByRefPersonalesEmpleado", query = "SELECT e FROM Empleados e WHERE e.refPersonalesEmpleado = :refPersonalesEmpleado")})
public class Empleados implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_EMPLEADO")
    private String idEmpleado;
    @Column(name = "TIPODOC_EMPLEADO")
    private String tipodocEmpleado;
    @Column(name = "NOMBRE_EMPLEADO")
    private String nombreEmpleado;
    @Column(name = "APELLIDOS_EMPLEADO")
    private String apellidosEmpleado;
    @Column(name = "FECHA_NAC_EMPLEADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacEmpleado;
    @Column(name = "CORREO_EMPLEADO")
    private String correoEmpleado;
    @Column(name = "TELEFONO_EMPLEADO")
    private String telefonoEmpleado;
    @Column(name = "DIRECCION_EMPLEADO")
    private String direccionEmpleado;
    @Column(name = "CELULAR_EMPLEADO")
    private String celularEmpleado;
    @Column(name = "GENERO_EMPLEADO")
    private String generoEmpleado;
    @Column(name = "DEPARTAMENTO_EMPLEADO")
    private String departamentoEmpleado;
    @Column(name = "CARGO_EMPLEADO")
    private String cargoEmpleado;
    @Column(name = "REF_LABORALES_EMPLEADO")
    private String refLaboralesEmpleado;
    @Column(name = "REF_PERSONALES_EMPLEADO")
    private String refPersonalesEmpleado;

    public Empleados() {
    }

    public Empleados(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getTipodocEmpleado() {
        return tipodocEmpleado;
    }

    public void setTipodocEmpleado(String tipodocEmpleado) {
        this.tipodocEmpleado = tipodocEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getApellidosEmpleado() {
        return apellidosEmpleado;
    }

    public void setApellidosEmpleado(String apellidosEmpleado) {
        this.apellidosEmpleado = apellidosEmpleado;
    }

    public Date getFechaNacEmpleado() {
        return fechaNacEmpleado;
    }

    public void setFechaNacEmpleado(Date fechaNacEmpleado) {
        this.fechaNacEmpleado = fechaNacEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public String getTelefonoEmpleado() {
        return telefonoEmpleado;
    }

    public void setTelefonoEmpleado(String telefonoEmpleado) {
        this.telefonoEmpleado = telefonoEmpleado;
    }

    public String getDireccionEmpleado() {
        return direccionEmpleado;
    }

    public void setDireccionEmpleado(String direccionEmpleado) {
        this.direccionEmpleado = direccionEmpleado;
    }

    public String getCelularEmpleado() {
        return celularEmpleado;
    }

    public void setCelularEmpleado(String celularEmpleado) {
        this.celularEmpleado = celularEmpleado;
    }

    public String getGeneroEmpleado() {
        return generoEmpleado;
    }

    public void setGeneroEmpleado(String generoEmpleado) {
        this.generoEmpleado = generoEmpleado;
    }

    public String getDepartamentoEmpleado() {
        return departamentoEmpleado;
    }

    public void setDepartamentoEmpleado(String departamentoEmpleado) {
        this.departamentoEmpleado = departamentoEmpleado;
    }

    public String getCargoEmpleado() {
        return cargoEmpleado;
    }

    public void setCargoEmpleado(String cargoEmpleado) {
        this.cargoEmpleado = cargoEmpleado;
    }

    public String getRefLaboralesEmpleado() {
        return refLaboralesEmpleado;
    }

    public void setRefLaboralesEmpleado(String refLaboralesEmpleado) {
        this.refLaboralesEmpleado = refLaboralesEmpleado;
    }

    public String getRefPersonalesEmpleado() {
        return refPersonalesEmpleado;
    }

    public void setRefPersonalesEmpleado(String refPersonalesEmpleado) {
        this.refPersonalesEmpleado = refPersonalesEmpleado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpleado != null ? idEmpleado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleados)) {
            return false;
        }
        Empleados other = (Empleados) object;
        if ((this.idEmpleado == null && other.idEmpleado != null) || (this.idEmpleado != null && !this.idEmpleado.equals(other.idEmpleado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Empleados[ idEmpleado=" + idEmpleado + " ]";
    }
    
}
