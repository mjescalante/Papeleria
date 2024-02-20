/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iestr.jmff.t1_p1.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Manfredi
 */
@Entity
@Table(name = "tablapapeleria")
@NamedQueries({
    @NamedQuery(name = "Tablapapeleria.findAll", query = "SELECT t FROM Tablapapeleria t"),
    @NamedQuery(name = "Tablapapeleria.findById", query = "SELECT t FROM Tablapapeleria t WHERE t.id = :id"),
    @NamedQuery(name = "Tablapapeleria.findByCodigo", query = "SELECT t FROM Tablapapeleria t WHERE t.codigo = :codigo"),
    @NamedQuery(name = "Tablapapeleria.findByProducto", query = "SELECT t FROM Tablapapeleria t WHERE t.producto = :producto"),
    @NamedQuery(name = "Tablapapeleria.findByFamilia", query = "SELECT t FROM Tablapapeleria t WHERE t.familia = :familia"),
    @NamedQuery(name = "Tablapapeleria.findByPrecio", query = "SELECT t FROM Tablapapeleria t WHERE t.precio = :precio")})
public class Tablapapeleria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "codigo")
    private String codigo;
    @Column(name = "producto")
    private String producto;
    @Column(name = "familia")
    private String familia;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio")
    private Double precio;

    public Tablapapeleria() {
    }

    public Tablapapeleria(Integer id) {
        this.id = id;
    }

    /**
     * Metodo get del id
     * @return Integer
     */
    public Integer getId() {
        return id;
    }

    /**
     * Metodo set para el ID
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Metodo get del Codigo
     * @return String
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Metodo set del Codigo
     * @param codigo 
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Metodo get del Producto
     * @return String
     */
    public String getProducto() {
        return producto;
    }

    /**
     * Metodo set del Producto
     * @param producto 
     */
    public void setProducto(String producto) {
        this.producto = producto;
    }

    /**
     * Metodo get de Familia
     * @return String
     */
    public String getFamilia() {
        return familia;
    }

    /**
     * Metodo set de Familia
     * @param familia 
     */
    public void setFamilia(String familia) {
        this.familia = familia;
    }

    /**
     * Metodo get del Precio
     * @return Double
     */
    public Double getPrecio() {
        return precio;
    }

    /**
     * Metodo set del Precio
     * @param precio 
     */
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    /**
     * Este metodo hashCode nos devuelve el valor numerico
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    /**
     * Determinamos si el objeto es igual
     * @param object
     * @return 
     */
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tablapapeleria)) {
            return false;
        }
        Tablapapeleria other = (Tablapapeleria) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    /**
     * En este metodo toString especificamos la forma de imprimir por pantalla los datos oportunos
     * @return 
     */
    @Override
    public String toString() {
        return "iestr.jmff.t1_p1.modelo.Tablapapeleria[ id=" + id + " ]";
    }
    
}
