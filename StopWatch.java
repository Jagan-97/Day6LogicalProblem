public class StopWatch {
    public static void main(String args[]){
        for(int hours = 0; hours < 1; hours++)
        {
            // 60 mins in an hours
            for(int minutes = 0; minutes < 60; minutes++)
            {
                // 60 secs in a min
                for(int seconds = 0; seconds < 60; seconds++)
                {
                    // 1000 ms in a sec.
                    for(int ms = 0; ms < 1000; ms++)
                    {
                        System.out.println(hours + ":" + minutes + ":" + seconds + "." + ms);
                    }
                }
            }
        }
    }
}
