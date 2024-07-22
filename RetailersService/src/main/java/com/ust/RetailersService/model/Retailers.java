package com.ust.RetailersService.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "retailers")
public class Retailers {


    @Id
    public Long rid;
    public String rname;
    public String raddress;
    public String rphone;
    public String mid;

}
