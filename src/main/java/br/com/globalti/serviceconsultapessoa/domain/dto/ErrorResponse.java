package br.com.globalti.serviceconsultapessoa.domain.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse {
    private Date timestamp;
    private Integer status;
    private String error;
    private String message;
    private String path;
}