package cau01.kiemtratk.student.tdl_cau1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Cau1 extends AppCompatActivity{
    ListView listView;
    List<Movie> list;
    MovieAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.lvCau1);
        list = new ArrayList<>();
        list.add(new Movie("Wolfverin","American","30.000"));
        list.add(new Movie("SwordFish","American","15.000"));
        list.add(new Movie("Deadpool","American","29.000"));
        list.add(new Movie("RobinHood","American","35.000"));
        list.add(new Movie("EndGame","American","100.000"));
        list.add(new Movie("IronMan","American","70.000"));

        adapter = new MovieAdapter(this,R.layout.movie_item,list);
        listView.setAdapter(adapter);
    }
}
