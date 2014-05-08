package org.emmanueldemey;

import java.time.LocalDate;

public class IrregularObjective extends AbstractObjective{

    private LocalDate deadLine;

    public IrregularObjective(LocalDate creationDate, Boolean archived, Long objective, LocalDate deadLine, String category) {
        super(creationDate, archived, objective, category);
        this.deadLine = deadLine;
    }

    @Override
    public Boolean isAchieved() {
        return false;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {
        this.deadLine = deadLine;
    }
}
