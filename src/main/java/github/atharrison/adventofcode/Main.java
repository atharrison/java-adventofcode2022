package github.atharrison.adventofcode;

import github.atharrison.adventofcode.days.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("AdventOfCode 2022 START");
        Day03 instance = new Day03(false);
        instance.execute();
        
        System.out.println("AdventOfCode 2022 END");
    }
}