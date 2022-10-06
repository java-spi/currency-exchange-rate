//: spi.currency.rate.service.QuebecFinanceExchangeRateProvider


package spi.currency.rate.service;


public class QuebecFinanceExchangeRateProvider implements ExchangeRateProvider {

    @Override
    public QuoteService create() {
        return QuebecQuoteServiceImpl.of();
    }

}///:~