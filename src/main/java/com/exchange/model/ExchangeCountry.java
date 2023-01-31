package com.exchange.model;

import java.security.PrivateKey;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
// @EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity(name = "exchange_country")

public class ExchangeCountry {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "country_exchange_id")
  private Integer countryExchangeId;

  @Column(name = "iso_code_ori")
  private String isoCodeOri;

  @Column(name = "iso_code_des")
  private String isoCodeDes;

  @Column(name = "tipo_cambio")
  private Double tipoCambio;

}
