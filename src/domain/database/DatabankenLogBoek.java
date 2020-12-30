package domain.database;

import domain.model.LogObject;

import java.util.ArrayList;

public class DatabankenLogBoek {
    private ArrayList<LogObject>logs;

    public DatabankenLogBoek(){
        logs = new ArrayList<>();
    }

    public ArrayList<LogObject> getLogs() {
        return logs;
    }

    public void addLog(LogObject logObject){
        if (logObject == null)throw new IllegalArgumentException("er is iets fout met het logboek in de databanken logboek java");
        logs.add(logObject);
    }
}
