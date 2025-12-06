package com.example.doggo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor  // ← Добавьте эту аннотацию
@AllArgsConstructor // ← И эту для работы @Builder
public class Doggo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String url;
    
    @Column(name = "size_bytes")
    private Long sizeBytes;
}