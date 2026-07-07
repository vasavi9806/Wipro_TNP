public class VideoStore {
    private Video[] store;
    private int videoCount;

    // Constructor initializing an array (e.g., maximum capacity of 10 videos)
    public VideoStore() {
        store = new Video[10];
        videoCount = 0;
    }

    public void addVideo(String name) {
        if (videoCount < store.length) {
            store[videoCount] = new Video(name);
            videoCount++;
            System.out.println("Video \"" + name + "\" added successfully.");
        } else {
            System.out.println("Store inventory is full! Cannot add more videos.");
        }
    }

    public void doCheckout(String name) {
        boolean found = false;
        for (int i = 0; i < videoCount; i++) {
            if (store[i].getName().equalsIgnoreCase(name)) {
                store[i].doCheckout();
                System.out.println("Video \"" + name + "\" checked out successfully.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Video \"" + name + "\" not found in the store.");
        }
    }

    public void doReturn(String name) {
        boolean found = false;
        for (int i = 0; i < videoCount; i++) {
            if (store[i].getName().equalsIgnoreCase(name)) {
                store[i].doReturn();
                System.out.println("Video \"" + name + "\" returned successfully.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Video \"" + name + "\" not found.");
        }
    }

    public void receiveRating(String name, int rating) {
        boolean found = false;
        for (int i = 0; i < videoCount; i++) {
            if (store[i].getName().equalsIgnoreCase(name)) {
                store[i].receiveRating(rating);
                System.out.println("Rating \"" + rating + "\" has been mapped to the Video \"" + name + "\".");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Video \"" + name + "\" not found.");
        }
    }

    public void listInventory() {
        if (videoCount == 0) {
            System.out.println("Inventory is empty.");
            return;
        }
        System.out.println("--------------------------------------------------------");
        System.out.printf("%-20s | %-20s | %-10s\n", "Video Name", "Checkout Status", "Rating");
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < videoCount; i++) {
            System.out.printf("%-20s | %-20b | %-10d\n", 
                store[i].getName(), 
                store[i].getCheckout(), 
                store[i].getRating());
        }
        System.out.println("--------------------------------------------------------");
    }
}