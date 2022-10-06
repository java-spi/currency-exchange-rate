//: spi.currency.rate.service.TecsysQuoteServiceImpl


package spi.currency.rate.service;


import lombok.AllArgsConstructor;
import spi.currency.rate.domain.model.Quote;

import java.util.List;


@AllArgsConstructor(staticName = "of")
public class TecsysQuoteServiceImpl implements QuoteService {

    @Override
    public List<Quote> getQuotes() {

        return List.of(Quote.of("USD", "CAD", 137, 135),
                Quote.of("USD", "TWD", 3156, 3100),
                Quote.of("USD", "JPY", 14482, 14000));
    }

}///:~