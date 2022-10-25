package com.aritu.java.eu.util.spi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.spi.LocaleNameProvider;

import com.aritu.java.eu.constants.Locales;

public final class BasqueLocaleNameProvider extends LocaleNameProvider {

    private static final Map<String, String> BASQUE_DISPLAY_COUNTRIES = createBasqueDisplayCountries();

    private static final Map<String, String> BASQUE_DISPLAY_LANGUAGES = createBasqueDisplayLanguages();

    public BasqueLocaleNameProvider() {
        super();
    }

    @Override
    public String getDisplayCountry(String countryCode, Locale locale) {
        if (locale == null) {
            throw new NullPointerException();
        }
        if (Locales.BASQUE_LIST.contains(locale)) {
            return BASQUE_DISPLAY_COUNTRIES.get(countryCode);
        }
        throw new IllegalArgumentException("Locale \"" + locale + "\" "
                + "is not one of the supported locales ("
                + Arrays.asList(Locales.BASQUE_ARRAY) + ")");
    }

    @Override
    public String getDisplayLanguage(String languageCode, Locale locale) {
        if (locale == null) {
            throw new NullPointerException();
        }
        if (Locales.BASQUE_LIST.contains(locale)) {
            return BASQUE_DISPLAY_LANGUAGES.get(languageCode);
        }
        throw new IllegalArgumentException("Locale \"" + locale + "\" "
                + "is not one of the supported locales ("
                + Arrays.asList(Locales.BASQUE_ARRAY) + ")");
    }

    @Override
    public String getDisplayVariant(String variant, Locale locale) {
        if (locale == null) {
            throw new NullPointerException();
        }
        if (Locales.BASQUE_LIST.contains(locale)) {
            return variant;
        }
        throw new IllegalArgumentException("Locale \"" + locale + "\" "
                + "is not one of the supported locales ("
                + Arrays.asList(Locales.BASQUE_ARRAY) + ")");
    }

    @Override
    public Locale[] getAvailableLocales() {
        return Locales.BASQUE_ARRAY;
    }

