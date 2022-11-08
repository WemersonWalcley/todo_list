package com.wemersonwalcley.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String description;

    @Column
    private boolean done;

    @Column
    private LocalDateTime createdDate;

    @Column
    private LocalDateTime doneDate;

    @PrePersist
    public void beforeSave(){
        setCreatedDate(LocalDateTime.now());
    }

}
