package com.shuisechanggong.goods;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.callback.NavigationCallback;
import com.alibaba.android.arouter.launcher.ARouter;
import com.shuisechanggong.b_goods_sdk.IGoodsService;
import com.shuisechanggong.core_kernel.RouteRegistry;

@Route(path = RouteRegistry.PATH_GOODS_DETAIL)
public class GoodsDetailActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goods_activity_goods);

        textView = (TextView) findViewById(R.id.content);
        findViewById(R.id.btn_order_detail).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ARouter.getInstance().build(RouteRegistry.PATH_ORDER_DETAIL).navigation(GoodsDetailActivity.this, new NavigationCallback() {
                    @Override
                    public void onFound(Postcard postcard) {

                    }

                    @Override
                    public void onLost(Postcard postcard) {
                        Toast.makeText(GoodsDetailActivity.this,"该模块未初始化",Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onArrival(Postcard postcard) {

                    }

                    @Override
                    public void onInterrupt(Postcard postcard) {

                    }
                });
            }
        });

        findViewById(R.id.btn_goods_info).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IGoodsService service = ARouter.getInstance().navigation(IGoodsService.class);
                textView.setText(service.getGoodsInfo());

            }
        });
    }
}
