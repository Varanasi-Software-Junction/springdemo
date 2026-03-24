package live.learnwithchampak.demo.model;

public class GreetingForm {

    private String name;
    private String topic;
    private boolean wantsTemplates;

    public GreetingForm() {
        this.name = "Champak";
        this.topic = "Thymeleaf";
        this.wantsTemplates = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public boolean isWantsTemplates() {
        return wantsTemplates;
    }

    public void setWantsTemplates(boolean wantsTemplates) {
        this.wantsTemplates = wantsTemplates;
    }
}
