package com.ludger.latihanrecyclerview

import android.provider.MediaStore.Images.ImageColumns
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TeamSepalbolaAdapter(
    private val listTeam: ArrayList<TeamSepakBola>
) : RecyclerView.Adapter<TeamViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamViewHolder {
        val itemView: View = LayoutInflater.from(parent.context)
            .inflate(
                R.layout.item_team_sepakbola,
                parent,
                false
            )
        return TeamViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TeamViewHolder, position: Int) {
        holder.bind(listTeam[position])
    }

    override fun getItemCount(): Int {
        return listTeam.size
    }
}

class TeamViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var tvNamaTeam: TextView = itemView.findViewById<TextView>(R.id.tv_nama_team)
    var tvDescripTeam: TextView = itemView.findViewById<TextView>(R.id.tv_description_team)
    var ivLogoTeam: ImageView = itemView.findViewById(R.id.iv_logo_team)
    fun bind(team: TeamSepakBola) {
        tvNamaTeam.text = team.nama
        tvDescripTeam.text = team.description
        ivLogoTeam.setImageResource(team.logo)
    }
}