package com.aritu.java.eu.text.spi;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.spi.DateFormatProvider;
import java.util.Arrays;
import java.util.Locale;

import com.aritu.java.eu.constants.Locales;

public final class BasqueDateFormatProvider extends DateFormatProvider {

    private static final String PATTERN_DATE_SHORT = "yy/MM/dd";

    private static final String PATTERN_DATE_MEDIUM = "yyyy-MMM-dd";

    private static final String PATTERN_DATE_LONG = "yyyy'(e)ko' MMMM'ren' yyyy'(a)'";

    private static final String PATTERN_DATE_FULL = "EEEE',' yyyy'(e)ko' MMMM'ren' yyyy'(a)'";

    private static final String PATTERN_TIME_SHORT = "HH:mm";

    private static final String PATTERN_TIME_MEDIUM = "HH:mm:ss";

    private static final String PATTERN_TIME_LONG = "HH:mm:ss z";

    private static final String PATTERN_TIME_FULL = "HH'H'mm'' z";

    public BasqueDateFormatProvider() {
        super();
    }

    @Override
    public DateFormat getDateInstance(final int style, final Locale locale) {
        if (locale == null) {
            throw new NullPointerException();
        }
        if (!isStyleValid(style)) {
            throw new IllegalArgumentException(
                    "Style \"" + style + "\" is not valid");
        }
        if (Locales.BASQUE_LIST.contains(locale)) {
            switch (style) {
            case DateFormat.FULL:
                return new SimpleDateFormat(PATTERN_DATE_FULL, locale);
            case DateFormat.LONG:
                return new SimpleDateFormat(PATTERN_DATE_LONG, locale);
            case DateFormat.MEDIUM:
                return new SimpleDateFormat(PATTERN_DATE_MEDIUM, locale);
            case DateFormat.SHORT:
                return new SimpleDateFormat(PATTERN_DATE_SHORT, locale);
            }
        }
        throw new IllegalArgumentException("Locale \"" + locale + "\" "
                + "is not one of the supported locales ("
                + Arrays.asList(Locales.BASQUE_ARRAY) + ")");
    }

    @Override
    public DateFormat getDateTimeInstance(final int dateStyle,
            final int timeStyle, final Locale locale) {
        if (locale == null) {
            throw new NullPointerException();
        }
        if (!isStyleValid(dateStyle)) {
            throw new IllegalArgumentException(
                    "Style \"" + dateStyle + "\" is not valid");
        }
        if (!isStyleValid(timeStyle)) {
            throw new IllegalArgumentException(
                    "Style \"" + timeStyle + "\" is not valid");
        }
        if (Locales.BASQUE_LIST.contains(locale)) {

            final StringBuffer pattern = new StringBuffer();
            switch (dateStyle) {
            case DateFormat.FULL:
                pattern.append(PATTERN_DATE_FULL);
                break;
            case DateFormat.LONG:
                pattern.append(PATTERN_DATE_LONG);
                break;
            case DateFormat.MEDIUM:
                pattern.append(PATTERN_DATE_MEDIUM);
                break;
            case DateFormat.SHORT:
                pattern.append(PATTERN_DATE_SHORT);
                break;
            }
            pattern.append(" ");
            switch (timeStyle) {
            case DateFormat.FULL:
                pattern.append(PATTERN_TIME_FULL);
                break;
            case DateFormat.LONG:
                pattern.append(PATTERN_TIME_LONG);
                break;
            case DateFormat.MEDIUM:
                pattern.append(PATTERN_TIME_MEDIUM);
                break;
            case DateFormat.SHORT:
                pattern.append(PATTERN_TIME_SHORT);
                break;
            }

            return new SimpleDateFormat(pattern.toString(), locale);

        }
        throw new IllegalArgumentException("Locale \"" + locale + "\" "
                + "is not one of the supported locales ("
                + Arrays.asList(Locales.BASQUE_ARRAY) + ")");
    }

    @Override
    public DateFormat getTimeInstance(final int style, final Locale locale) {
        if (locale == null) {
            throw new NullPointerException();
        }
        if (!isStyleValid(style)) {
            throw new IllegalArgumentException(
                    "Style \"" + style + "\" is not valid");
        }
        if (Locales.BASQUE_LIST.contains(locale)) {
            switch (style) {
            case DateFormat.FULL:
                return new SimpleDateFormat(PATTERN_TIME_FULL, locale);
            case DateFormat.LONG:
                return new SimpleDateFormat(PATTERN_TIME_LONG, locale);
            case DateFormat.MEDIUM:
                return new SimpleDateFormat(PATTERN_TIME_MEDIUM, locale);
            case DateFormat.SHORT:
                return new SimpleDateFormat(PATTERN_TIME_SHORT, locale);
            }
        }
        throw new IllegalArgumentException("Locale \"" + locale + "\" "
                + "is not one of the supported locales ("
                + Arrays.asList(Locales.BASQUE_ARRAY) + ")");
    }

    private static boolean isStyleValid(final int style) {
        return (style == DateFormat.SHORT || style == DateFormat.MEDIUM
                || style == DateFormat.LONG || style == DateFormat.FULL);
    }

    @Override
    public Locale[] getAvailableLocales() {
        return Locales.BASQUE_ARRAY;
    }

}
