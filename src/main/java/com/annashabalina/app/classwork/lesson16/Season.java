package com.annashabalina.app.classwork.lesson16;

import java.util.Arrays;

/**
 * Created by Пользователь on 26.11.2016.
 */
public enum Season {
    SPRING {
        @Override
        String getWeather() {
            return "sunny";
        }
    }, SUMMER {
        @Override
        String getWeather() {
            return "hot";
        }
    }, AUTUMN {
        @Override
        String getWeather() {
            return "rainy";
        }
    }, WINTER {
        @Override
        String getWeather() {
            return "call as hell";
        }
    };

/*    public static void main(String[] args) {
//       System.out.println(SPRING.name());
//        System.out.println(SPRING.toString());
//        System.out.println(AUTUMN.ordinal());
//          System.out.println(Arrays.toString(Season.values()));
//          System.out.println(Season.values());

        try {
            Season season = Season.valueOf("SUMMERS");
            switch (season) {
                case SPRING:
                    System.out.println(season.toString());
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid season selection");
        }
    }
*/

    abstract String getWeather();

    public static void main(String[] args) {
        System.out.println(Season.WINTER.getWeather());
    }
}
