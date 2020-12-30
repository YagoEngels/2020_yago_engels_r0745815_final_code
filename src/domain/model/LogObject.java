package domain.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class LogObject {

    private LocalDate date;
    private LocalTime time;
    private String page;
    private String activity;

    public LogObject(String pagina , String activiteit){
        if (pagina.trim().isEmpty() || pagina == null)throw new IllegalArgumentException("er is iets mis met de pagina in het logboek object");
        if (activiteit.trim().isEmpty() || activiteit == null)throw new IllegalArgumentException("er is iets mis met de activiteit in het logboek object");
        date = LocalDate.now();
        time = LocalTime.now();
        page = pagina;
        activity = activiteit;
    }

    public String getPage() {
        return page;
    }

    public String getActivity() {
        return activity;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }
}
