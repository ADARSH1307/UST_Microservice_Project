package com.ust.ManufacturersService.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FullResponse {

    public Long mid;
    public String mname;
    public String maddress;
    public String mno;
    public String rmid;
    public List<Retailers> list;
}
