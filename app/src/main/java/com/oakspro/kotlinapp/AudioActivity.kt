package com.oakspro.kotlinapp

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast

class AudioActivity : AppCompatActivity() {

    lateinit var pauseBtn:Button
    lateinit var playBtn:Button
    lateinit var forwardBtn:Button
    lateinit var rewindBtn:Button
    lateinit var startTx:TextView
    lateinit var endTx:TextView
    lateinit var seekbar:SeekBar
    lateinit var  mediaPlayer:MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_audio)


        pauseBtn=findViewById(R.id.pause_btn)
        playBtn=findViewById(R.id.play_btn)
        forwardBtn=findViewById(R.id.forward_btn)
        rewindBtn=findViewById(R.id.replay_btn)
        startTx=findViewById(R.id.start_tx)
        endTx=findViewById(R.id.end_tx)
        seekbar=findViewById(R.id.seekbar)

        mediaPlayer=MediaPlayer.create(this, R.raw.electro_ncs)

        playBtn.setOnClickListener {
            mediaPlayer.start()
            Toast.makeText(this, "Audio Playing...", Toast.LENGTH_SHORT).show()
        }
        pauseBtn.setOnClickListener {
            mediaPlayer.pause()
            Toast.makeText(this, "Audio Paused!!!", Toast.LENGTH_SHORT).show()
        }

    }
}