package com.example.basicquizapp
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.basicquizapp.databinding.ActivityRatingBinding


class RatingActivity : AppCompatActivity() {
    private lateinit var binding:ActivityRatingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityRatingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ratingButton.setOnClickListener {
            Toast.makeText(this@RatingActivity,"Thanks for provide your Feedback",Toast.LENGTH_SHORT).show()
        }
        binding.homeButton.setOnClickListener {
            onBackPressed()
        }
    }
}