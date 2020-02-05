public class Foo {
    private String hello;

    public Foo(String hello) {
        this.hello = hello;
    }

    public void sayHello() {
        System.out.println(this.hello);
    }

    public String getHello() {
        return this.hello;
    }
}
