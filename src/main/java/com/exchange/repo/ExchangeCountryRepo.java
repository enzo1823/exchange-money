package com.exchange.repo;

import com.exchange.model.Exchange;
import com.exchange.model.ExchangeCountry;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ExchangeCountryRepo extends JpaRepository<ExchangeCountry,Integer> {

 // Optional<ExchangeCountry> findExchangeByIsoCodeOriAndIsoCodeDes(String isoCodeOri);

  @Query("Select c FROM exchange_country c WHERE (c.isoCodeOri = ?1 AND c.isoCodeDes = ?2 )  ")
  Optional<ExchangeCountry> getByIsoCodeOriAndIsoCodeDes(String isoCodeOri, String isoCodeDes);




}
