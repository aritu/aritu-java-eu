package com.aritu.java.eu.util.spi;

import java.util.Arrays;
import java.util.Currency;
import java.util.Locale;
import java.util.spi.CurrencyNameProvider;

import com.aritu.java.eu.constants.Locales;

public final class BasqueCurrencyNameProvider extends CurrencyNameProvider {

    public BasqueCurrencyNameProvider() {
        super();
    }

    @Override
    public String getSymbol(final String currencyCode, final Locale locale) {
        if (locale == null) {
            throw new NullPointerException();
        }
        if (Locales.BASQUE_LIST.contains(locale)) {
            return Currency.getInstance(currencyCode).getSymbol(
                    Locales.CASTILIAN);
        }
        throw new IllegalArgumentException("Locale \"" + locale + "\" "
                + "is not one of the supported locales ("
                + Arrays.asList(Locales.BASQUE_ARRAY) + ")");
    }

    @Override
    public Locale[] getAvailableLocales() {
        return Locales.BASQUE_ARRAY;
    }

}
