/*
 *  
 * The MIT License (MIT)
 * Copyright (c) 2018 kukulkan
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package mx.gob.sfp.domain;

import java.time.LocalDate;
import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Objects;
import java.io.Serializable;

/**
 * The Persona
 * 
 * @author kukulkan
 *
 */
@Entity
@Table(name = "usuarios")
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    
    /**
     * Este campo fue generado automaticamente por kukulkan 
     * Este campo corresponde a la llave primaria id
     *
     * @kukulkanGenerated 20180903183955
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;
	
	
    /**
     * Este campo fue generado automaticamente por kukulkan 
     * Este campo corresponde a la tabla usuarios
     *
     * @kukulkanGenerated 20180903183955
     */
    @NotNull
    @Size(min = 3, max = 50)
    @Column(name = "nombre", length=50, nullable = false)
    private String nombre;
    

	
    /**
     * Este campo fue generado automaticamente por kukulkan 
     * Este campo corresponde a la tabla usuarios
     *
     * @kukulkanGenerated 20180903183955
     */
    @NotNull
    @Min(value = 5)
    @Max(value = 120)
    @Column(name = "edad", nullable = false)
    private Integer edad;
    

	
    /**
     * Este campo fue generado automaticamente por kukulkan 
     * Este campo corresponde a la tabla usuarios
     *
     * @kukulkanGenerated 20180903183955
     */
    @Column(name = "sueldo")
    private Long sueldo;
    

	
    /**
     * Este campo fue generado automaticamente por kukulkan 
     * Este campo corresponde a la tabla usuarios
     *
     * @kukulkanGenerated 20180903183955
     */
    @Column(name = "impuesto")
    private Float impuesto;
    

	
    /**
     * Este campo fue generado automaticamente por kukulkan 
     * Este campo corresponde a la tabla usuarios
     *
     * @kukulkanGenerated 20180903183955
     */
    @Column(name = "activo")
    private boolean activo;
    

	
    /**
     * Este campo fue generado automaticamente por kukulkan 
     * Este campo corresponde a la tabla usuarios
     *
     * @kukulkanGenerated 20180903183955
     */
    @Column(name = "fecha_creacion")
    private LocalDate fechaCreacion;
    

	
    /**
     * Este campo fue generado automaticamente por kukulkan 
     * Este campo corresponde a la tabla usuarios
     *
     * @kukulkanGenerated 20180903183955
     */
    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "foto")
    private byte[] foto;
    

	
    /**
     * Este campo fue generado automaticamente por kukulkan 
     * Este campo corresponde a la tabla usuarios
     *
     * @kukulkanGenerated 20180903183955
     */
    @Column(name = "foto_content_type")
    private String fotoContentType;
    

    /**
     * Este método fue generado automaticamente por kukulkan 
     * Este método GETTER fue generado para la llave primaria usuarios.id
     *
     * @return el valor de id
     *
     * @kukulkanGenerated 20180903183955
     */
    public Long getId() {
        return id;
    }

    /**
     * Este método fue generado automaticamente por kukulkan 
     * Este método SETTER fue generado para la llave primaria. usuarios.id
     *
     * @return el valor de id
     *
     * @kukulkanGenerated 20180903183955
     */
    public void setId(Long id) {
        this.id = id;
    }

	
    
    /**
     * Este método fue generado automaticamente por kukulkan 
     * Este método GETTER fue generado para la propiedad usuarios.nombre
     *
     * @return el valor de nombre
     *
     * @kukulkanGenerated 20180903183955
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Este método fue generado automaticamente por kukulkan 
     * Este método SETTER fue generado para la propiedad. usuarios.nombre
     *
     * @return el valor de Nombre
     *
     * @kukulkanGenerated 20180903183955
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    
    /**
     * Este método fue generado automaticamente por kukulkan 
     * Este método GETTER fue generado para la propiedad usuarios.edad
     *
     * @return el valor de edad
     *
     * @kukulkanGenerated 20180903183955
     */
    public Integer getEdad() {
        return edad;
    }

    /**
     * Este método fue generado automaticamente por kukulkan 
     * Este método SETTER fue generado para la propiedad. usuarios.edad
     *
     * @return el valor de Edad
     *
     * @kukulkanGenerated 20180903183955
     */
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    

    
    /**
     * Este método fue generado automaticamente por kukulkan 
     * Este método GETTER fue generado para la propiedad usuarios.sueldo
     *
     * @return el valor de sueldo
     *
     * @kukulkanGenerated 20180903183955
     */
    public Long getSueldo() {
        return sueldo;
    }

    /**
     * Este método fue generado automaticamente por kukulkan 
     * Este método SETTER fue generado para la propiedad. usuarios.sueldo
     *
     * @return el valor de Sueldo
     *
     * @kukulkanGenerated 20180903183955
     */
    public void setSueldo(Long sueldo) {
        this.sueldo = sueldo;
    }
    

    
    /**
     * Este método fue generado automaticamente por kukulkan 
     * Este método GETTER fue generado para la propiedad usuarios.impuesto
     *
     * @return el valor de impuesto
     *
     * @kukulkanGenerated 20180903183955
     */
    public Float getImpuesto() {
        return impuesto;
    }

    /**
     * Este método fue generado automaticamente por kukulkan 
     * Este método SETTER fue generado para la propiedad. usuarios.impuesto
     *
     * @return el valor de Impuesto
     *
     * @kukulkanGenerated 20180903183955
     */
    public void setImpuesto(Float impuesto) {
        this.impuesto = impuesto;
    }
    

    
    /**
     * Este método fue generado automaticamente por kukulkan 
     * Este método GETTER fue generado para la propiedad usuarios.activo
     *
     * @return el valor de activo
     *
     * @kukulkanGenerated 20180903183955
     */
    public boolean getActivo() {
        return activo;
    }

    /**
     * Este método fue generado automaticamente por kukulkan 
     * Este método SETTER fue generado para la propiedad. usuarios.activo
     *
     * @return el valor de Activo
     *
     * @kukulkanGenerated 20180903183955
     */
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    

    
    /**
     * Este método fue generado automaticamente por kukulkan 
     * Este método GETTER fue generado para la propiedad usuarios.fecha_creacion
     *
     * @return el valor de fechaCreacion
     *
     * @kukulkanGenerated 20180903183955
     */
    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * Este método fue generado automaticamente por kukulkan 
     * Este método SETTER fue generado para la propiedad. usuarios.fechaCreacion
     *
     * @return el valor de FechaCreacion
     *
     * @kukulkanGenerated 20180903183955
     */
    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    

    
    /**
     * Este método fue generado automaticamente por kukulkan 
     * Este método GETTER fue generado para la propiedad usuarios.foto
     *
     * @return el valor de foto
     *
     * @kukulkanGenerated 20180903183955
     */
    public byte[] getFoto() {
        return foto;
    }

    /**
     * Este método fue generado automaticamente por kukulkan 
     * Este método SETTER fue generado para la propiedad. usuarios.foto
     *
     * @return el valor de Foto
     *
     * @kukulkanGenerated 20180903183955
     */
    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
    

    
    /**
     * Este método fue generado automaticamente por kukulkan 
     * Este método GETTER fue generado para la propiedad usuarios.foto_content_type
     *
     * @return el valor de fotoContentType
     *
     * @kukulkanGenerated 20180903183955
     */
    public String getFotoContentType() {
        return fotoContentType;
    }

    /**
     * Este método fue generado automaticamente por kukulkan 
     * Este método SETTER fue generado para la propiedad. usuarios.fotoContentType
     *
     * @return el valor de FotoContentType
     *
     * @kukulkanGenerated 20180903183955
     */
    public void setFotoContentType(String fotoContentType) {
        this.fotoContentType = fotoContentType;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Persona persona = (Persona) o;
        if (persona.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), persona.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
                sb.append(", nombre=").append(nombre);
        sb.append(", edad=").append(edad);
        sb.append(", sueldo=").append(sueldo);
        sb.append(", impuesto=").append(impuesto);
        sb.append(", activo=").append(activo);
        sb.append(", fechaCreacion=").append(fechaCreacion);
        sb.append(", foto=").append(foto);
        sb.append(", fotoContentType=").append(fotoContentType);
        sb.append("]");
        return sb.toString();
    }
}
