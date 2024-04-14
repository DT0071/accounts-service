package com.dtcodes.accounts.dto;

import lombok.Data;

@Data
public class ErrorResponseDto {


    private Long accountNumber;


    private String accountType;


    private String branchAddress;
}
