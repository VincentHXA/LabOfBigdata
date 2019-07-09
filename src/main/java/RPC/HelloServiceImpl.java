package RPC;

public class HelloServiceImpl implements HelloService{
    public String hello(String name) {
        return "Hello " + name;
    }

    public String hi(String msg) {
        return "Hi, " + msg;
    }
}
