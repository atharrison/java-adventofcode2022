package github.atharrison.adventofcode.days;




import java.util.*; 
import java.io.*;

import github.atharrison.adventofcode.days.Day;

public class Day02 extends Day {


    final Map<String, Integer> matchupMap = new HashMap<String, Integer>();
    final Map<Integer, Integer> resultMap = new HashMap<Integer, Integer>();
    final Map<String, Integer> shapeMap = new HashMap<String, Integer>();

    // X means you need to lose, Y means you need to end the round in a draw, and Z means you need to win. Good luck!"
    final Map<String, String> part2Map = new HashMap<String, String>();

    public Day02(boolean useSample) {
        super(2022, "02", useSample);
        // A for Rock, B for Paper, and C for Scissors.
        // X for Rock, Y for Paper, and Z for Scissors.
        // 1 for Rock, 2 for Paper, and 3 for Scissors.
        matchupMap.put("AX", 0);
        matchupMap.put("AY", 1);
        matchupMap.put("AZ", -1);
        matchupMap.put("BX", -1);
        matchupMap.put("BY", 0);
        matchupMap.put("BZ", 1);
        matchupMap.put("CX", 1);
        matchupMap.put("CY", -1);
        matchupMap.put("CZ", 0);

        resultMap.put(-1, 0);
        resultMap.put(0, 3);
        resultMap.put(1, 6);

        shapeMap.put("X", 1);
        shapeMap.put("Y", 2);
        shapeMap.put("Z", 3);

        part2Map.put("AX", "Z");
        part2Map.put("AY", "X");
        part2Map.put("AZ", "Y");
        part2Map.put("BX", "X");
        part2Map.put("BY", "Y");
        part2Map.put("BZ", "Z");
        part2Map.put("CX", "Y");
        part2Map.put("CY", "Z");
        part2Map.put("CZ", "X");

    }

    public void solvePart1(String data) {


        Iterator<String> iterator = data.lines().iterator();
        int score = 0;
        while (iterator.hasNext()) {
            String line = iterator.next();
            if(line.length() == 0) {
                continue;
            }
            String[] items = line.split(" ", 2);
            Integer result = matchupMap.get(items[0]+items[1]);
            score += resultMap.get(result) + shapeMap.get(items[1]);
            System.out.println(String.format("%s -> %s = %d\t (%d + %d)\t:%d", items[0], items[1], result,resultMap.get(result), shapeMap.get(items[1]), score));
            
            
            
        }
        System.out.println("Part1: "+ String.valueOf(score));

    }

public void solvePart2(String data) {
        Iterator<String> iterator = data.lines().iterator();
        int score = 0;
        while (iterator.hasNext()) {
            String line = iterator.next();
            if(line.length() == 0) {
                continue;
            }
            String[] items = line.split(" ", 2);
            String choice = part2Map.get(items[0]+items[1]);
            Integer result = matchupMap.get(items[0]+choice);
            score += resultMap.get(result) + shapeMap.get(choice);
            System.out.println(String.format("%s -> %s = %d\t (%d + %d)\t:%d", items[0], items[1], result,resultMap.get(result), shapeMap.get(choice), score));
            
            
            
        }
        System.out.println("Part2: "+ String.valueOf(score));
    }
}