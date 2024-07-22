package com.ust.RetailersService.client;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpareParts {
    public Long pid;
    public String pname;
    public int quantity;
    public double price;
    public Long rid;
}
