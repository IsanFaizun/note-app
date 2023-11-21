package com.example.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.myapplication.databinding.ActivityEditBinding
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

private lateinit var binding: ActivityEditBinding
private lateinit var mNoteDao: NoteDao
private lateinit var executorService: ExecutorService

class EditActivity : AppCompatActivity() {
    private lateinit var title: EditText
    private lateinit var description: EditText
    private lateinit var database: NoteDatabase
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)

        title = findViewById(R.id.title_edt)
        description = findViewById(R.id.desc_edt)
        database = NoteDatabase.getInstance(applicationContext)
    }
}