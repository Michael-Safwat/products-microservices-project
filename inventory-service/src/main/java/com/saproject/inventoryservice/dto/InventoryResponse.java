package com.saproject.inventoryservice.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InventoryResponse
{
    private String skuCode;
    private boolean isInStock;

}
