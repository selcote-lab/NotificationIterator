public class NotificationIterator implements Iterator {
    Notification[] notifications;
    int pos = 0;

    public NotificationIterator(Notification[] notifications) {
        this.notifications = notifications;
    }

    public Object next(){
        Notification notification = this.notifications[pos];
        pos += 1;
        return notification;
    }

    public boolean hasNext() {
        if(pos >= notifications.length || notifications[pos] == null){
            return false;
        }
        else
            return true;
    }
}
