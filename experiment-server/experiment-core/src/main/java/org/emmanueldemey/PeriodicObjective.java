package org.emmanueldemey;

import java.time.LocalDate;
import java.time.Period;

public class PeriodicObjective extends AbstractObjective{

    private Period period;

    public PeriodicObjective(LocalDate creationDate, Boolean archived, Long objective, Period period, String category) {
        super(creationDate, archived, objective, category);
        this.period = period;
    }

    @Override
    public Boolean isAchieved() {
        return false;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }
}
