package github.atharrison.adventofcode.days;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public abstract class Day {
    

    protected final int year;
    protected final int day;

    public Day(int year, int day) {
        this.year = year;
        this.day = day;
      }

    public File getResource(String path) {
        return new File("src/main/resources/" + path);
    }

    public String getInputPath() {
        return String.format("days/day01_input.txt", "01");
    }

    public String getResourceAsString(String resource) {
        try {
            return Files.readString(this.getResource(resource).toPath());
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    
    public void execute() {
        String data = getResourceAsString(this.getInputPath());
        this.solvePart1(data); 
        this.solvePart2(data);

    }

    abstract void solvePart1(String data);
    abstract void solvePart2(String data);
}