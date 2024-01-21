package observerpattern;

public class MyTopicObservable implements Subject {

    private Observer observer;
    private String message;
    private boolean changed;
    private final Object MUTEX= new Object();

    public MyTopicObservable(){
        this.observer=null;
    }
    @Override
    public void register(Observer obj) {
        if(obj == null) throw new NullPointerException("Null Observer");
        synchronized (MUTEX) {
            this.observer=obj;
        }
    }

    @Override
    public void unregister(Observer obj) {
        synchronized (MUTEX) {
            this.observer=null;        }
    }

    @Override
    public void notifyObservers() {
        //synchronization is used to make sure any observer registered after message is received is not notified
        synchronized (MUTEX) {
            if (!changed)
                return;

            this.changed = false;


            this.observer.observe();


        }
    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.message;
    }

    //method to post message to the topic
    public void postMessage(String msg){
        System.out.println("Message Posted to Topic:"+msg);
        this.message=msg;
        this.changed=true;
        notifyObservers();
    }

}
