package DSASheet.Graph.Easy;

import java.util.*;

public class EmployeeImportance {
    public static void main(String[] args) {
        System.out.println("Employee Importance");
    }

    class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    };

    public int getImportance(List<Employee> employees, int id) {

        Map<Integer,List<Integer>> subOrdinates = new HashMap<>();
        Map<Integer,Integer> importance = new HashMap<>();

        for(Employee emp : employees){
            if(emp.subordinates.size() > 0){
                subOrdinates.put(emp.id,emp.subordinates);
            }
            importance.put(emp.id,emp.importance);
        }

        if(!subOrdinates.containsKey(id)) {
            importance.get(id);
        }

        Queue<Integer> helperQueue = new LinkedList<>();
        helperQueue.add(id);

        int ans = 0;
        while(!helperQueue.isEmpty()){
            int topId = helperQueue.remove();
            ans += importance.get(topId);
            if(subOrdinates.containsKey(topId)){
                for(int subOrdinate : subOrdinates.get(topId)){
                    helperQueue.add(subOrdinate);
                }
            }
        }
        return ans;
    }
}
