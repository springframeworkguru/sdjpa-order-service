package guru.springframework.orderservice.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class OrderHeaderTest {

    @Test
    void testEquals() {
        OrderHeader oh1 = new OrderHeader();
        oh1.setId(1L);

        OrderHeader oh2 = new OrderHeader();
        oh2.setId(1L);

        assert oh1.equals(oh2);
    }

    @Test
    void testNotEquals() {
        OrderHeader oh1 = new OrderHeader();
        oh1.setId(1L);

        OrderHeader oh2 = new OrderHeader();
        oh2.setId(3L);

        assertFalse( oh1.equals(oh2));
    }
}