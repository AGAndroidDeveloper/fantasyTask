package com.ankitgupta.dev.fantasyapp

import com.ankitgupta.dev.fantasyapp.model.FantasyModel

object TeamDetail {


    fun returnTeamDetail():ArrayList<FantasyModel>{

        return arrayListOf(

            FantasyModel("ICC T-20 WorldCup",R.drawable.india,
                "India","Australia",R.drawable.india, R.drawable.aus,"2-2",
            "over 1.5 | 1.25"

            ),
//Atlanta Hawks
//Boston Celtics
            FantasyModel("NBA", R.drawable.download__14_,
                "Atlanta Hawks","Boston Celtics", R.drawable.atlanta_hawks,
                R.drawable.download__24_,"1-0",
            "over 1X | 1.70"

            ),
//Sevilla
//Valencia
            FantasyModel("LaLiga", R.drawable.sevilla,
                "Sevilla","Valencia", R.drawable.sevilla, R.drawable.va,"3-1",
            "under 3.5|1.30"

            ),
            //Anaheim Ducks
            //Arizona Coyotes

            FantasyModel("National Hockey League", R.drawable.download__14_,
                "Anaheim Ducks","Arizona Coyotes", R.drawable.aus, R.drawable.sevilla,"2-2",
            "over 1.5|1.25"

            ),









        )



    }

}