import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int c;
        try (Scanner s = new Scanner(System.in)) {
            c = s.nextInt();
            if(c < 0) {
                System.out.println("Please enter a number greater than zero.");
                return;
            }
            User user = new User(c);
            for(int i =0; i <c; i++) {
                int _lottryNo = s.nextInt();

                user.addUserIntoQueue(i, _lottryNo);
            }
            user.allocatedPendingLottery();
            System.out.println();
            user.printdLotry();
        }
    }
}

class User {
    int[] userList;
    public ArrayList<Integer> alreadySold;

    public Map<Integer, Integer> soldLottery;
    public Map<Integer, Integer> needLottery;

    int currentLottery = 1;

    User(int length) {
        userList = new int[length];
        alreadySold = new ArrayList<>(); 

        soldLottery = new HashMap<Integer, Integer>();
        needLottery = new HashMap<Integer, Integer>();
    }

    public void addUserIntoQueue(int _key, int _lottryNo) {
        if(!this.soldLottery.containsKey(this.currentLottery)) {
            this.soldLottery.put(this.currentLottery, _key);
            this.userList[_key] = this.currentLottery;
            this.currentLottery = this.currentLottery+1;
        } else {
            this.needLottery.put(_lottryNo, _key);
            this.alreadySold.add(_lottryNo);
        }
    }

    public void allocatedPendingLottery() {
        for(int i=0; i<this.alreadySold.size(); i++) {
            int lottryKey = this.needLottery.get(this.alreadySold.get(i));
            this.currentLottery = this.currentLottery+1;
            this.userList[lottryKey] = this.currentLottery;
        }
    }
    
    public void printdLotry() {
        for(int i=0; i<this.userList.length; i++) {
            System.out.println(this.userList[i]);
        }
    }

    // public void printUnsoledLotry() {
    //     for(int i=0; i<this.alreadySold.size(); i++) {
    //         System.out.println(this.alreadySold.get(i));
    //     }
    // }

}