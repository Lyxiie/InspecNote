package com.ridhamad.inspecnote;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.ridhamad.inspecnote.Models.Notes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ViewNoteActivity extends AppCompatActivity {

    TextView textView_title, textView_notes;
    ImageView imageView_edit;
    Notes notes;
    boolean isOldNotes = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_note);

        imageView_edit = findViewById(R.id.imageView_edit);
        textView_title = findViewById(R.id.textView_title);
        textView_notes = findViewById(R.id.textView_notes);

        notes = new Notes();
        try {
            notes = (Notes) getIntent().getSerializableExtra("old_note");
            textView_title.setText(notes.getTitle());
            textView_notes.setText(notes.getNotes());
            isOldNotes = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        notes = (Notes) getIntent().getSerializableExtra("old_note");

        imageView_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ViewNoteActivity.this, NotesTakerActivity.class);
                intent.putExtra("old_note", notes);
                startActivityForResult(intent, 102);
            }
        });
    }
}