package Assignments.Easy;

import java.util.Arrays;

public class AverageSalaryExcludingTheMinimumAndMaximumSalary {
    public static void main(String[] args) {
        System.out.println("Average Salary Excluding the Minimum and Maximum Salary");
        int[] salaries = {48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000};
        double ans = average(salaries);
        System.out.println(ans);
    }

    static double average(int[] salary) {
        Arrays.sort(salary);
        double sumExcludingMinAndMax = salary[1];
        for(int i = 2;i < salary.length-1;i++){
            sumExcludingMinAndMax += salary[i];
        }
        return sumExcludingMinAndMax/(salary.length - 2);
    }
}
