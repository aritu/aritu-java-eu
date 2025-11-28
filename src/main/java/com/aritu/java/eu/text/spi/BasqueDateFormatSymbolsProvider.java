package com.aritu.java.eu.text.spi;

import java.text.DateFormatSymbols;
import java.text.spi.DateFormatSymbolsProvider;
import java.util.Arrays;
import java.util.Locale;

import com.aritu.java.eu.constants.Locales;
import com.aritu.java.eu.text.BasqueDateFormatSymbols;

public final class BasqueDateFormatSymbolsProvider
        extends DateFormatSymbolsProvider {

    public BasqueDateFormatSymbolsProvider() {
        super();
    }

    @Override
    public DateFormatSymbols getInstance(final Locale locale) {
        if (locale == null) {
            throw new NullPointerException();
        }
        if (Locales.BASQUE_LIST.contains(locale)) {
            return new BasqueDateFormatSymbols();
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
