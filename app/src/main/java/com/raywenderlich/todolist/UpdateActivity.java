package com.raywenderlich.todolist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
/**
 * Created by User on 12/15/2016.
 */

public class UpdateActivity extends AppCompatActivity {
    public static final String EXTRA_TASK_DESCRIPTION = "task";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    setContentView(R.layout.update_task_description);


    }
}
