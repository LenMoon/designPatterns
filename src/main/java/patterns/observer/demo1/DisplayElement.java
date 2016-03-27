package patterns.observer.demo1;

/**
 * Created by liumeng on 2016/3/27.
 */
public interface DisplayElement {

    void display();

    class SimplePrint{
        public static void print(String name,DisplayElement displayElement){
            System.out.println("我是： "+name+" 我只把信息打出来，想要什么结果自己算吧！ "+displayElement.toString());
        }
    }
}
