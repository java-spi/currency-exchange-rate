open module currency.exchange.rate.ny.impl {

    requires currency.exchange.rate.api;

    provides spi.currency.rate.service.api.ExchangeRateProvider
            with spi.currency.rate.service.impl.NYFinanceExchangeRateProvider;
}