    private static Map<String, String> createBasqueDisplayCountries() {
        final Map<String, String> displayCountries = new HashMap<>();
        displayCountries.put("AD", "Andorra");
        displayCountries.put("AE", "Arabiar Emirerri Batuak");
        displayCountries.put("AF", "Afganistan");
        displayCountries.put("AG", "Antigua eta Barbuda");
        displayCountries.put("AI", "Aingira");
        displayCountries.put("AL", "Albania");
        displayCountries.put("AM", "Armenia");
        displayCountries.put("AN", "Holandarren Antillak");
        displayCountries.put("AO", "Angola");
        displayCountries.put("AQ", "Antartika");
        displayCountries.put("AR", "Argentina");
        displayCountries.put("AS", "Samoa Estatubatuarra");
        displayCountries.put("AT", "Austria");
        displayCountries.put("AU", "Australia");
        displayCountries.put("AW", "Aruba");
        displayCountries.put("AX", "Åland uharteak");
        displayCountries.put("AZ", "Azerbaijan");
        displayCountries.put("BA", "Bosnia eta Herzegovina");
        displayCountries.put("BB", "Barbados");
        displayCountries.put("BD", "Bangladesh");
        displayCountries.put("BE", "Belgika");
        displayCountries.put("BF", "Burkina Faso");
        displayCountries.put("BG", "Bulgaria");
        displayCountries.put("BH", "Bahrain");
        displayCountries.put("BI", "Burundi");
        displayCountries.put("BJ", "Benin");
        displayCountries.put("BM", "Bermuda");
        displayCountries.put("BN", "Brunei");
        displayCountries.put("BO", "Bolivia");
        displayCountries.put("BR", "Brasil");
        displayCountries.put("BS", "Bahamak");
        displayCountries.put("BT", "Bhutan");
        displayCountries.put("BV", "Bouvet uhartea");
        displayCountries.put("BW", "Botswana");
        displayCountries.put("BY", "Bielorrusia");
        displayCountries.put("BZ", "Belize");
        displayCountries.put("CA", "Kanada");
        displayCountries.put("CC", "Cocos uharteak");
        displayCountries.put("CD", "Kongoko Errepublika Demokratikoa");
        displayCountries.put("CF", "Afrika Erdiko Errepublika");
        displayCountries.put("CG", "Kongoko Errepublika");
        displayCountries.put("CH", "Suitza");
        displayCountries.put("CI", "Boli Kosta");
        displayCountries.put("CK", "Cook uharteak");
        displayCountries.put("CL", "Txile");
        displayCountries.put("CM", "Kamerun");
        displayCountries.put("CN", "Txina");
        displayCountries.put("CO", "Kolonbia");
        displayCountries.put("CR", "Costa Rica");
        displayCountries.put("CS", "Serbia eta Montenegro");
        displayCountries.put("CU", "Kuba");
        displayCountries.put("CV", "Cabo Verde");
        displayCountries.put("CX", "Christmas uhartea");
        displayCountries.put("CY", "Zipre");
        displayCountries.put("CZ", "Txekiar Errepublika");
        displayCountries.put("DE", "Alemania");
        displayCountries.put("DJ", "Djibuti");
        displayCountries.put("DK", "Danimarka");
        displayCountries.put("DM", "Dominika");
        displayCountries.put("DO", "Dominikar Errepublika");
        displayCountries.put("DZ", "Aljeria");
        displayCountries.put("EC", "Ekuador");
        displayCountries.put("EE", "Estonia");
        displayCountries.put("EG", "Egipto");
        displayCountries.put("EH", "Mendebaldeko Sahara");
        displayCountries.put("ER", "Eritrea");
        displayCountries.put("ES", "Espainia");
        displayCountries.put("ET", "Etiopia");
        displayCountries.put("FI", "Finlandia");
        displayCountries.put("FJ", "Fiji");
        displayCountries.put("FK", "Malvina uharteak");
        displayCountries.put("FM", "Mikronesia");
        displayCountries.put("FO", "Faroe uharteak");
        displayCountries.put("FR", "Frantzia");
        displayCountries.put("GA", "Gabon");
        displayCountries.put("GB", "Erresuma Batua");
        displayCountries.put("GD", "Granada");
        displayCountries.put("GE", "Georgia");
        displayCountries.put("GF", "Guyana Frantsesa");
        displayCountries.put("GH", "Ghana");
        displayCountries.put("GI", "Gibraltar");
        displayCountries.put("GL", "Groenlandia");
        displayCountries.put("GM", "Gambia");
        displayCountries.put("GN", "Ginea");
        displayCountries.put("GP", "Guadalupe");
        displayCountries.put("GQ", "Ekuatore Ginea");
        displayCountries.put("GR", "Grezia");
        displayCountries.put("GS", "Hego Georgia eta Hego Sandwich uharteak");
        displayCountries.put("GT", "Guatemala");
        displayCountries.put("GU", "Guam");
        displayCountries.put("GW", "Ginea Bissau");
        displayCountries.put("GY", "Guyana");
        displayCountries.put("HK", "Hong Kong");
        displayCountries.put("HM", "Heard eta McDonald uharteak");
        displayCountries.put("HN", "Honduras");
        displayCountries.put("HR", "Kroazia");
        displayCountries.put("HT", "Haiti");
        displayCountries.put("HU", "Hungaria");
        displayCountries.put("ID", "Indonesia");
        displayCountries.put("IE", "Irlanda");
        displayCountries.put("IL", "Israel");
        displayCountries.put("IN", "India");
        displayCountries.put("IO", "Indiako Ozeanoko Britainiar Lurraldea");
        displayCountries.put("IQ", "Irak");
        displayCountries.put("IR", "Iran");
        displayCountries.put("IS", "Islandia");
        displayCountries.put("IT", "Italia");
        displayCountries.put("JM", "Jamaika");
        displayCountries.put("JO", "Jordania");
        displayCountries.put("JP", "Japonia");
        displayCountries.put("KE", "Kenya");
        displayCountries.put("KG", "Kirgizistan");
        displayCountries.put("KH", "Kanbodia");
        displayCountries.put("KI", "Kiribati");
        displayCountries.put("KM", "Komoreak");
        displayCountries.put("KN", "Saint Kitts eta Nevis");
        displayCountries.put("KP", "Ipar Korea");
        displayCountries.put("KR", "Hego Korea");
        displayCountries.put("KW", "Kuwait");
        displayCountries.put("KY", "Kaiman uharteak");
        displayCountries.put("KZ", "Kazakhstan");
        displayCountries.put("LA", "Laos");
        displayCountries.put("LB", "Libano");
        displayCountries.put("LC", "Santa Luzia");
        displayCountries.put("LI", "Liechtenstein");
        displayCountries.put("LK", "Sri Lanka");
        displayCountries.put("LR", "Liberia");
        displayCountries.put("LS", "Lesotho");
        displayCountries.put("LT", "Lituania");
        displayCountries.put("LU", "Luxenburgo");
        displayCountries.put("LV", "Letonia");
        displayCountries.put("LY", "Libia");
        displayCountries.put("MA", "Maroko");
        displayCountries.put("MC", "Monako");
        displayCountries.put("MD", "Moldavia");
        displayCountries.put("ME", "Montenegro");
        displayCountries.put("MG", "Madagaskar");
        displayCountries.put("MH", "Marshall uharteak");
        displayCountries.put("MK", "Mazedonia");
        displayCountries.put("ML", "Mali");
        displayCountries.put("MM", "Myanmar");
        displayCountries.put("MN", "Mongolia");
        displayCountries.put("MO", "Makao");
        displayCountries.put("MP", "Ipar Mariana uharteak");
        displayCountries.put("MQ", "Martinika");
        displayCountries.put("MR", "Mauritania");
        displayCountries.put("MS", "Montserrat");
        displayCountries.put("MT", "Malta");
        displayCountries.put("MU", "Maurizio");
        displayCountries.put("MV", "Maldivetako Errepublika");
        displayCountries.put("MW", "Malawi");
        displayCountries.put("MX", "Mexiko");
        displayCountries.put("MY", "Malaysia");
        displayCountries.put("MZ", "Mozambike");
        displayCountries.put("NA", "Namibia");
        displayCountries.put("NC", "Kaledonia Berria");
        displayCountries.put("NE", "Niger");
        displayCountries.put("NF", "Norfolk uhartea");
        displayCountries.put("NG", "Nigeria");
        displayCountries.put("NI", "Nikaragua");
        displayCountries.put("NL", "Herbehereak");
        displayCountries.put("NO", "Norvegia");
        displayCountries.put("NP", "Nepal");
        displayCountries.put("NR", "Nauru");
        displayCountries.put("NU", "Niue");
        displayCountries.put("NZ", "Zeelanda Berria");
        displayCountries.put("OM", "Oman");
        displayCountries.put("PA", "Panama");
        displayCountries.put("PE", "Peru");
        displayCountries.put("PF", "Polinesia Frantsesa");
        displayCountries.put("PG", "Papua Ginea Berria");
        displayCountries.put("PH", "Filipinak");
        displayCountries.put("PK", "Pakistan");
        displayCountries.put("PL", "Polonia");
        displayCountries.put("PM", "Saint-Pierre eta Mikelune");
        displayCountries.put("PN", "Pitcairn uharteak");
        displayCountries.put("PR", "Puerto Rico");
        displayCountries.put("PS", "Palestina");
        displayCountries.put("PT", "Portugal");
        displayCountries.put("PW", "Palau");
        displayCountries.put("PY", "Paraguai");
        displayCountries.put("QA", "Qatar");
        displayCountries.put("RE", "Reunion");
        displayCountries.put("RO", "Errumania");
        displayCountries.put("RS", "Serbia");
        displayCountries.put("RU", "Errusia");
        displayCountries.put("RW", "Ruanda");
        displayCountries.put("SA", "Saudi Arabia");
        displayCountries.put("SB", "Salomon uharteak");
        displayCountries.put("SC", "Seychelle uharteak");
        displayCountries.put("SD", "Sudan");
        displayCountries.put("SE", "Suedia");
        displayCountries.put("SG", "Singapur");
        displayCountries.put("SH", "Santa Helena");
        displayCountries.put("SI", "Eslovenia");
        displayCountries.put("SJ", "Svalbard eta Jan Mayen");
        displayCountries.put("SK", "Eslovakia");
        displayCountries.put("SL", "Sierra Leona");
        displayCountries.put("SM", "San Marino");
        displayCountries.put("SN", "Senegal");
        displayCountries.put("SO", "Somalia");
        displayCountries.put("SR", "Surinam");
        displayCountries.put("ST", "Sao Tome eta Principe");
        displayCountries.put("SV", "El Salvador");
        displayCountries.put("SY", "Siria");
        displayCountries.put("SZ", "Eswatini");
        displayCountries.put("TC", "Turk eta Caico uharteak");
        displayCountries.put("TD", "Txad");
        displayCountries.put("TF",
                "Frantziaren Lurralde Austral eta Antartikoak");
        displayCountries.put("TG", "Togo");
        displayCountries.put("TH", "Thailandia");
        displayCountries.put("TJ", "Tajikistan");
        displayCountries.put("TK", "Tokelau");
        displayCountries.put("TL", "Ekialdeko Timor");
        displayCountries.put("TM", "Turkmenistan");
        displayCountries.put("TN", "Tunisia");
        displayCountries.put("TO", "Tonga");
        displayCountries.put("TR", "Turkia");
        displayCountries.put("TT", "Trinidad eta Tobago");
        displayCountries.put("TV", "Tuvalu");
        displayCountries.put("TW", "Taiwan");
        displayCountries.put("TZ", "Tanzania");
        displayCountries.put("UA", "Ukraina");
        displayCountries.put("UG", "Uganda");
        displayCountries.put("UM",
                "Ameriketako Estatu Batuetako Itsasoz Haraindiko Uharteak");
        displayCountries.put("US", "Ameriketako Estatu Batuak");
        displayCountries.put("UY", "Uruguai");
        displayCountries.put("UZ", "Uzbekistan");
        displayCountries.put("VA", "Vatikano Hiria");
        displayCountries.put("VC", "Saint Vincent eta Grenadinak");
        displayCountries.put("VE", "Venezuela");
        displayCountries.put("VG", "Birjina Uharte Britainiarrak");
        displayCountries.put("VI", "Birjina Uharte Estatubatuarrak");
        displayCountries.put("VN", "Vietnam");
        displayCountries.put("VU", "Vanuatu");
        displayCountries.put("WF", "Wallis eta Futuna");
        displayCountries.put("WS", "Samoa");
        displayCountries.put("YE", "Yemen");
        displayCountries.put("YT", "Mayotte");
        displayCountries.put("ZA", "Hegoafrika");
        displayCountries.put("ZM", "Zambia");
        displayCountries.put("ZW", "Zimbabwe");
        return displayCountries;
    }

