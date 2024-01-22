package observerpattern.notifysingleobserver;

public class MainOsP {
    public static void main(String[] args)throws CloneNotSupportedException  {

//        System.out.println("Hello world!");
//create subject
        MyTopicObservable topic = new MyTopicObservable();

        // first we will add one observer
        //create observers
        Observer observer1 = new MyTopicSubscriber("Obj1");


        //register observers to the subject
        topic.register(observer1);


        //attach observer to subject
        observer1.subScribeSubject(topic);


        //check if any update is available
        observer1.observe();

        //now send message to subject
        topic.postMessage("New Message0");
        topic.postMessage("New Message1");

        // here i will remove observer  // or un register
        topic.unregister(observer1);
        topic.postMessage("New Message2");





    }
}