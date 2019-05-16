import java.util.Date;

public class StopWatch {
    private Date startTime;
    private Date endTime;

    public StopWatch() {
        startTime = new Date();
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }
    public void start(){
        startTime = new Date();
    }
    public void end(){
        endTime = new Date();
    }
    public long getEclapsedTime(){
        return endTime.getTime()-startTime.getTime();
    }

}
