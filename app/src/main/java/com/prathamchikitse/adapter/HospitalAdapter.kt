package com.prathamchikitse.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.prathamchikitse.databinding.ItemHospitalBinding
import com.prathamchikitse.model.Hospital

class HospitalAdapter(
    private val hospitals: List<Hospital>,
    private val onCallClick: (Hospital) -> Unit
) : RecyclerView.Adapter<HospitalAdapter.HospitalViewHolder>() {

    inner class HospitalViewHolder(private val binding: ItemHospitalBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(hospital: Hospital, rank: Int) {
            binding.tvHospitalRank.text = "#$rank"
            binding.tvHospitalName.text = hospital.name
            binding.tvHospitalAddress.text = hospital.address
            binding.tvHospitalPhone.text = hospital.phone
            binding.tvDistance.text = "${hospital.distanceKm} km away"
            binding.tvOpenStatus.text = if (hospital.isOpen24Hours) "Open 24H" else "Check Timings"
            binding.tvOpenStatus.setTextColor(
                binding.root.context.getColor(
                    if (hospital.isOpen24Hours) android.R.color.holo_green_dark
                    else android.R.color.holo_orange_dark
                )
            )
            binding.btnCall.setOnClickListener { onCallClick(hospital) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HospitalViewHolder {
        val binding = ItemHospitalBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return HospitalViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HospitalViewHolder, position: Int) {
        holder.bind(hospitals[position], position + 1)
    }

    override fun getItemCount() = hospitals.size
}
