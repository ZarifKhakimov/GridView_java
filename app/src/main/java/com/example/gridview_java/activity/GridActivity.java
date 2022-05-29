package com.example.gridview_java.activity;
import android.os.Bundle;
import android.widget.GridView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.gridview_java.R;
import com.example.gridview_java.adapter.GridAdapter;
import com.example.gridview_java.model.CourseModel;

import java.util.ArrayList;

public class GridActivity extends AppCompatActivity {
    ArrayList<CourseModel> cd;
    GridView coursesGV;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        GridView coursesGV = findViewById(R.id.idGVcourses);

        ArrayList<CourseModel> courseArrayList = new ArrayList<CourseModel>();
        courseArrayList.add(new CourseModel("Kotlin", R.drawable.xurshidbek_kurbanov));
        courseArrayList.add(new CourseModel("JAVA", R.drawable.xurshidbek_kurbanov));
        courseArrayList.add(new CourseModel("C++", R.drawable.xurshidbek_kurbanov));
        courseArrayList.add(new CourseModel("Python", R.drawable.xurshidbek_kurbanov));
        courseArrayList.add(new CourseModel("C#", R.drawable.xurshidbek_kurbanov));
        courseArrayList.add(new CourseModel("Swift", R.drawable.xurshidbek_kurbanov));

        GridAdapter adapter = new GridAdapter(this, courseArrayList);
        coursesGV.setAdapter(adapter);
    }
}