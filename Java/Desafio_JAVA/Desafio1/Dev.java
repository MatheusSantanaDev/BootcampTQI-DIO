package Desafio_JAVA.Desafio1;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Content> subscribedContent = new LinkedHashSet<>();
    private Set<Content> completedContent = new LinkedHashSet<>();

    public void subscribeBootcamp(Bootcamp bootcamp){
        this.subscribedContent.addAll(bootcamp.getContents());
        bootcamp.getSubscribedDev().add(this);
    }

    public void progress(){
        Optional<Content> content = this.subscribedContent.stream().findFirst();
        if(content.isPresent()){
            this.completedContent.add(content.get());
            this.subscribedContent.remove(content.get());
        }
        else System.out.println("You are registered in none content");
    }

    public double calculateAllXP(){
        return this.completedContent.stream().mapToDouble(Content::calculateXP).sum();
    }

    public String getName() {
        return name;
    }

    public Set<Content> getSubscribedContent() {
        return subscribedContent;
    }

    public Set<Content> getCompletedContent() {
        return completedContent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubscribedContent( Set<Content> subscribedContent) {
        this.subscribedContent = subscribedContent;
    }

    public void setCompletedContent(Set<Content> contentCompleted) {
        this.completedContent = contentCompleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(subscribedContent, dev.subscribedContent) && Objects.equals(completedContent, dev.completedContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subscribedContent, completedContent);
    }
}
