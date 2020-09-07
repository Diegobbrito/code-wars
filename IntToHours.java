public class IntToHours {
    public static String makeReadable(int seconds) {
        // Do something
        var hours = seconds/3600;
        int minutes = (seconds%3600)/60;
        int second = (seconds%3600)%60;
        return Integer.toString(hours).replaceAll("(^-?\\d{1}$)", "0$1") + ":" + Integer.toString(minutes).replaceFirst("(^-?\\d{1}$)", "0$1") + ":" + Integer.toString(second).replaceFirst("(^-?\\d{1}$)", "0$1");
    }

    public static void main(String[] args) {
        makeReadable(0);
    }
}
