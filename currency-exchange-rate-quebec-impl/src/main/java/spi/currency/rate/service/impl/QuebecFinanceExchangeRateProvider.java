//: spi.currency.rate.service.impl.QuebecFinanceExchangeRateProvider


package spi.currency.rate.service.impl;


import spi.currency.rate.service.api.ExchangeRateProvider;
import spi.currency.rate.service.api.QuoteService;

public class QuebecFinanceExchangeRateProvider implements ExchangeRateProvider {

    @Override
    public QuoteService create() {
        return QuebecQuoteServiceImpl.of();
    }

}///:~