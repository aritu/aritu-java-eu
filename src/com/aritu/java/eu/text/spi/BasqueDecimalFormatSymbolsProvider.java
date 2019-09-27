package com.aritu.java.eu.text.spi;

import java.text.DecimalFormatSymbols;
import java.text.spi.DecimalFormatSymbolsProvider;
import java.util.Arrays;
import java.util.Locale;

import com.aritu.java.eu.constants.Locales;
import com.aritu.java.eu.text.BasqueDecimalFormatSymbols;

public final class BasqueDecimalFormatSymbolsProvider
        extends DecimalFormatSymbolsProvider {

    public BasqueDecimalFormatSymbolsProvider() {
        super();
    }

    @Override
    public DecimalFormatSymbols getInstance(final Locale locale) {
        if (locale == null) {
            throw new NullPointerException();
        }
        if (Locales.BASQUE_LIST.contains(locale)) {
            return new BasqueDecimalFormatSymbols();
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
