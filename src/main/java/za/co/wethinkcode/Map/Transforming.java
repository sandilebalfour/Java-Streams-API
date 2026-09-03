package za.co.wethinkcode.Map;

import java.util.*;
public class Transforming {

    public static List<Integer> squares(List<Integer> integers){

        return integers.stream().map((e) -> e * 2).toList();
    }

    public static List<Integer> cubes(List<Integer> numbs){

        return numbs.stream().map((e) -> e * 3).toList();
    }

    public static List<String> upperCases(List<String> professionalNames){

        return professionalNames.stream().map(String::toUpperCase).toList();
    }


}
