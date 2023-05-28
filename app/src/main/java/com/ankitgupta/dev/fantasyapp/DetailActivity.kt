package com.ankitgupta.dev.fantasyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.ankitgupta.dev.fantasyapp.databinding.ActivityDetailBinding
import com.ankitgupta.dev.fantasyapp.model.FantasyModel

class DetailActivity : AppCompatActivity() {
    private var binding:ActivityDetailBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)

        setContentView(binding?.root)


        if (intent.hasExtra("object")){
            val obj :FantasyModel = intent.getSerializableExtra("object") as FantasyModel

            if (obj!=null){

                binding?.LeagueName!!.text = obj.LeagueCountry
                binding?.status1!!.text = obj.teamScore
                binding?.team11!!.text = obj.team1
                binding?.team12!!.text = obj.team2
                binding?.scoreinfo!!.text = obj.teamInfo
                binding?.hostCountryFlag!!.setImageDrawable(ContextCompat.getDrawable(this,obj.LeagueCountryFlag))
                binding?.team1Flag!!.setImageDrawable(ContextCompat.getDrawable(this,obj.team1Flag))
                binding?.team2Flag!!.setImageDrawable(ContextCompat.getDrawable(this,obj.team2Flag))

            }







        }



    }
}