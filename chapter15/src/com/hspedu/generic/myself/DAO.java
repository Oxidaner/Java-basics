package com.hspedu.generic.myself;

import java.util.*;

/**
 * @Author: zhangshibin
 * @Date: 2021/11/6 - 11 - 06 - 10:58
 * @Description: com.hspedu.generic.myself
 */
/**
 * @author 韩顺平
 * @version 1.0
 * 定义个泛型类 DAO<T>，在其中定义一个Map 成员变量，Map 的键为 String 类型，值为 T 类型。
 *  *
 *  * 分别创建以下方法：
 *  * (1) public void save(String id,T entity)： 保存 T 类型的对象到 Map 成员变量中
 *  * (2) public T get(String id)：从 map 中获取 id 对应的对象
 *  * (3) public void update(String id,T entity)：替换 map 中key为id的内容,改为 entity 对象
 *  * (4) public List<T> list()：返回 map 中存放的所有 T 对象
 *  * (5) public void delete(String id)：删除指定 id 对象
 */
public class DAO<T> {
    private Map<String,T> map = new HashMap<>();
    public void save(String id, T entity){
        map.put(id, entity);
    }
    public T get(String id) {
        return map.get(id);
    }
    public void update(String id,T entity){
        map.put(id, entity);
    }
    public List<T> list() {
        //创建ArrayList封装
        ArrayList<T> List = new ArrayList<>();
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            List.add(get(key));
        }
        return List;
    }
    public void delete(String id) {
        map.remove(id);
    }
}
