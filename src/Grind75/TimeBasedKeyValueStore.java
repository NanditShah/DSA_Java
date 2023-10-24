package Grind75;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TimeBasedKeyValueStore {
    public static void main(String[] args) {
        System.out.println("Time Based Key-Value Store");
    }

    class TimeValue{
        String value;
        int timestamp;

        public TimeValue(String value, int timestamp) {
            this.value = value;
            this.timestamp = timestamp;
        }
    }
    class TimeMap {

        HashMap<String, List<TimeValue>> hMap;
        public TimeMap() {
            hMap = new HashMap<>();
        }

        public void set(String key, String value, int timestamp) {
            if(!hMap.containsKey(key)) hMap.put(key,new ArrayList<>());
            hMap.get(key).add(new TimeValue(value,timestamp));
        }

        public String get(String key, int timestamp) {
            if(!hMap.containsKey(key)) return "";
            List<TimeValue> listOfTimeValues = hMap.get(key);
            int start = 0,end = listOfTimeValues.size() - 1;
            if(timestamp < listOfTimeValues.get(start).timestamp) return "";
            else if(timestamp >= listOfTimeValues.get(end).timestamp) return listOfTimeValues.get(end).value;

            while(start <= end){
                int mid = start + ((end - start)/2);
                if(listOfTimeValues.get(mid).timestamp == timestamp) return listOfTimeValues.get(mid).value;
                else if(listOfTimeValues.get(mid).timestamp > timestamp) end = mid - 1;
                else start = mid + 1;
            }
            return listOfTimeValues.get(start-1).value;
        }
    }
}
