package Proxy_test;

public class HelloImp implements Hello {
    @Override
    public String sayHello(String str) {
        return "HelloImp: " + str;
    }

}
