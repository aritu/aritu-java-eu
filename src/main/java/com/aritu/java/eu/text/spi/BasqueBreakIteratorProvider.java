package com.aritu.java.eu.text.spi;

import java.text.BreakIterator;
import java.text.spi.BreakIteratorProvider;
import java.util.Arrays;
import java.util.Locale;

import com.aritu.java.eu.constants.Locales;

public final class BasqueBreakIteratorProvider extends BreakIteratorProvider {

    public BasqueBreakIteratorProvider() {
        super();
    }

    @Override
    public BreakIterator getCharacterInstance(final Locale locale) {
        if (locale == null) {
            throw new NullPointerException();
        }
        if (Locales.BASQUE_LIST.contains(locale)) {
            return BreakIterator.getCharacterInstance(Locales.CASTILIAN);
        }
        throw new IllegalArgumentException("Locale \"" + locale + "\" "
                + "is not one of the supported locales ("
                + Arrays.asList(Locales.BASQUE_ARRAY) + ")");
    }

    @Override
    public BreakIterator getLineInstance(final Locale locale) {
        if (locale == null) {
            throw new NullPointerException();
        }
        if (Locales.BASQUE_LIST.contains(locale)) {
            return BreakIterator.getLineInstance(Locales.CASTILIAN);
        }
        throw new IllegalArgumentException("Locale \"" + locale + "\" "
                + "is not one of the supported locales ("
                + Arrays.asList(Locales.BASQUE_ARRAY) + ")");
    }

    @Override
    public BreakIterator getSentenceInstance(final Locale locale) {
        if (locale == null) {
            throw new NullPointerException();
        }
        if (Locales.BASQUE_LIST.contains(locale)) {
            return BreakIterator.getSentenceInstance(Locales.CASTILIAN);
        }
        throw new IllegalArgumentException("Locale \"" + locale + "\" "
                + "is not one of the supported locales ("
                + Arrays.asList(Locales.BASQUE_ARRAY) + ")");
    }

    @Override
    public BreakIterator getWordInstance(final Locale locale) {
        if (locale == null) {
            throw new NullPointerException();
        }
        if (Locales.BASQUE_LIST.contains(locale)) {
            return BreakIterator.getWordInstance(Locales.CASTILIAN);
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
