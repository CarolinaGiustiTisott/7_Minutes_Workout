package com.example.a7_minute_workout

import java.text.SimpleDateFormat
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.example.a7_minute_workout.databinding.ActivityFinishBinding
import kotlinx.coroutines.launch
import java.util.*

class FinishActivity : AppCompatActivity() {

    private var binding: ActivityFinishBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFinishBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        setSupportActionBar(binding?.toolbarFinishActivity)
        if (supportActionBar != null){
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
        }
        binding?.toolbarFinishActivity?.setNavigationOnClickListener {
            onBackPressed()
        }

        binding?.buttonFinish?.setOnClickListener {
            finish()
        }

        val dao = (application as WorkOutApp).db.historyDao()
        addDateToDatabase(dao)

    }

    private fun addDateToDatabase(historyDao: HistoryDao){
        val MyCalendar = Calendar.getInstance()
        val dateTime = MyCalendar.time
        Log.e("Date", "" + dateTime)

        val sdf = SimpleDateFormat(" dd MMM yyyy HH:mm:ss", Locale.getDefault())
        val date = sdf.format(dateTime)
        Log.e("Formatted Date", "" + date)

        lifecycleScope.launch {
            historyDao.insert(HistoryEntity(date))
            Log.e("Date: ","Added...")
        }

    }
}