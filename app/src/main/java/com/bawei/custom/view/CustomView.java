package com.bawei.custom.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * 1. 类的用途 自定义控件直正是三硒
 * 2. @author forever
 * 3. @date 2017/3/29 09:24
 */

public class CustomView extends View {

    private float currentX = 40;
    private float currentY = 50;

    public CustomView(Context context) {
        super(context);
    }

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //设置画布的背景颜色
        canvas.drawColor(Color.WHITE);
        //定义画笔
        Paint paint = new Paint();
        //定义矩形为空心
        paint.setStyle(Paint.Style.FILL);
        //消除锯齿
        paint.setAntiAlias(true);
        //设置画笔的颜色
        paint.setColor(Color.RED);
        //设置画笔的外框宽度
        paint.setStrokeWidth(2);
        canvas.drawCircle(currentX, currentY, 20, paint);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //修改坐标x y
        currentX = event.getX();
        currentY = event.getY();
        //通知当前组件从新绘制
        invalidate();
        return true;

    }
}
