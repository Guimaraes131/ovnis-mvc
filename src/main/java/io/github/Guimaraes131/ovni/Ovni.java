package io.github.Guimaraes131.ovni;

import io.github.Guimaraes131.enums.Shape;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "tb_ovni")
@ToString(exclude = "id")
public class Ovni {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String location;

    @Column(name = "date_time")
    private LocalDateTime dateTime;

    private String color;

    @Enumerated(EnumType.STRING)
    private Shape shape;

    private Integer quantity;
}
