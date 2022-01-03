import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CyclicStructureTest {

    @Test
    void printOrder() {
        // 空字符串
        SequentialStructure s1 = new SequentialStructure();
        s1.setOrder("");
        assertEquals("订单信息为: ", s1.printOrder());
        // 常规订单信息
        SequentialStructure s2 = new SequentialStructure();
        s2.setOrder("2斤蔬菜,2斤牛肉");
        assertEquals("订单信息为: 2斤蔬菜,2斤牛肉", s2.printOrder());
        // 仅包含一个空格
        SequentialStructure s3 = new SequentialStructure();
        s3.setOrder(" ");
        assertEquals("订单信息为:  ", s3.printOrder());
    }
}
