package com.ust.ManufacturersService.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Retailers {

    public Long rid;
    public String rname;
    public String raddress;
    public String rphone;
    public String mid;

}
