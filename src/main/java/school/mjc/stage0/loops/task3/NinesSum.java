package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        int num = 0;
        for(int i = 1; i<= lengthOfLastNumber; i++){
            num = num*10+9;
            sum+=num;
        }
        System.out.println(sum);
    }
}
