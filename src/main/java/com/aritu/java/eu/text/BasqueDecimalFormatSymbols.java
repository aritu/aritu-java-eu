package com.aritu.java.eu.text;

import java.text.DecimalFormatSymbols;

import com.aritu.java.eu.constants.Locales;

public final class BasqueDecimalFormatSymbols extends DecimalFormatSymbols {

    private static final long serialVersionUID = 1L;

    public BasqueDecimalFormatSymbols() {
        super(Locales.CASTILIAN);
    }

}
