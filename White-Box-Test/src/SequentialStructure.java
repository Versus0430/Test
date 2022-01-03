import java.util.List;

public class SequentialStructure {
    private String order;

    /**
     * 返回订单信息
     * @return 订单信息
     */
    public String printOrder() {
        String info;
        String order = getOrder();
        info = "订单信息为: " + order;
        return info;
    }

    public String getOrder() {
        return this.order;

    }

    public void setOrder(String order) {
        this.order = order;
    }

}
