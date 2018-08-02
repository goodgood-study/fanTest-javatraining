package com.example.demo.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.service.IFoodService;

/**
 * @Author: FAN
 * @Description:TODO
 * @Date: Create in 17:11 2018/7/31
 * @Modify By:
 **/
public class FoodServiceImpl implements IFoodService {
    private JSONObject firstObject;
    private JSONObject secondObject;
    private JSONObject thirdObject;
    private JSONObject fourthObject;
    private JSONObject fivethObject;
    private JSONArray firstArry;
    private JSONArray secondArry;
    private JSONArray thirdArry;
    private JSONArray fourthArry;

    @Override
    public JSON showFoods() {
        firstObject = new JSONObject();
        secondObject = new JSONObject();
        thirdObject = new JSONObject();
        fourthObject = new JSONObject();
        fivethObject = new JSONObject();
        firstArry = new JSONArray();
        secondArry = new JSONArray();
        thirdArry = new JSONArray();
        fourthArry = new JSONArray();
        firstObject.put("code",0);
        firstObject.put("msg","成功");
        firstObject.put("data",firstArry);
        firstArry.add(secondObject);
        firstArry.add(fourthObject);
        secondObject.put("name","热榜");
        secondObject.put("type",1);
        secondObject.put("foods",secondArry);

        thirdObject.put("id","123456");
        thirdObject.put("name","皮蛋粥");
        thirdObject.put("price",1.2);
        thirdObject.put("decription","好吃的皮蛋粥");
        thirdObject.put("icon","http://xxx.com");

        secondArry.add(thirdObject);

        fourthObject.put("name","好吃的");
        fourthObject.put("type",2);
        fourthObject.put("foods",thirdArry);

        fivethObject.put("id","123457");
        fivethObject.put("name","慕斯蛋糕");
        fivethObject.put("price",10.9);
        fivethObject.put("decription","美味爽口");
        fivethObject.put("icon","http://xxx.com");

        thirdArry.add(fivethObject);

        return firstObject;
    }
}
