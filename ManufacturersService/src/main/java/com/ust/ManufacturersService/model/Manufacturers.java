package com.ust.ManufacturersService.model;


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
@Table(name = "manufacturers")
public class Manufacturers {

    @Id
    public Long mid;
    public String mname;
    public String maddress;
    public String mno;

}
