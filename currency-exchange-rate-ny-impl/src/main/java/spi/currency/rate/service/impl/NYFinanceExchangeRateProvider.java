//: spi.currency.rate.service.impl.NYFinanceExchangeRateProvider


package spi.currency.rate.service.impl;


import spi.currency.rate.service.api.ExchangeRateProvider;
import spi.currency.rate.service.api.QuoteService;

public class NYFinanceExchangeRateProvider implements ExchangeRateProvider {

    @Override
    public QuoteService create() {
        return NYQuoteServiceImpl.of();
    }

}///:~