package ro.ugal.student.onionpisi.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "category")
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;

    @ManyToOne
    private Category category;

}
