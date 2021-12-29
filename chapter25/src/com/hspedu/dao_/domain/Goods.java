package dao_.domain;

/**
 * @author A
 * @date 2021/12/29 - 12 - 29 - 19:05
 * dao_.domain
 */
public class Goods {
    private Integer id;
    private String goods_name;
    private Integer price;

    public Goods(){

    }

    public Goods(Integer id, String goods_name, Integer price) {
        this.id = id;
        this.goods_name = goods_name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", goods_name='" + goods_name + '\'' +
                ", price=" + price +
                '}';
    }
}
