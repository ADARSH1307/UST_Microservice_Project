package com.ust.RawMaterialsService.client;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Manufacturers {

    public Long mid;
    public String mname;
    public String maddress;
    public String mno;
    public Long rmid;
}
