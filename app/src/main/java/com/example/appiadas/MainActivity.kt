package com.example.appiadas

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appiadas.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding .inflate(layoutInflater)
        setContentView( binding.root)

        binding.btTellJoker .setOnClickListener {
            showJoker()

        }

    }

    private fun showJoker() {
        val jokers = resources.getStringArray( R.array.jokers)
        val numberJoker = Random().nextInt( jokers.size)
        val joker = jokers[numberJoker]
        binding.tvJoker.text = joker
        playSong()

    }

    private fun playSong() {
        val mediaPlayer = MediaPlayer.create(this, R.raw.badumtss)
        mediaPlayer.start()
    }



}