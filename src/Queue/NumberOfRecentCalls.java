package Queue;

import java.util.ArrayList;

import static java.util.Collections.list;

class RecentCounter{
    int counter;

    public RecentCounter(){
        counter = 0;
    }

    public int ping(int t){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(t);
        while(list.get(counter) < t - 3000){
             return ++counter;
        }

        return list.size() - counter;
    }
}

public class NumberOfRecentCalls {
    public static void main(String[] args) {
        RecentCounter obj = new RecentCounter();

    }
}
