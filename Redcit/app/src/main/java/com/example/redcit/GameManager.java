package com.example.redcit;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import com.example.redcit.Sprites.Birds;

public class GameManager extends SurfaceView implements SurfaceHolder.Callback {

    public MainThread thread;

    private Birds bird;

    public GameManager(Context context, AttributeSet attributeSet) {
        super(context);
        getHolder().addCallback(this);
        thread = new MainThread(getHolder(), this);

    }

    private void initGame() {
        bird = new Birds(getResources());
    }


    @Override
    public void surfaceCreated(SurfaceHolder holder) {

        thread.setRunning(true);
        thread.start();
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        boolean retry = true;
        while(retry){
            try {
                thread.setRunning(false);
                thread.join();
            } catch(InterruptedException e){
                e.printStackTrace();
            }
            retry = false;
        }

    }

    public void update(){
        
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        bird.draw(Canvas);
    }
}
