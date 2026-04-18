package com.cyberCMS.cyberCMS.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Policy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;

    private String status;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // getters & setters
}