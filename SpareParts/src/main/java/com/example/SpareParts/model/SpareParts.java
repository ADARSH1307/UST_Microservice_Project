package com.example.SpareParts.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="parts")
public class SpareParts {
    @Id
    private Long pid;
    private String pname;
    private int quantity;
    private double price;
    private Long rid;



}
