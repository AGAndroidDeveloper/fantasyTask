package com.ankitgupta.dev.fantasyapp.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.ankitgupta.dev.fantasyapp.DetailActivity
import com.ankitgupta.dev.fantasyapp.R
import com.ankitgupta.dev.fantasyapp.model.FantasyModel

class TeamAdapter(private val context :Context,private val list: ArrayList<FantasyModel>) :
    RecyclerView.Adapter<TeamAdapter.ViewHolder>() {



    class ViewHolder(view: View) :RecyclerView.ViewHolder(view){

        val team1 :TextView = view.findViewById(R.id.team1)

        val team2 :TextView = view.findViewById(R.id.team2)

        val team1Flag :ImageView = view.findViewById(R.id.flag1)

        val team2Flag :ImageView = view.findViewById(R.id.flag2)

        val leagueName :TextView = view.findViewById(R.id.league)
        val leagueCountryFlag :ImageView = view.findViewById(R.id.leagueCountry)
        val teamScore  :TextView = view.findViewById(R.id.score)
        val teamInfo   :TextView = view.findViewById(R.id.teamInfo)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.card, parent, false)
        return ViewHolder(itemView)

    }

    override fun getItemCount(): Int {
        return  list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
      val data = list[position]

        holder.team1.text = data.team1
        holder.team2.text = data.team2
        holder.team1Flag.setImageDrawable(ContextCompat.getDrawable(context,data.team1Flag))
        holder.team2Flag.setImageDrawable(ContextCompat.getDrawable(context,data.team2Flag))
        holder.leagueName.text = data.LeagueCountry
        holder.leagueCountryFlag.setImageDrawable(ContextCompat.getDrawable(context,data.LeagueCountryFlag))
        holder.teamScore.text = data.teamScore
        holder.teamInfo.text = data.teamInfo


        holder.itemView.setOnClickListener {
            val intent = Intent(context,DetailActivity::class.java)
            intent.putExtra(OBJECT,data)
            context.startActivity(intent)
        }
    }

    companion object{
        const val OBJECT = "object"
    }
}