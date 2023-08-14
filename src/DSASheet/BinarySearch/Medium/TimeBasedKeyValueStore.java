package DSASheet.BinarySearch.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeBasedKeyValueStore {
    public static void main(String[] args) {
        System.out.println("Time Based Key-Value Store");
    }
    class TimeValue {
        String val;
        int timestamp;

        public TimeValue(String val, int time){
            this.val = val;
            timestamp = time;
        }
    }
    class TimeMap {
        Map<String, List<TimeValue>> map;
        public TimeMap() {
            map = new HashMap<>();
        }
        public void set(String key, String value, int timestamp) {
            map.computeIfAbsent(key, k-> new ArrayList<>()).add(new TimeValue(value, timestamp));
        }

        public String get(String key, int timestamp) {
            List<TimeValue> list = map.getOrDefault(key, null);
            if(list == null) return "";
            int start = 0, end = list.size()-1;
            if(list.get(start).timestamp > timestamp) return "";
            if(list.get(end).timestamp <= timestamp) return list.get(end).val;
            while(start <= end){
                int mid = start + ((end - start) / 2);
                if(list.get(mid).timestamp == timestamp) return list.get(mid).val;
                if(list.get(mid).timestamp < timestamp) start = mid + 1;
                else end = mid - 1;

            }
            return list.get(start - 1).val;
        }
    }
}
