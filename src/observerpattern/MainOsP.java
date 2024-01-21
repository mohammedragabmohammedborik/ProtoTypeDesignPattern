package observerpattern;

import prototypepattern.Employees;

import java.util.List;

public class MainOsP {
    public static void main(String[] args)throws CloneNotSupportedException  {

//        System.out.println("Hello world!");
//create subject
        MyTopicObservable topic = new MyTopicObservable();

        //create observers
        Observer obj1 = new MyTopicSubscriber("Obj1");


        //register observers to the subject
        topic.register(obj1);


        //attach observer to subject
        obj1.subScribeSubject(topic);


        //check if any update is available
        obj1.observe();

        //now send message to subject
        topic.postMessage("New Message");



    }
}