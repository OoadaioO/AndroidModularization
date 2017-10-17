package com.shuisechanggong.b_order;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.shuisechanggong.b_goods_sdk.IGoodsService;
import com.shuisechanggong.core_kernel.RouteRegistry;

@Route(path = RouteRegistry.PATH_ORDER_DETAIL)
public class OrderDetailActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_activity_order_detail);

        textView = (TextView) findViewById(R.id.text);
        findViewById(R.id.btn_goods).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IGoodsService service = ARouter.getInstance().navigation(IGoodsService.class);
                if (service == null) {
                    Toast.makeText(OrderDetailActivity.this, "服务未注册", Toast.LENGTH_SHORT).show();
                    return;
                }
                textView.setText(service.getGoodsInfo());

            }
        });
    }
}
