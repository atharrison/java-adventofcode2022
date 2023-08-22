package github.atharrison.adventofcode.days;




import java.util.*; 
import java.io.*;

import github.atharrison.adventofcode.days.Day;

public class Day01 extends Day {

    public Day01() {
        super(2022, 1);
    }

    public void solvePart1(String data) {
        
        Iterator<String> iterator = data.lines().iterator();

        int largest = 0;
        int current = 0;
        while (iterator.hasNext()) {
            String line = iterator.next();
            if (line.length() == 0) {
                if (current > largest) {
                    largest = current;
                }
                current = 0;
            }
            else {
                int number = Integer.parseInt(line);
                current += number;
            }
            
        }
        System.out.println("Part1: " + largest);
    }

public void solvePart2(String data) {
        
        Iterator<String> iterator = data.lines().iterator();

        List<Integer> elfCalories = new ArrayList<>();
        int current = 0;
        while (iterator.hasNext()) {
            String line = iterator.next();
            if (line.length() == 0) {
                elfCalories.add(current);
                current = 0;
            }
            else {
                int number = Integer.parseInt(line);
                current += number;
            }
            
        }
        elfCalories.sort((a, b) -> b - a);
        Integer largest3 = elfCalories.get(0) + elfCalories.get(1) + elfCalories.get(2);
        System.out.println("Part2: " + largest3);
    }
}