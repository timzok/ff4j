package com.ff4j.poc.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(exclude = {"name", "key"})
@Entity
@Table(name = "ROLE")
public class Role implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "role_gen")
    @SequenceGenerator(name = "role_gen", sequenceName = "role_seq")
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "KEY")
    private String key;


}
