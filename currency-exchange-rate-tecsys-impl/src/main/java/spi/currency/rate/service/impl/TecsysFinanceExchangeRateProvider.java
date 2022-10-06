//: spi.currency.rate.service.impl.TecsysFinanceExchangeRateProvider


package spi.currency.rate.service.impl;


import spi.currency.rate.service.api.ExchangeRateProvider;
import spi.currency.rate.service.api.QuoteService;

public class TecsysFinanceExchangeRateProvider implements ExchangeRateProvider {

    @Override
    public QuoteService create() {
        return TecsysQuoteServiceImpl.of();
    }

}///:~