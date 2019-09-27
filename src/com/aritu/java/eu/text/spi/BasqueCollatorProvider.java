package com.aritu.java.eu.text.spi;

import java.text.Collator;
import java.text.spi.CollatorProvider;
import java.util.Arrays;
import java.util.Locale;

import com.aritu.java.eu.constants.Locales;

public final class BasqueCollatorProvider extends CollatorProvider {

    public BasqueCollatorProvider() {
        super();
    }

    @Override
    public Collator getInstance(final Locale locale) {
        if (locale == null) {
            throw new NullPointerException();
        }
        if (Locales.BASQUE_LIST.contains(locale)) {
            return Collator.getInstance(Locales.CASTILIAN);
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
