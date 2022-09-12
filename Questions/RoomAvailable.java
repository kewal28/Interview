import java.util.*;

public class RoomAvailable {
    
    static ArrayList<Integer> capicity = new ArrayList<Integer>();

    public static void main(String[] args) {
        int t, c;
        try (Scanner s = new Scanner(System.in)) {
            t = s.nextInt();
            if(t < 0) {
                System.out.println("Please enter a number greater than zero.");
                return;
            }
            c = s.nextInt();
            if(c <=0) {
                System.out.println("Please enter a number greater than zero.");
                return;
            }
            Room room = new Room(c);
            for(int i =0; i <c; i++) {
                int _capicity = s.nextInt();
                room.addRoomCapicity(i, _capicity);
            }
            // System.out.println();
            room.sortRoom();
            // System.out.println();
            // room.printRooms();
            int totalRoom = room.getRooms(t);
            System.out.println(totalRoom);
        }
    }
}

class Room {
    int[] capicity;
    static int roomCount = 0;

    Room(int length) {
        capicity = new int[length];
    }

    public void addRoomCapicity(int _key, int _capicity) {
        this.capicity[_key] = _capicity;
    }

    public int getRooms(int n) {
        if(n < 0 && !roomAvailable()) return -1;
        if(n == 0) return roomCount;
        int low = 0;
        int high = this.capicity.length-1;
        int leftRoom = n;
        while(low <= high) {
            if(findRoom(leftRoom) > -1) {
                return roomCount = roomCount+1;
            } else {
                if(this.capicity[high] > 0 && leftRoom > 0) {
                    if(this.capicity[high] <= n) {
                        leftRoom = leftRoom - this.capicity[high];
                        this.capicity[high] = 0;
                        roomCount = roomCount+1;
                        high--;
                    }
                } else {
                    high--;
                }
            }
        }
        if(leftRoom > 0) {
            return -1;
        }
        return roomCount;
    }

    public int findRoom(int n) {
        for(int i=0; i<this.capicity.length; i++) {
            if(this.capicity[i] == n) {
                return 1;
            }
        }
        return -1;
    }

    public void sortRoom() {
        int n = this.capicity.length;
        int right = n-1;
        int left = 0;
        int[] _return = new int[n];
        for(int x=n-1;x>=0; x--) {
            if(this.capicity[left] > this.capicity[right]) {
                _return[x] = this.capicity[left];
                left++;
            } else {
                _return[x] = this.capicity[right];
                right--;
            }
        }
        this.capicity = _return;
    }

    public void printRooms() {
        for(int i=0; i<this.capicity.length; i++) {
            System.out.println(this.capicity[i]);
        }
    }

    public boolean roomAvailable() {
        boolean roomAvailable = false;
        for(int i=0; i<this.capicity.length; i++) {
            if(this.capicity[i] > 0) {
                roomAvailable = true;
                break;
            }
        }
        return roomAvailable;
    }

}