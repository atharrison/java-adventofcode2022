package github.atharrison.adventofcode.days;




import java.util.*; 
import java.io.*;

import github.atharrison.adventofcode.days.Day;

public class Day04 extends Day {



    public Day04(boolean useSample) {
        super(2022, "04", useSample);
    }


    public void solvePart1(String data) {
        Iterator<String> iterator = data.lines().iterator();
        int totalOverlaps = 0;
        while (iterator.hasNext()) {
            String line = iterator.next();
            if(line.length() == 0) {
                continue;
            }

            String[] sections = line.split(",|-");
            System.out.println(Arrays.toString(sections));
            int start1 = Integer.parseInt(sections[0]);
            int end1 = Integer.parseInt(sections[1]);
            int start2 = Integer.parseInt(sections[2]);
            int end2 = Integer.parseInt(sections[3]);

            if ((start1 <= start2 && end1 >= end2) || (start2 <= start1 && end2 >= end1)) {
                totalOverlaps += 1;
            }


        }
        System.out.println("Part1: "+ String.valueOf(totalOverlaps));
    }

public void solvePart2(String data) {
        Iterator<String> iterator = data.lines().iterator();
        int anyOverlaps = 0;
        while (iterator.hasNext()) {
            String line = iterator.next();
            if(line.length() == 0) {
                continue;
            }

            String[] sections = line.split(",|-");
            System.out.println(Arrays.toString(sections));
            int start1 = Integer.parseInt(sections[0]);
            int end1 = Integer.parseInt(sections[1]);
            int start2 = Integer.parseInt(sections[2]);
            int end2 = Integer.parseInt(sections[3]);

            if (!((end1 < start2) || (start1 > end2) || (end2 < start1) || (start2 > end1))) {
                anyOverlaps += 1;
            }
        }

        System.out.println("Part1: "+ String.valueOf(anyOverlaps));
    }
}