package com.shuisechanggong.b_order;

import android.content.Context;
import android.content.Intent;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.shuisechanggong.b_order_sdk.IOrderService;
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
@Route(path = RouteRegistry.SERVICE_ORDER)
public class OrderService implements IOrderService {


    @Override
    public String sayHello(String name) {
        return "hello "+name;
    }

    @Override
    public void init(Context context) {

    }
}
