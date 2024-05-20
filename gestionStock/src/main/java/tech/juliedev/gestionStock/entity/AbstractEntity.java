package tech.juliedev.gestionStock.entity;

import jakarta.persistence.*;
import lombok.Data;
import net.minidev.json.annotate.JsonIgnore;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.time.Instant;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AbstractEntity implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    @CreatedDate
    @Column(name="creationDate",nullable = false)
    @JsonIgnore
    private Instant creationDate;

    @LastModifiedDate
    @Column(name="lastModifiedDate",nullable = false)
    @JsonIgnore
    private Instant lastModifiedDate;
}
