package com.ludger.latihanrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvTeamSepakBola: RecyclerView
    private val list = ArrayList<TeamSepakBola>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvTeamSepakBola = findViewById(R.id.rv_team_sepakbola)
        rvTeamSepakBola.setHasFixedSize(true)

        list.addAll(listTeamSepakBola)
        tampilkanRecylerView()
    }

    private val listTeamSepakBola: ArrayList<TeamSepakBola>
        get() {
            val dataNama = resources.getStringArray(R.array.data_team_name)
            val dataDescription = resources.getStringArray(R.array.data_description_team)
            val dataLogo = resources.obtainTypedArray(R.array.data_logo_team)
            val listTeam = ArrayList<TeamSepakBola>()
            for (i in dataNama.indices) {
                val team = TeamSepakBola(
                    dataNama[i],
                    dataDescription[i],
                    dataLogo.getResourceId(i,-1)
                )
                listTeam.add(team)
            }
            return listTeam
        }
    private fun tampilkanRecylerView(){
        rvTeamSepakBola.layoutManager = LinearLayoutManager(this)
        val teamSepalbolaAdapter = TeamSepalbolaAdapter(list)
        rvTeamSepakBola.adapter = teamSepalbolaAdapter
    }
}