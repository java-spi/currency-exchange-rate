//: spi.currency.rate.service.QuebecQuoteServiceImpl


package spi.currency.rate.service;


import lombok.AllArgsConstructor;
import spi.currency.rate.domain.model.Quote;

import java.util.List;


@AllArgsConstructor(staticName = "of")
public class QuebecQuoteServiceImpl implements QuoteService {

    @Override
    public List<Quote> getQuotes() {

        return List.of(Quote.of("CAD", "USD", 73, 70),
                Quote.of("CAD", "TWD", 2295, 2290),
                Quote.of("CAD", "RMB", 518, 510));
    }

}///:~