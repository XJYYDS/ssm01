package spring02ouhe;

public class BeanOu {
    public static Usb getInstance(String OuName) {
        Usb usb = null;
        if (OuName.equals("MyTv")) {
            usb = new MyTv();
        } else if (OuName.equals("Computer")) {
            usb = new Computer();
        } else if (OuName.equals("Mp4")) {
            usb = new Mp4();
        } else if (OuName.equals("Mp3")) {
            usb = new Mp4();
        } else if (OuName.equals("Mp5")) {
            usb = new Mp4();
        } else if (OuName.equals("Mp100")) {
            usb = new Mp4();
        }
        return usb;

    }
}
