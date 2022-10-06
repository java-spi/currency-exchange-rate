//: spi.currency.rate.domain.model.Quote


package spi.currency.rate.domain.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;


@Data
@Accessors(fluent = true)
@AllArgsConstructor(staticName = "of")
public class Quote {

    private String baseCurrency;

    private String currency;

    private int ask;

    private int bid;

}///:~