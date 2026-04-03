package com.example.lab4_unit3.entity;

//Model the relationships of a Task Management software using Spring JPA.
// Assume that you have the following requirements for data storage:

//Model the relationships of a PR company using Spring JPA.
// Assume that you have the following requirements for data storage:
//List 3 tasks that can be accomplished with native SQL that you cannot do with JPQL.
  // Limit,order by,?

// Explain why you would choose to use native SQL over JPQL for these specific tasks.

import jakarta.persistence.Column;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class Task {
    //Tasks have a title, dueDate and a boolean status.
    @Column (nullable = false,length = 60)
    private String title;

    private LocalDate dueDate;

    private boolean status;

}
