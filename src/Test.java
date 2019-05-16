public class Test {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        int sum=0;
        for (int i = 0 ; i < 1000000000; i++){
            sum+=i;
        }
        stopWatch.end();
        long time = stopWatch.getEclapsedTime();
        System.out.println("the time eclapsed in millisecond  is " + time);
    }
}
