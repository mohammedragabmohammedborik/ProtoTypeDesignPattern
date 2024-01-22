package observerpattern.notifysingleobserver;

public class MyTopicObservable implements Subject {

    private Observer observer;
    private String message;
    private boolean changed;

    public MyTopicObservable(){
        this.observer=null;
    }
    @Override
    public void register(Observer obj) {
        if(obj == null) throw new NullPointerException("Null Observer");
            this.observer=obj;

    }

    @Override
    public void unregister(Observer obj) {
            this.observer=null;

    }

    @Override
    public void notifyObservers() {
            if (!changed)
                return;

            this.changed = false;

if (this.observer!=null) {
    this.observer.observe();
}



    }

    @Override
    public Object getUpdate( ) {
        return this.message;
    }

    //method to post message to the topic
    public void postMessage(String msg){
       // System.out.println("Message Posted to Topic:"+msg);
        this.message=msg;
        this.changed=true;
        notifyObservers();
    }

}
