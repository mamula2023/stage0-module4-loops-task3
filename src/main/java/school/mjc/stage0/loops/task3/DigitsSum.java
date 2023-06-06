package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int sum = 0;
        t = t < 0? -t: t;
        while(t>0){
            int nextDigit = t%10;
            t /= 10;
            sum+=nextDigit;
        }
        System.out.println(sum);
    }
}
