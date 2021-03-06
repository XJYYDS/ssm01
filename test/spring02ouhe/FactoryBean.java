package spring02ouhe;

// 工厂类, 工厂模式 , spring 创建bean的底层  工厂模式
// 使用工厂模式, 代码更加灵活
//  单例模式,  已经经过6种常用2种
public class FactoryBean {
    public static Usb getInstance(String beanName) {
        Usb usb = null;
        if (beanName.equals("MyTv")) {
            usb = new MyTv();
        } else if (beanName.equals("Computer")) {
            usb = new Computer();
        } else if (beanName.equals("Mp4")) {
            usb = new Mp4();
        } else if (beanName.equals("Mp3")) {
            usb = new Mp4();
        } else if (beanName.equals("Mp5")) {
            usb = new Mp4();
        } else if (beanName.equals("Mp100")) {
            usb = new Mp4();
        }
        return usb;
        // 结论：大量new对象是造成耦合的关键,那么就需要一个框架来解决 new对象的耦合
        // 什么框架可以解决这个呢 ? spring , 为什么spring可以解决 new 对象的耦合呢 ?  ---> 底层的反射!!!!
    }
}
