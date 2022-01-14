package at.htlleonding.syp;

import java.util.LinkedList;

public class Building {
    private Integer id;
    private LinkedList<String> residents = new LinkedList<>();;

    public Building(String _resident) {
        residents.add(_resident);
    }

    public Building(String[] _residents) {
        for (int i = 0; i < _residents.length; i++) {
            residents.add(_residents[i]);
        }
    }

    public void removeResident(String name) {
        if (containsResident(name)) {
            residents.remove(name);
        }
    }

    public void addResident(String name) {
        residents.add(name);
    }

    public boolean containsResident(String name) {
        return residents.contains(name);
    }

    public int getNumberOfResidents() {
        return residents.size();
    }
}