    private static Map<String, String> createBasqueDisplayLanguages() {
        final Map<String, String> displayLanguages = new HashMap<>();
        displayLanguages.put("aa", "afarera");
        displayLanguages.put("ab", "abkhazera");
        displayLanguages.put("ae", "avestera");
        displayLanguages.put("af", "afrikaansa");
        displayLanguages.put("ak", "akanera");
        displayLanguages.put("am", "amharera");
        displayLanguages.put("an", "aragoiera");
        displayLanguages.put("ar", "arabiera");
        displayLanguages.put("as", "assamera");
        displayLanguages.put("av", "avarera");
        displayLanguages.put("ay", "aimara");
        displayLanguages.put("az", "azerbaijanera");
        displayLanguages.put("ba", "baxkirera");
        displayLanguages.put("be", "bielorrusiera");
        displayLanguages.put("bg", "bulgariera");
        displayLanguages.put("bh", "bihariera");
        displayLanguages.put("bi", "bislama");
        displayLanguages.put("bm", "bamanankana");
        displayLanguages.put("bn", "bengalera");
        displayLanguages.put("bo", "tibetera");
        displayLanguages.put("br", "bretainiera");
        displayLanguages.put("bs", "bosniera");
        displayLanguages.put("ca", "katalana");
        displayLanguages.put("ce", "txetxeniera");
        displayLanguages.put("ch", "txamorroa");
        displayLanguages.put("co", "korsikera");
        displayLanguages.put("cr", "creera");
        displayLanguages.put("cs", "txekiera");
        displayLanguages.put("cu", "elizako eslaviera");
        displayLanguages.put("cv", "chuvashera");
        displayLanguages.put("cy", "galesera");
        displayLanguages.put("da", "daniera");
        displayLanguages.put("de", "alemana");
        displayLanguages.put("dv", "maldivera");
        displayLanguages.put("dz", "bhutanera");
        displayLanguages.put("ee", "eweera");
        displayLanguages.put("el", "greziera");
        displayLanguages.put("en", "ingelesa");
        displayLanguages.put("eo", "esperantoa");
        displayLanguages.put("es", "gaztelania");
        displayLanguages.put("et", "estoniera");
        displayLanguages.put("eu", "euskara");
        displayLanguages.put("fa", "persiera");
        displayLanguages.put("ff", "fula");
        displayLanguages.put("fi", "suomiera");
        displayLanguages.put("fj", "fijiera");
        displayLanguages.put("fo", "faroera");
        displayLanguages.put("fr", "frantsesa");
        displayLanguages.put("fy", "frisiera");
        displayLanguages.put("ga", "irlandera");
        displayLanguages.put("gd", "Eskoziako gaelikoa");
        displayLanguages.put("gl", "galiziera");
        displayLanguages.put("gn", "guaraniera");
        displayLanguages.put("gu", "gujaratera");
        displayLanguages.put("gv", "manxera");
        displayLanguages.put("ha", "hausa");
        displayLanguages.put("he", "hebreera");
        displayLanguages.put("hi", "hindia");
        displayLanguages.put("ho", "hiri motua");
        displayLanguages.put("hr", "kroaziera");
        displayLanguages.put("ht", "Haitiko kreolera");
        displayLanguages.put("hu", "hungariera");
        displayLanguages.put("hy", "armeniera");
        displayLanguages.put("hz", "hereroera");
        displayLanguages.put("ia", "interlingua");
        displayLanguages.put("id", "indonesiera");
        displayLanguages.put("ie", "interlinguea");
        displayLanguages.put("ig", "igboera");
        displayLanguages.put("ii", "yi hizkuntza");
        displayLanguages.put("ik", "inupiakera");
        displayLanguages.put("in", "indonesiera");
        displayLanguages.put("io", "ido hizkuntza");
        displayLanguages.put("is", "islandiera");
        displayLanguages.put("it", "italiera");
        displayLanguages.put("iu", "inuktitutera");
        displayLanguages.put("iw", "hebreera");
        displayLanguages.put("ja", "japoniera");
        displayLanguages.put("ji", "yiddisha");
        displayLanguages.put("jv", "javera");
        displayLanguages.put("ka", "georgiera");
        displayLanguages.put("kg", "kikongoa");
        displayLanguages.put("ki", "kikuyuera");
        displayLanguages.put("kj", "kwanyama");
        displayLanguages.put("kk", "kazakhera");
        displayLanguages.put("kl", "groenlandiera");
        displayLanguages.put("km", "khmerera");
        displayLanguages.put("kn", "kannada");
        displayLanguages.put("ko", "koreera");
        displayLanguages.put("kr", "kanuria");
        displayLanguages.put("ks", "kaxmirera");
        displayLanguages.put("ku", "kurduera");
        displayLanguages.put("kv", "komiera");
        displayLanguages.put("kw", "kornubiera");
        displayLanguages.put("ky", "kirgizera");
        displayLanguages.put("la", "latina");
        displayLanguages.put("lb", "luxenburgera");
        displayLanguages.put("lg", "gandera");
        displayLanguages.put("li", "linburgera");
        displayLanguages.put("ln", "lingala");
        displayLanguages.put("lo", "laosera");
        displayLanguages.put("lt", "lituaniera");
        displayLanguages.put("lu", "luba-kasaiera");
        displayLanguages.put("lv", "letoniera");
        displayLanguages.put("mg", "malgaxea");
        displayLanguages.put("mh", "marshallera");
        displayLanguages.put("mi", "maoriera");
        displayLanguages.put("mk", "mazedoniera");
        displayLanguages.put("ml", "malabarera");
        displayLanguages.put("mn", "mongoliera");
        displayLanguages.put("mo", "moldaviera");
        displayLanguages.put("mr", "marathera");
        displayLanguages.put("ms", "malaysiera");
        displayLanguages.put("mt", "maltera");
        displayLanguages.put("my", "birmaniera");
        displayLanguages.put("na", "nauruera");
        displayLanguages.put("nb", "norvegiera (bokm\u00E5l)");
        displayLanguages.put("nd", "ndebelera (iparra)");
        displayLanguages.put("ne", "nepalera");
        displayLanguages.put("ng", "ndonga");
        displayLanguages.put("nl", "nederlandera");
        displayLanguages.put("nn", "norvegiera (nynorsk)");
        displayLanguages.put("no", "norvegiera");
        displayLanguages.put("nr", "ndebelera (hegoa)");
        displayLanguages.put("nv", "navajoa");
        displayLanguages.put("ny", "nyanja");
        displayLanguages.put("oc", "okzitaniera");
        displayLanguages.put("oj", "ojibwa");
        displayLanguages.put("om", "oromoera");
        displayLanguages.put("or", "oriya");
        displayLanguages.put("os", "osetiera");
        displayLanguages.put("pa", "punjabera");
        displayLanguages.put("pi", "paliera");
        displayLanguages.put("pl", "poloniera");
        displayLanguages.put("ps", "paxtunera");
        displayLanguages.put("pt", "portugesa");
        displayLanguages.put("qu", "kitxua");
        displayLanguages.put("rm", "erretorromaniera ");
        displayLanguages.put("rn", "kirundia");
        displayLanguages.put("ro", "errumaniera");
        displayLanguages.put("ru", "errusiera");
        displayLanguages.put("rw", "kinyaruanda");
        displayLanguages.put("sa", "sanskritoa");
        displayLanguages.put("sc", "sardiniera");
        displayLanguages.put("sd", "sindhia");
        displayLanguages.put("se", "ipar samiera");
        displayLanguages.put("sg", "sangoa");
        displayLanguages.put("si", "sinhala");
        displayLanguages.put("sk", "eslovakiera");
        displayLanguages.put("sl", "esloveniera");
        displayLanguages.put("sm", "samoera");
        displayLanguages.put("sn", "shona");
        displayLanguages.put("so", "somaliera");
        displayLanguages.put("sq", "albaniera");
        displayLanguages.put("sr", "serbiera");
        displayLanguages.put("ss", "swaziera");
        displayLanguages.put("st", "sothoera");
        displayLanguages.put("su", "sudanera");
        displayLanguages.put("sv", "suediera");
        displayLanguages.put("sw", "swahilia");
        displayLanguages.put("ta", "tamilera");
        displayLanguages.put("te", "telugua");
        displayLanguages.put("tg", "tajikera");
        displayLanguages.put("th", "thailandiera");
        displayLanguages.put("ti", "tigrinyera");
        displayLanguages.put("tk", "turkmenera");
        displayLanguages.put("tl", "tagaloa");
        displayLanguages.put("tn", "tswanera");
        displayLanguages.put("to", "tongera");
        displayLanguages.put("tr", "turkiera");
        displayLanguages.put("ts", "tsongera");
        displayLanguages.put("tt", "tatarera");
        displayLanguages.put("tw", "twi hizkuntza");
        displayLanguages.put("ty", "tahitiera");
        displayLanguages.put("ug", "uigurrera");
        displayLanguages.put("uk", "ukrainera");
        displayLanguages.put("ur", "urdua");
        displayLanguages.put("uz", "uzbekera");
        displayLanguages.put("ve", "vendera");
        displayLanguages.put("vi", "vietnamera");
        displayLanguages.put("vo", "volap\u00FCk");
        displayLanguages.put("wa", "valoniera");
        displayLanguages.put("wo", "wolofera");
        displayLanguages.put("xh", "xhosera");
        displayLanguages.put("yi", "yiddish");
        displayLanguages.put("yo", "jorubera");
        displayLanguages.put("za", "zhuangera");
        displayLanguages.put("zh", "txinera");
        displayLanguages.put("zu", "zuluera");
        return displayLanguages;
    }

}
