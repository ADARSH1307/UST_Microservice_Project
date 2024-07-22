package com.ust.RetailersService.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class FullResponse {

    public Long rid;
    public String rname;
    public String raddress;
    public String rphone;
    public String mid;
    public List<SpareParts> parts;
}
