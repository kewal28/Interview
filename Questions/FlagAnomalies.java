import java.io.*;
import java.util.*;

public class FlagAnomalies {

    public static void main(String[] args) {
        int n;
        LogsParser logs = new LogsParser();
        try (Scanner s = new Scanner(System.in)) {
            n = s.nextInt();
            if(n <=0) {
                System.out.println("Please enter a number greater than zero.");
                return;
            }
            for(int i =0; i <=n; i++) {
                String log = s.nextLine();
                if(log.length() > 0) {
                    logs.saveLogs(log);
                }
            }
            // System.out.println();
            // logs.getAllList();
            // System.out.println();
            logs.findLessThan(60);
        }
    }
}

class LogsParser {

    Map<String, Logs> logsList;
    public ArrayList<String> userList;
    public TreeSet<Integer> userSessionList = new TreeSet<Integer>(); 

    LogsParser() {
        this.logsList = new HashMap<String, Logs>();
        this.userList = new ArrayList<String>();
    }

    public void saveLogs(String log) {
        String[] logParase = log.split(";", 3);
        String key = logParase[0]+logParase[2];
        int userId = Integer.parseInt(logParase[0]);
        int sessionTime = Integer.parseInt(logParase[1]);
        String action = logParase[2];
        Logs _logs = new Logs(userId, sessionTime, action);
        this.logsList.put(key, _logs);
        if(!this.userList.contains(logParase[0])) {
            this.userList.add(logParase[0]);
        }
    }

    public void getAllList() {
        for(String userId: userList) {
            String signIn = userId+"SIGNIN";
            String signOut = userId+"SIGNOUT";
            if(this.logsList.containsKey(signIn) && this.logsList.containsKey(signOut)) {
                System.out.println( this.logsList.get(signIn).userId + " " + this.logsList.get(signIn).sessionTime+ " " + this.logsList.get(signIn).action);
                System.out.println( this.logsList.get(signOut).userId + " " + this.logsList.get(signOut).sessionTime+ " " + this.logsList.get(signOut).action);
            }
        }
    }

    public void findLessThan(int sec) {
        for(String userId: userList) {
            String signIn = userId+"SIGNIN";
            String signOut = userId+"SIGNOUT";
            if(this.logsList.containsKey(signIn) && this.logsList.containsKey(signOut)) {
                int _time = this.logsList.get(signOut).sessionTime - this.logsList.get(signIn).sessionTime;
                if(_time < sec) {
                    userSessionList.add(this.logsList.get(signOut).userId);
                }
            }
        }
        if(userSessionList.size() > 0) {
            Iterator<Integer> itr= userSessionList.iterator();  
            while(itr.hasNext()){  
                System.out.println(itr.next());
            } 
        } else {
            System.out.println("N/A");
        } 
    }
}

class Logs {
    public int userId;
    public int sessionTime;
    public String action;

    Logs(int userId, int sessionTime, String action) {
        this.userId = userId;
        this.sessionTime = sessionTime;
        this.action = action;
    }

}