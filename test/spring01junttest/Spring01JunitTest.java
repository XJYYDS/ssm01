package spring01junttest;

import org.junit.Test;

public class Spring01JunitTest {
    // 单元测式,在公司中, 自己先测试完毕. 请队友问问题的时候 一定要说,我junit 测试 没通过啊, bug是xxxx,你老哥能帮我看下么...
    @Test
    public void test01() {
        System.out.println("  1. 我是 单元测试, 在公司中, 单元测试 是 java程序员 的自己的 必须的测试, 用来测试" +
                "dao层 , controller 层 , 是否能正常运行 " +
                "" +
                "2. 单元测是的 写法, 必须是  @Test 注解 来自于 org.junit.Test 这个包,  必须是 void 静态  没有返回值的方法!!  " +
                "3. 方法名称 和 类名  最好 不可以 起   test()  Test.java" +
                "4. 单元测试 是用来 代替 main方法测试, main方法测试有一定的局限性, 例如:无法 测试 web项目,比如 项目request 等.  "

        );
    }

    // 反射: 是 在jvm 虚拟机的类加载中   .java  -------> class 文件  在这个 转换期间
    //  jvm 可以 看到 类的 所有的 信息, 比如 属性, 方法, 父类 , 接口 等
    // 即: 反射 对于任意一个对象 都能够调用出他的 任意方法 和属性 .
    // 这样的动态获取信息以及动态调用对象的方法的功能  叫做 java的反射机制,   不是 我们通俗讲的 镜面反射光线的反射.
    // 为什么要学反射?  因为反射就是 Spring框架的 底层实现
    // 为什么Spring框架要用到反射, 因为 反射可以解耦
    // 什么是解耦,       答:解耦就是 接触程序之间的耦合
    // 什么是耦合       答: 耦合就是程序之间过于依赖了.
    // 什么叫做依赖,    答 依赖是A程序调用B程序,  A程序中有B的方法调用


}
