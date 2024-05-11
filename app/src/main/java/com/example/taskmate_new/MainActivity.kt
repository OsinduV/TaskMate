package com.example.taskmate_new

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.taskmate_new.database.NoteDatabase
import com.example.taskmate_new.repository.NoteRepository
import com.example.taskmate_new.viewmodel.NoteViewModel
import com.example.taskmate_new.viewmodel.NoteViewModelFactory

class MainActivity : AppCompatActivity() {

    lateinit var noteViewModel: NoteViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupViewModel()

        // The Toolbar defined in the layout has the id "my_toolbar".
        setSupportActionBar(findViewById(R.id.my_toolbar))
    }

    private fun setupViewModel(){
        val noteRepository = NoteRepository(NoteDatabase(this))
        val viewModelProviderFactory = NoteViewModelFactory(application, noteRepository)
        noteViewModel = ViewModelProvider(this, viewModelProviderFactory)[NoteViewModel::class.java]
    }

}