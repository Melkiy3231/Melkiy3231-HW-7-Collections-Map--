package main.java.com.task.family;

import java.util.Comparator;

import java.util.Map;

public class NameOfEmblemComparator implements Comparator<Map.Entry<Integer, Family>> {

    @Override
    public int compare(Map.Entry<Integer, Family> family1, Map.Entry<Integer, Family> family2) {
        return family1.getValue().getNameOfEmblem().compareTo(family2.getValue().getNameOfEmblem());
    }
}
