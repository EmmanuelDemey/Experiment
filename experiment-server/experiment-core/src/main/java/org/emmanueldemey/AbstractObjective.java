package org.emmanueldemey;

import java.time.LocalDate;
public class AbstractObjective implements Objective {

    private LocalDate creationDate;

    private Boolean archived;

    private Long objective;

    private Long current;

    private String category;

    @Override
    public Boolean isAchieved() {
        return false;
    }

    public AbstractObjective(LocalDate creationDate, Boolean archived, Long objective, String category) {

        if (creationDate == null) {
            //TODO Use the Spring Assert Statement
            throw new IllegalArgumentException("creationDate was null");
        }

        if (objective == null) {
            //TODO Use the Spring Assert Statement
            throw new IllegalArgumentException("objective was null");
        }

        this.creationDate = creationDate;
        this.archived = archived;
        this.objective = objective;
        this.category = category;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public Long getObjective() {
        return objective;
    }

    public void setObjective(Long objective) {
        this.objective = objective;
    }

    public Long getCurrent() {
        return current;
    }

    public void setCurrent(Long current) {
        this.current = current;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
