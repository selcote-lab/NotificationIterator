public interface Collection {
    public Iterator createIterator();
}

class NotificationCollection implements Collection {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    Notification [] notifications;

    public NotificationCollection(){
        this.notifications = new Notification [MAX_ITEMS];
        addItem("Notification  1");
        addItem("Notification 2");
        addItem("Notification 3");
    }

    public void addItem(String item){
        if(this.notifications.length > MAX_ITEMS){
            System.err.println("Full");
        }
        else {
            this.notifications[numberOfItems] = new Notification(item);
            this.numberOfItems++;
        }
    }

    public Iterator createIterator(){
        return new NotificationIterator(this.notifications);
    }
}
