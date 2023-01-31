package com.exchange.service;

import com.exchange.model.ExchangeCountry;
import com.exchange.repo.ExchangeCountryRepo;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ExchangeCountryService  {

  @Autowired
  ExchangeCountryRepo exchangeCountryRepo;

  public Optional<ExchangeCountry> obtenerPorIdOrigen(String isoCodeOri, String isoCodeDes) {

    return exchangeCountryRepo.getByIsoCodeOriAndIsoCodeDes(isoCodeOri,isoCodeDes);
  }

  public ExchangeCountry update(ExchangeCountry exchangeCountry) throws Exception {
    return exchangeCountryRepo.save(exchangeCountry);
  }

  public ExchangeCountry save(ExchangeCountry exchangeCountry) {
    return exchangeCountryRepo.save(exchangeCountry);
  }
}