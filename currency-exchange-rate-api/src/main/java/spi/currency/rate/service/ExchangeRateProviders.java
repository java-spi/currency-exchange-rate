//: com.yulikexuan.java.spi.currency.rate.util.ExchangeRate


package spi.currency.rate.service;


import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.ServiceLoader;


@Slf4j
public final class ExchangeRateProviders {

    static final String PROVIDER_NOT_FOUND_EXCEPTION_ERROR_MSG_TEMPLATE =
            ">>> Exchange Rate provider %s not found";

    private static final String DEFAULT_PROVIDER =
            "com.yulikexuan.java.spi.currency.rate.spi.YahooFinanceExchangeRateProvider";

    //All providers
    public static List<ExchangeRateProvider> providers() {

        List<ExchangeRateProvider> services = Lists.newArrayList();

        ServiceLoader<ExchangeRateProvider> providersLoader =
                ServiceLoader.load(ExchangeRateProvider.class);

        providersLoader.forEach(services::add);

        log.info(">>> {} services", services.size());

        return services;
    }

    //Default provider
    public static ExchangeRateProvider provider() {
        return provider(DEFAULT_PROVIDER);
    }

    //provider by name
    public static ExchangeRateProvider provider(String providerName) {

        ServiceLoader<ExchangeRateProvider> providersLoader =
                ServiceLoader.load(ExchangeRateProvider.class);

        return providersLoader.stream()
                .map(p -> p.get())
                .filter(p -> p.getClass().getName().equals(providerName))
                .findAny()
                .orElseThrow(() -> new ProviderNotFoundException(
                        String.format(PROVIDER_NOT_FOUND_EXCEPTION_ERROR_MSG_TEMPLATE,
                                providerName)));
    }

}///:~