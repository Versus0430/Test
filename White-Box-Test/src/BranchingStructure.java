import java.awt.*;
import java.util.List;

public class BranchingStructure {
    private String order;
    private List<String> orderList;

    /**
     * 向订单列表中添加新项
     */
    public boolean addOrder(String newOrder){
        // 不可以加入空字符串
        if(newOrder == null || newOrder.equals("")) {
            return false;
        }
        List<String> orderList = this.getOrderList();
        // 不可以添加重复订单
        for(String order:orderList) {
            if(order.equals(newOrder)) {
                return false;
            }
        }
        return true;
    }

    public String getOrder() {
        return this.order;

    }

    public void setOrder(String order) {
        this.order = order;
    }

    public List<String> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<String> orderList) {
        this.orderList = orderList;
    }
}
