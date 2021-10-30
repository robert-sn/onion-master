package ro.ugal.student.onionpisi.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity(name = "product_final_price")
public class ProductFinalPrice implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private ProductFinal productFinal;

    private Float priceNoVat;

    @ManyToOne
    private Vat vat;
    private Float priceFinal;
    private Date creationDate;
    private Boolean active;

}
