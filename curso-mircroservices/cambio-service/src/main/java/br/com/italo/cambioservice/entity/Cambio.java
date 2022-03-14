package br.com.italo.cambioservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cambio implements Serializable {

    private static final long serialVersionUID = 7493132348065246906L;

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_CAMBIO")
    @SequenceGenerator(name = "SQ_CAMBIO", sequenceName = "SQ_CAMBIO", allocationSize = 1)
    private Long id;

    @Column(name = "FROM")
    private String from;

    @Column(name = "TO")
    private String to;

    @Column(name = "CONVERSION_FACTOR")
    private BigDecimal conversionFactor;

    @Column(name = "CONVERTED_VALUE")
    private BigDecimal convertedValue;

    @Column(name = "ENVIROMENT")
    private String enviroment;
}
