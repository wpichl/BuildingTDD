package at.htlleonding.syp;

import java.util.LinkedList;

public class Building {
    private Integer id;
    private LinkedList<String> residents = null;

    public Building(String _resident) {
        if (residents == null) {
            residents = new LinkedList<>();
        }

        residents.add(_resident);

    }

    public Building(String[] _residents) {
        if (residents == null) {
            residents = new LinkedList<>();
        }

        for (int i = 0; i < _residents.length; i++) {
            residents.add(_residents[i]);
        }
    }

    public void removeResident() {

    }

    public void addResident() {

    }

    public int getNumberOfResidents() {
        return 1;
    }
}
