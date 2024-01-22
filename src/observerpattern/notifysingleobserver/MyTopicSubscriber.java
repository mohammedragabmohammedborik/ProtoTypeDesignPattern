package observerpattern.notifysingleobserver;

public class MyTopicSubscriber implements Observer {

    private String name;
    private Subject topic;

    public MyTopicSubscriber(String nm){
        this.name=nm;
    }
    @Override
    public void observe() {
        String msg = (String) topic.getUpdate();
        if(msg == null){
            System.out.println(name+":: No new message");
        }else
            System.out.println(name+":: Consuming message::"+msg);
    }

    @Override
    public void subScribeSubject(Subject sub) {

        this.topic=sub;

    }

}
