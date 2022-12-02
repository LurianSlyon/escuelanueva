/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.apiescuealanueva.EscuelaNueva.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity(name = "UsuarioEntity")
@Table (name = "usuario")
public class UsuarioEntity implements Serializable {
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="idusuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigou;
    @Column(name="nombre")
    private String nombreu;
    @Column(name="apellido")
    private String apellidou;
    @Column(name="email")
    private String emailu;
    @Column(name="usuario")
    private String usuariou;
    @Column(name="contraseña")
    private String contraseñau;
    @Column(name="estado")
    private boolean estadou;
}
    