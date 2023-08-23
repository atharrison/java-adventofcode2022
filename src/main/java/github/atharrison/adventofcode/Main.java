package github.atharrison.adventofcode;

import github.atharrison.adventofcode.days.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("AdventOfCode 2022 START");
        // Day01 instance = new Day01();
        Day02 instance = new Day02(false);
        instance.execute();
        
        System.out.println("AdventOfCode 2022 END");
    }
}