

public class getBattery {
    public getBattery(Integer[] events, Integer battery) {
    }

    public static Integer getBattery(Integer[] events, Integer battery, int i) {
        for (i = 0; i < events.length; i++) {
            if (events[i] > 0) {
                battery = battery + events[i];
                if (battery > 100) {
                    battery = 100;
                } else if (events[i] < 0) {
                    battery = battery + events[i];
                    if (battery < 0) {
                        battery = 0;
                    }
                } else {
                    battery = battery + 0;
                }
                System.out.println("Após esse evento, foi consumido " + events[i] + "% de bateria e o restante de bateria foi de " + battery + "% de bateria!");
            }
            
        }
        return battery;
    }
}