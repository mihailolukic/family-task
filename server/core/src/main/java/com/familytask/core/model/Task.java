package com.familytask.core.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tasks")
@Getter
@Setter
public class Task {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String description;
    private Date createDate;
    private Date finishedDate;
    private boolean finished;

    @ManyToOne
    private FamilyMember familyMember;

}
