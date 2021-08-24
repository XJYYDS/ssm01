package spring02ouhe;

public class Beantext {
    public static Usb getInstance(String beanName) {

        Usb usb = null;
        try {
            usb = (Usb) Class.forName(beanName).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return usb;
    }
}

