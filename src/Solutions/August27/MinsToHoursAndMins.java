package Solutions.August27;

public class MinsToHoursAndMins {
    public static void main(String[] args) {

        int totalMinutes = 135;
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

        System.out.println(totalMinutes + " Minutes in hours and minutes is " + hours + " Hours and " + minutes + " Minutes");
    }
}
