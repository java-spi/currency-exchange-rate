module currency.exchange.rate.app {

    requires currency.exchange.rate.api;
    requires spring.boot;
    requires spring.boot.autoconfigure;

    uses spi.currency.rate.service.api.ExchangeRateProvider;
}