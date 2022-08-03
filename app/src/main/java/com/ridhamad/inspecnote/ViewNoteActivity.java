package com.ridhamad.inspecnote;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import com.ridhamad.inspecnote.Models.Notes;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class ViewNoteActivity extends AppCompatActivity{

    TextView textView_title, textView_notes;
//    ImageView imageView_edit;
    Notes notes;
    boolean isOldNotes = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_note);

//        getSupportActionBar().hide();
//        imageView_edit = findViewById(R.id.imageView_edit);

//        textView_title = findViewById(R.id.textView_title);
        textView_notes = findViewById(R.id.textView_notes);

        notes = new Notes();
        try {
            notes = (Notes) getIntent().getSerializableExtra("old_note");
//            textView_title.setText(notes.getTitle());
            textView_notes.setText(notes.getNotes());
            isOldNotes = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        notes = (Notes) getIntent().getSerializableExtra("old_note");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(notes.getTitle());


//        imageView_edit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(ViewNoteActivity.this, NotesTakerActivity.class);
//                intent.putExtra("old_note", notes);
//                startActivityForResult(intent, 102);
//            }
//        });

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}