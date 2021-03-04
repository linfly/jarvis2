package com.mogujie.bigdata.base;

import java.io.InputStream;
import java.util.Properties;

/**
 * Created by lixun on 2017/7/25.
 */
public class PropUtils {

    static Properties properties;

    /*
  * 读取配置文件
  * */
    static {
        try {
            InputStream inputStream = PropUtils.class.getClassLoader().getResourceAsStream("config.properties");
            properties = new Properties();
            properties.load(inputStream);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getProp(String key, String value, boolean flag) {
        return properties.getProperty(value);
    }

    public static String getProp(String key, String value, String defaultVal, boolean flag) {
        if (properties.containsKey(value)) {
            return properties.getProperty(value);
        }
        return defaultVal;
    }
}
