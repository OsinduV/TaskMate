package com.example.taskmate_new.repository

import com.example.taskmate_new.database.NoteDatabase
import com.example.taskmate_new.model.Note

class NoteRepository(private val db: NoteDatabase) {

    suspend fun insertNote(note: Note) = db.getNoteDao().InsertNote(note)
    suspend fun deleteNote(note: Note) = db.getNoteDao().deleteNote(note)
    suspend fun updateNote(note: Note) = db.getNoteDao().updateNote(note)

    fun getAllNotes() = db.getNoteDao().getAllNotes()
    fun searchNote(query: String?) = db.getNoteDao().searchNote(query)

}

/*
we have already created crud function queries in doa , but this time we will call all of them
as methods in their respective functions
 */

/*
suspend : make sure that all this operation is running on a background thread
 */