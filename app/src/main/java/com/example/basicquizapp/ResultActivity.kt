package com.example.basicquizapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.basicquizapp.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding
    var totalScore = 0
    var wrong = 0
    var skip = 0

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        totalScore = intent.extras!!.getInt("correct")
        wrong = intent.extras!!.getInt("wrong")
        skip = intent.extras!!.getInt("skip")

        initializeViews()
    }

    @SuppressLint("SetTextI18n")
    private fun initializeViews() {
        binding.apply {
            tvScore.text = "Score: $totalScore"
            tvright.text = "Correct: $totalScore"
            tvwrong.text = "Wrong: $wrong"
            tvSkip.text = "Skip: $skip"

            if (totalScore >= 6) {
                binding.emojiReactionImg.setImageResource(R.drawable.smile_emoji_2)
                Toast.makeText(this@ResultActivity, "Wow Great", Toast.LENGTH_SHORT).show()
            } else {
                emojiReactionImg.setImageResource(R.drawable.angry_emoji_2)
                Toast.makeText(this@ResultActivity, "Need Improvement", Toast.LENGTH_SHORT).show()
            }
            tvPlayAgain.setOnClickListener {
                finish()
            }
            tvRateApp.setOnClickListener {
                intent= Intent(this@ResultActivity,RatingActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
