package com.proxy.demo.Service;

import java.util.concurrent.ThreadLocalRandom;

public class KeyValue {

        public String getkey(String lurl) {
            StringBuilder tinyUrl = new StringBuilder();
            String map = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
            for (int i = 0; i < 7; i++)
            {
                int randomIndex = ThreadLocalRandom.current().nextInt(0, map.length());
                tinyUrl.append(map.charAt(randomIndex));
            }
            return tinyUrl.toString();
       }
}


