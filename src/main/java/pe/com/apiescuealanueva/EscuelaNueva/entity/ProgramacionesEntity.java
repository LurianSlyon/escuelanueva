package pe.com.apiescuealanueva.EscuelaNueva.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity(name = "ProgramacionesEntity")
@Table (name = "fechaprogramacion")
public class ProgramacionesEntity implements Serializable {
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="idprogra")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigop;
    @Column(name="nombreeve")
    private String nombreev;
    @Column(name="fecha")
    private String fecha;
    @Column(name="hora")
    private String hora;
    @Column(name="descripcion")
    private String descripcionp;
    @Column(name="estado")
    private boolean estadop;
    @ManyToOne
    @JoinColumn(name = "idusuario",nullable = false)
    private UsuarioEntity usuario;
}
