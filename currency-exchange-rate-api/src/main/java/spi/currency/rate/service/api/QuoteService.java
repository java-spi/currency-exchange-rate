package spi.currency.rate.service.api;


import spi.currency.rate.domain.model.Quote;

import java.util.List;


public interface QuoteService {

    List<Quote> getQuotes();
}
