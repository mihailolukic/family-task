package com.familytask.core.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "family_members")
@Getter
@Setter
public class FamilyMember {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String surname;

    @Enumerated(EnumType.STRING)
    private FamilyRole role;

    @ManyToOne
    private Family family;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Task> taskList;

}
