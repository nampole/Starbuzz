package com.hfad.starbuzz;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends Activity {
    public static final String EXTRA_DRINKID = "drinkId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        //인텐트에서 음료정보 얻기
        int drinkId = (Integer)getIntent().getExtras().get(EXTRA_DRINKID);
        Drink drink = Drink.drinks [drinkId];

        //음료 이름 가져오기
        TextView name = (TextView)findViewById(R.id.name);
        name.setText(drink.getName());

        //음료 설명 가져오기
        TextView description = (TextView)findViewById(R.id.description);
        name.setText(drink.getDescription());

        //음료 이미지 가져오기
        ImageView photo = (ImageView)findViewById(R.id.photo);
        photo.setImageResource(drink.getImageResourceId());
        photo.setContentDescription(drink.getName());


    }
}
