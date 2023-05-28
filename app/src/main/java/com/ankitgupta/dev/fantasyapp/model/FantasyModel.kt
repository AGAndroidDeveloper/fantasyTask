package com.ankitgupta.dev.fantasyapp.model

import java.io.Serializable

data class FantasyModel(
    val LeagueCountry :String,
    val LeagueCountryFlag :Int,
    val team1  :String,
    val team2  :String,
    val team1Flag  :Int ,
    val team2Flag :Int ,
    val teamScore :String,
    val teamInfo :String




) : Serializable
