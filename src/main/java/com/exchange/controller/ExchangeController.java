package com.exchange.controller;


import com.exchange.model.Exchange;
import com.exchange.model.ExchangeCountry;
import com.exchange.model.ExchangeResponse;
import com.exchange.repo.ExchangeCountryRepo;
import com.exchange.service.ExchangeCountryService;
import com.exchange.util.TipoDeCambio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exchanges")
public class ExchangeController {

  @Autowired
  ExchangeCountryService exchangeCountryService;
  Optional<ExchangeCountry> exchangeCountry;
  ExchangeResponse exchangeResponse;
  ExchangeCountryRepo exchangeCountryRepo;
  TipoDeCambio tipoDeCambio;

  public ExchangeController(TipoDeCambio tipoDeCambio) {
    this.tipoDeCambio = tipoDeCambio;
  }


 @PostMapping()
 public ResponseEntity<ExchangeResponse> getExchangeCountry(@RequestBody Exchange exchange){
  exchangeCountry = Optional.of(new ExchangeCountry());
  exchangeResponse = new ExchangeResponse();

  exchangeCountry  = exchangeCountryService.obtenerPorIdOrigen(exchange.getOrigen(),exchange.getDestino());

   if (exchangeCountry.isPresent()) {

    Double montotc;

     montotc = tipoDeCambio.montoTipoDeCambio(exchange.getMonto(),exchangeCountry.get().getTipoCambio());


         exchangeResponse.setMonto(exchange.getMonto());
         exchangeResponse.setMonedaOrigen(exchangeCountry.get().getIsoCodeOri());
         exchangeResponse.setMonedaDestino(exchangeCountry.get().getIsoCodeDes());
         exchangeResponse.setMontoTc(montotc);
         exchangeResponse.setTipoCambio(exchangeCountry.get().getTipoCambio());

   }

   return ResponseEntity.ok(exchangeResponse);
 }


  @PutMapping
  public ExchangeCountry update(@RequestBody ExchangeCountry exchangeCountry) throws Exception{
    return exchangeCountryService.save(exchangeCountry);
  }

}
