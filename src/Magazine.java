/**
 * Created by RobertBarber on 4/6/16.
 */
public class Magazine {

    String magName;
    String magTopic;
    boolean childMag;
    int pages;
    int subscribers;

    public Magazine() {

    }

    @Override
    public String toString() {
        return String.format("Name: %s,\nTopic: %s,\nFor Children: (%s)," +
                "\nPages: %s,\nSubscribers: %s",
                magName, magTopic, childMag, pages, subscribers);
    }

    public String getMagName() {
        return magName;
    }

    public void setMagName(String magName) {
        this.magName = magName;
    }

    public String getMagTopic() {
        return magTopic;
    }

    public void setMagTopic(String magTopic) {
        this.magTopic = magTopic;
    }

    public boolean isChildMag() {
        return childMag;
    }

    public void setChildMag(boolean childMag) {
        this.childMag = childMag;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(int subscribers) {
        this.subscribers = subscribers;
    }
}
