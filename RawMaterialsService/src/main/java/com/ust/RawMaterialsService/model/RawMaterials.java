package com.ust.RawMaterialsService.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "raw_materials")
public class RawMaterials {
    @Id
    public Long rmid;
    public String rmname;
    public String rmaddress;
    public String rmphone;

}
