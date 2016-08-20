package com.taskscreen.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.taskscreen.R;

/**
 * Created by vanip_000 on 19-08-2016.
 */
public class Edit_Task_Activity extends AppCompatActivity {
    TextView txt_edittask_save,txt_edittask_cancel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_task);

        txt_edittask_cancel= (TextView) findViewById(R.id.edit_task_cancel);
        txt_edittask_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_order=new Intent(getApplicationContext(),No_task_Activity.class);
                startActivity(intent_order);
            }
        });

        txt_edittask_save= (TextView) findViewById(R.id.edit_task_done);
        txt_edittask_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Filter_task.class);
                startActivity(intent);
            }
        });


        Window window = Edit_Task_Activity.this.getWindow();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Edit_Task_Activity.this.getResources().getColor(R.color.statuscode));
        }
    }
}
