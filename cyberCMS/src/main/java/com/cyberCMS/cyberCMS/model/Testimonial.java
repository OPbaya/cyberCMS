package com.cyberCMS.cyberCMS.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Testimonial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String message;

    private String status;

    private LocalDateTime createdAt;

    // getters & setters
}