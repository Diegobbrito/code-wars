public class RemoveChars {

    public static boolean validatePin(String pin) {

        if(!pin.matches("^[0-9]*$")){
            return false;
        }
        return (pin.length() == 4 || pin.length() == 6) ? true : false;
    }

}