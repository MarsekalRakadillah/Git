package com.marsekal.git

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.marsekal.git.databinding.ActivityMainBinding
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        println("this is contained in my second commit")
        println("local changes")
        println("change 2")
        println("hello from the other laptop")
        println("tes push commit")

        val myCalendar = Calendar.getInstance()

        val datePicker = DatePickerDialog.OnDateSetListener {view, year, month, dayOfMonth ->
            myCalendar.set(Calendar.YEAR, year)
            myCalendar.set(Calendar.MONTH, month)
            myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth)
            updateLable(myCalendar)
        }

        binding.btnDate.setOnClickListener {
            DatePickerDialog(this, datePicker, myCalendar.get(Calendar.YEAR),
            myCalendar.get(Calendar.MONTH), myCalendar.get(Calendar.DAY_OF_MONTH)).show()
        }

        var date = Date()
        var simpleDate = SimpleDateFormat("HH:mm")
        binding.tv1.setText(simpleDate.format(date))
    }

    private fun updateLable(myCalendar: Calendar) {
        val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.JAPANESE)
        binding.tv2.setText(sdf.format(myCalendar.time))
    }
}