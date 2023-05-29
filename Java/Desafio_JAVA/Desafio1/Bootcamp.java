package Desafio_JAVA.Desafio1;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String name;
    private String describe;
    private final LocalDate initialDate = LocalDate.now();
    private final LocalDate finalDate = initialDate.plusDays(45);
    private Set<Dev> subscribedDev = new HashSet<>();
    private Set<Content> contents = new LinkedHashSet<>();

    public String getName() {
        return name;
    }

    public String getDescribe() {
        return describe;
    }

    public LocalDate getInitialDate() {
        return initialDate;
    }

    public LocalDate getFinalDate() {
        return finalDate;
    }

    public Set<Dev> getSubscribedDev() {
        return subscribedDev;
    }

    public Set<Content> getContents() {
        return contents;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public void setSubscribedDev(Set<Dev> subscribedDev) {
        this.subscribedDev = subscribedDev;
    }

    public void setContents(Set<Content> contents) {
        this.contents = contents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) && Objects.equals(describe, bootcamp.describe) && Objects.equals(initialDate, bootcamp.initialDate) && Objects.equals(finalDate, bootcamp.finalDate) && Objects.equals(subscribedDev, bootcamp.subscribedDev) && Objects.equals(contents, bootcamp.contents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, describe, initialDate, finalDate, subscribedDev, contents);
    }
}
