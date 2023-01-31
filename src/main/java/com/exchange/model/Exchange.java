package com.exchange.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

public class Exchange {


  @Column(columnDefinition = "decimal(6,2)" , nullable = false)
  private double monto;

  @Column(length = 3, nullable = false)
  private String origen;

  @Column(length = 3, nullable = false)
  private String destino;

}
