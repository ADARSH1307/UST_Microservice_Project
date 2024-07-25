package com.ust.RawMaterialsService.client;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FullResponse {
    public Long rmid;
    public String rmname;
    public String rmaddress;
    public String rmphone;
    public List<Manufacturers> list;
}
