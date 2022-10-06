//: spi.currency.rate.service.TecsysFinanceExchangeRateProvider


package spi.currency.rate.service;


public class TecsysFinanceExchangeRateProvider implements ExchangeRateProvider {

    @Override
    public QuoteService create() {
        return TecsysQuoteServiceImpl.of();
    }

}///:~