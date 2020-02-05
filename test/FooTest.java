import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FooTest {
    @Test
    void ShouldSayHello() {
        Foo foo = new Foo("Hello");

        foo.sayHello();

        assertEquals("Hello", foo.getHello());
    }
}