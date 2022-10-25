package com.aritu.java.eu.constants;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public final class Locales {

    public static final Locale BASQUE = new Locale("eu");

    public static final Locale BASQUE_ES = new Locale("eu", "ES");

    public static final Locale BASQUE_FR = new Locale("eu", "FR");

    public static final Locale[] BASQUE_ARRAY = new Locale[] { BASQUE,
            BASQUE_ES, BASQUE_FR };

    public static final List<Locale> BASQUE_LIST = Arrays.asList(BASQUE_ARRAY);

    // We base some configurations on castilian locale
    public static final Locale CASTILIAN = new Locale("es", "ES");

    private Locales() {
        super();
    }

}
