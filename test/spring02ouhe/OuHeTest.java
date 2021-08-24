package spring02ouhe;

import org.junit.Test;

public class OuHeTest {
    // 创建几个类, 模拟耦合
    @Test
    public void test01() {
        // 如果使用电脑传数据
        // Computer computer = new Computer();
        // computer.usbData();  // 将来要改 Computer
        // 如果用 电视传输数据
        // MyTv myTv = new MyTv();
        // myTv.usbData();

        // 更新接口后, 代码优化了, 解耦 1次
        //  Usb u= new Computer();
        // Usb u= new Mp4();
        //  u.usbData();
        // 需求1: 现在  new Computer();  new MyTv(); 都有 usbData的功能.
        Usb u = FactoryBean.getInstance("Computer");
        u.usbData();


    }
}
