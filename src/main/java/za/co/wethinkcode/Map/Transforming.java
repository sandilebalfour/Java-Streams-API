package za.co.wethinkcode.Map;

import java.util.*;
public class Transforming {

    public static List<Integer> squares(List<Integer> professionalNames){

        return professionalNames.stream().map((e) -> e * 2).toList();
    }

    public static List<Integer> cubes(List<Integer> professionalNames){

        return professionalNames.stream().map((e) -> e * 3).toList();
    }
}
