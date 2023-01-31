package com.exchange.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ExchangeResponse {

  @Column(columnDefinition = "decimal(6,2)" , nullable = false)
  private Double monto;

  @Column(columnDefinition = "decimal(6,2)" , nullable = false)
  private Double montoTc;

  @Column(length = 50, nullable = false)
  private String monedaOrigen;

  @Column(length = 50, nullable = false)
  private String monedaDestino;

  @Column(columnDefinition = "decimal(6,5)" , nullable = false)
  private Double TipoCambio;
}
