package com.exchange.util;


import com.exchange.model.Exchange;
import org.springframework.stereotype.Component;

@Component
public class TipoDeCambio {

  public double montoTipoDeCambio(Double monto, Double tipoCambio){

    Double montoTc = null;
    System.out.println("monto: "+monto + "  / tipoCambio: "+tipoCambio);

    try {

      montoTc = monto * tipoCambio;

    }catch (Exception e){
      System.out.println("Exception: "+e);
    }
    return montoTc;
  }

}
