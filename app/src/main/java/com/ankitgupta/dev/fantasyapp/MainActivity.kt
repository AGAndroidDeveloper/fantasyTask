package com.ankitgupta.dev.fantasyapp


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.ankitgupta.dev.fantasyapp.adapter.TeamAdapter
import com.ankitgupta.dev.fantasyapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private var binding : ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        val toolbar : Toolbar? = binding?.toolbar
        setSupportActionBar(toolbar)
        val inflater = LayoutInflater.from(this@MainActivity)
        val view :View = inflater.inflate(R.layout.title,binding?.toolbar,false)

        binding?.toolbar!!.addView(view)



        val list  = TeamDetail.returnTeamDetail()

        val adapter = TeamAdapter(this,list)
        binding?.recyclerView!!.adapter = adapter




    }
}