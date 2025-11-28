package com.aritu.java.eu.text.spi;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.spi.NumberFormatProvider;
import java.util.Arrays;
import java.util.Locale;

import com.aritu.java.eu.constants.Locales;
import com.aritu.java.eu.text.BasqueDecimalFormatSymbols;

public final class BasqueNumberFormatProvider extends NumberFormatProvider {

    public BasqueNumberFormatProvider() {
        super();
    }

    @Override
    public NumberFormat getCurrencyInstance(final Locale locale) {
        if (locale == null) {
            throw new NullPointerException();
        }
        if (Locales.BASQUE_LIST.contains(locale)) {
            final NumberFormat format = NumberFormat.getCurrencyInstance(
                    Locales.CASTILIAN);
            if (format instanceof DecimalFormat) {
                ((DecimalFormat) format).setDecimalFormatSymbols(
                        new BasqueDecimalFormatSymbols());
            }
            return format;
        }
        throw new IllegalArgumentException("Locale \"" + locale + "\" "
                + "is not one of the supported locales ("
                + Arrays.asList(Locales.BASQUE_ARRAY) + ")");
    }

    @Override
    public NumberFormat getIntegerInstance(final Locale locale) {
        if (locale == null) {
            throw new NullPointerException();
        }
        if (Locales.BASQUE_LIST.contains(locale)) {
            final NumberFormat format = NumberFormat.getIntegerInstance(
                    Locales.CASTILIAN);
            if (format instanceof DecimalFormat) {
                ((DecimalFormat) format).setDecimalFormatSymbols(
                        new BasqueDecimalFormatSymbols());
            }
            return format;
        }
        throw new IllegalArgumentException("Locale \"" + locale + "\" "
                + "is not one of the supported locales ("
                + Arrays.asList(Locales.BASQUE_ARRAY) + ")");
    }

    @Override
    public NumberFormat getNumberInstance(final Locale locale) {
        if (locale == null) {
            throw new NullPointerException();
        }
        if (Locales.BASQUE_LIST.contains(locale)) {
            final NumberFormat format = NumberFormat.getNumberInstance(
                    Locales.CASTILIAN);
            if (format instanceof DecimalFormat) {
                ((DecimalFormat) format).setDecimalFormatSymbols(
                        new BasqueDecimalFormatSymbols());
            }
            return format;
        }
        throw new IllegalArgumentException("Locale \"" + locale + "\" "
                + "is not one of the supported locales ("
                + Arrays.asList(Locales.BASQUE_ARRAY) + ")");
    }

    @Override
    public NumberFormat getPercentInstance(final Locale locale) {
        if (locale == null) {
            throw new NullPointerException();
        }
        if (Locales.BASQUE_LIST.contains(locale)) {
            final NumberFormat format = NumberFormat.getPercentInstance(
                    Locales.CASTILIAN);
            if (format instanceof DecimalFormat) {
                ((DecimalFormat) format).setDecimalFormatSymbols(
                        new BasqueDecimalFormatSymbols());
            }
            return format;
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
