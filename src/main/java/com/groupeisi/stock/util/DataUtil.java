package com.groupeisi.stock.util;


import java.util.Locale;
import java.util.ResourceBundle;

public class DataUtil {
    private static final ResourceBundle bundle = ResourceBundle
            .getBundle("configProperties/config",Locale.getDefault());
    public static String host = bundle.getString("host");
    public static String user = bundle.getString("user");
    public static String password = bundle.getString("password");
}
