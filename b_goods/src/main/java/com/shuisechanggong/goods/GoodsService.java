package com.shuisechanggong.goods;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.shuisechanggong.b_goods_sdk.IGoodsService;
import com.shuisechanggong.core_kernel.RouteRegistry;

/**
 * <pre>
 *     author : xb
 *     e-mail : xubo@idongjia.cn
 *     time   : 2017/10/16
 *     desc   :
 *     version: 1.0
 * </pre>
 */
@Route(path = RouteRegistry.SERVICE_GOODS)
public class GoodsService implements IGoodsService {

    @Override
    public String getGoodsInfo() {
        return "name:你猜\nprice:15\ncount:5";
    }

    @Override
    public void init(Context context) {

    }
}
