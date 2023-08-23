package github.atharrison.adventofcode.days;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public abstract class Day {
    

    protected final int year;
    protected final String day;
    protected final boolean useSample;

    public Day(int year, String day, boolean useSample) {
        this.year = year;
        this.day = day;
        this.useSample = useSample;
      }

    public File getResource(String path) {
        return new File("src/main/resources/" + path);
    }

    public String getInputPath() {
        String suffix = "input";
        if (this.useSample) {
            suffix = "sample";
        }
        return String.format("days/day%s_%s.txt", this.day, suffix);
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