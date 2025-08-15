package io.github.Guimaraes131.ovni;

import io.github.Guimaraes131.enums.Shape;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tb_ovni")
public class Ovni {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String location;

    @Column(name = "date_time")
    private LocalDateTime dateTime;

    private String color;

    private Shape shape;

    private Integer quantity;
}
