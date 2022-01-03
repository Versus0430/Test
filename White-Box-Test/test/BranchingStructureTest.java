import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BranchingStructureTest {

    @Test
    void addOrder() {
        BranchingStructure b = new BranchingStructure();
        List<String> orderList = new ArrayList<>();
        orderList.add("订单1");
        orderList.add("订单2");
        b.setOrderList(orderList);
        String newOrder;
        // new order为null
        newOrder = null;
        assertFalse(b.addOrder(newOrder));
        // new order为空字符串
        newOrder = "";
        assertFalse(b.addOrder(newOrder));
        // new order出现重复项
        newOrder = "订单1";
        assertFalse(b.addOrder(newOrder));
        // new order未重复
        newOrder = "订单3";
        assertTrue(b.addOrder(newOrder));
    }
}
