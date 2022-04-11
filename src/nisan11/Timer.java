package nisan11;

import java.util.TimerTask;

public class Timer {
  
   
    
        public static void main(String[] args)
        {
            //javada timer oluşturma
            Timer timerDeneme=new Timer();
            //timertask oluşturma
            TimerTask sayacTimerTask =new TimerTask()
            {
                int sayi=0;
                @Override
                public void run()
                {
                    sayi++;
                    System.out.println(sayi+" mıslak");
                }
            };
            //1 saniyede bir çalış
            timerDeneme.schedule(sayacTimerTask,0,1000);
        }

    private void schedule(TimerTask sayacTimerTask, int i, int i1) {
    }
}
