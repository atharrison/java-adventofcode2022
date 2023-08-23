package github.atharrison.adventofcode.days;




import java.util.*; 
import java.io.*;

import github.atharrison.adventofcode.days.Day;

public class Day03 extends Day {



    public Day03(boolean useSample) {
        super(2022, "03", useSample);
    }


    private int priority(char c) {
        int priority = (int) c;
        if(Character.isUpperCase(c)) {
            priority -= (int) 'A';
            priority += 27;
        }
        else {
            priority -= (int) 'a';
            priority += 1;
        }      
        return priority;
    }


    public void solvePart1(String data) {


        Iterator<String> iterator = data.lines().iterator();
        int total = 0;
        while (iterator.hasNext()) {
            String line = iterator.next();
            if(line.length() == 0) {
                continue;
            }
            
            int len = line.length();
            String first = line.substring(0, len/2);
            String second = line.substring(len/2);

            System.out.println(String.format("%d\t%s\t%s|%s", line.length(), line, first, second));
            for (char c : first.toCharArray()) {
                if (second.contains(String.format("%s", c))) {
                    
                    int priority = (int) c;
                    priority = this.priority(c);         

                    System.out.println(String.format("%s - %d -> %d", c, (int) c, priority));
                    total += priority;
                    break;
                }
            }            
        }
        System.out.println("Part1: "+ String.valueOf(total));

    }

public void solvePart2(String data) {
        Iterator<String> iterator = data.lines().iterator();
        int total = 0;
        while (iterator.hasNext()) {
            String elf1 = iterator.next();
            if(elf1.length() == 0) {
                continue;
            }
            String elf2 = iterator.next();
            String elf3 = iterator.next();

            
            for (char c : elf1.toCharArray()) {
                if (elf2.contains(String.format("%s", c))) {
                    if(elf3.contains(String.format("%s",c))) {
                        int priority = this.priority(c);
                        System.out.println(String.format("%s - %d -> %d", c, (int) c, priority));
                        total += priority;
                        break;
                    }
                }
            }            
        }
        System.out.println("Part2: "+ String.valueOf(total));    
    }
}