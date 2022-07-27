package com.ridhamad.inspecnote;

import androidx.cardview.widget.CardView;

import com.ridhamad.inspecnote.Models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
