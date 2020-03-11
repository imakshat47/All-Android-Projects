package com.example.redcit.Sprites;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;

import com.example.redcit.R;
import com.example.redcit.Sprite;

public class Birds extends Sprite {

    private Bitmap bird;
    private int birdX, birdWidth, birdHeight;

    public Birds(Resources resources){
        birdX = (int) resources.getDimension(R.dimen.bird_x);
        birdWidth = (int) resources.getDimension(R.dimen.bird__width);
        birdHeight = (int) resources.getDimension(R.dimen.bird_height);

        Bitmap birdBep = BitmapFactory.decodeResource(resources, R.drawable.bird_down);
        bird = Bitmap.createScaledBitmap(birdBep, birdWidth, birdHeight, false);
    }

    @Override
    public void draw(Canvas canvas){
        canvas.drawBitmap(bird, birdX, 300, null);
    }

    @Override
    public void update{} {

    }
}
