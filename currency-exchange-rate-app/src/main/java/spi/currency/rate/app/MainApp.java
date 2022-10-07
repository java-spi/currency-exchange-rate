//: spi.currency.rate.app.MainApp


package spi.currency.rate.app;


import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import spi.currency.rate.domain.model.Quote;
import spi.currency.rate.service.api.ExchangeRateProvider;
import spi.currency.rate.service.api.ExchangeRateProviders;

import java.util.List;


@Slf4j
@SpringBootApplication
public class MainApp implements CommandLineRunner {

    static final String QUOTE_PRINT_TEMPLATE = "%s --> %s : %12d|%12d";

    public static void main(String[] args) {

        log.info(">>> Starting currency-exchange-rate-app ... \n");

        SpringApplication.run(MainApp.class, args);

        System.out.println();

        log.info(">>> Completed currency-exchange-rate-app \n");
    }

    @Override
    public void run(String... args) throws Exception {

        log.info(">>> Retrieving currency quotes from provider ... ");

        ExchangeRateProviders.providers().stream()
                .flatMap(p -> quotes(p).stream())
                .forEach(MainApp::printCurrencyRates);
    }

    private List<Quote> quotes(@NonNull final ExchangeRateProvider provider) {

        System.out.println();
        System.out.println(provider.getClass().getSimpleName());
        System.out.println("----------------------------------------");
        System.out.println(String.format("%14s%12s|%12s", "","Ask", "Bid"));
        System.out.println("----------------------------------------");

        return provider.create().getQuotes();
    }

    private static void printCurrencyRates(@NonNull final Quote quote) {

        System.out.println(String.format(QUOTE_PRINT_TEMPLATE,
                quote.baseCurrency(), quote.currency(), quote.ask(), quote.bid()));
    }

}///:~