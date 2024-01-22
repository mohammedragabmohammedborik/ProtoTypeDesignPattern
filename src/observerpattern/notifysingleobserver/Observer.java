package observerpattern.notifysingleobserver;

public interface Observer {
    //method to update the observer, used by subject
    public void observe();

    //attach with subject to observe
    public void subScribeSubject(Subject sub);
}
