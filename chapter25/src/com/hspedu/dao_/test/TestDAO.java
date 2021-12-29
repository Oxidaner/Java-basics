package dao_.test;

import com.hspedu.dao_.domain.Actor;
import dao_.dao.ActorDAO;
import dao_.dao.GoodsDAO;
import dao_.domain.Goods;
import org.junit.Test;

import java.util.List;

/**
 * @author 韩顺平
 * @version 1.0
 */
public class TestDAO {

    //测试ActorDAO 对actor表crud操作
    @Test
    public void testActorDAO() {

        ActorDAO actorDAO = new ActorDAO();
        //1. 查询
        List<Actor> actors = actorDAO.queryMulti("select * from actor where id >= ?", Actor.class, 1);
        System.out.println("===查询结果===");
        for (Actor actor : actors) {
            System.out.println(actor);
        }

        //2. 查询单行记录
        Actor actor = actorDAO.querySingle("select * from actor where id = ?", Actor.class, 6);
        System.out.println("====查询单行结果====");
        System.out.println(actor);

        //3. 查询单行单列
        Object o = actorDAO.queryScalar("select name from actor where id = ?", 6);
        System.out.println("====查询单行单列值===");
        System.out.println(o);

        //4. dml操作  insert ,update, delete
        int update = actorDAO.update("insert into actor values(null, ?, ?, ?, ?)", "张无忌", "男", "2000-11-11", "999");

        System.out.println(update > 0 ? "执行成功" : "执行没有影响表");




    }
    @Test
    public void testGoodsDAO() {
        GoodsDAO goodsDAO = new GoodsDAO();
        //1. 查询
        List<Goods> goods = goodsDAO.queryMulti("select * from Goods where id >= ?", Goods.class, 1);
        System.out.println("====查询结果====");
        for (Object good : goods) {
            System.out.println(good);
        }

        //2. 查询单行
        Goods good = goodsDAO.querySingle("select * from Goods where id = ? ", Goods.class, 30);
        System.out.println("====查询结果====");
        System.out.println(good);

        //3. 查询多行
        Object o = goodsDAO.queryScalar("select goods_name from Goods where id = ? ", 40);
        System.out.println("====查询结果====");
        System.out.println(o);

        //4.dml操作
        int update = goodsDAO.update("insert into Goods values(?,?,?)","1","华为","10000");
        if (update>0) {
            System.out.println("成功");
        }
    }
}
