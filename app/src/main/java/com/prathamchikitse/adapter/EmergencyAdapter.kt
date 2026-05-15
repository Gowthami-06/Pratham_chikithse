package com.prathamchikitse.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.prathamchikitse.databinding.ItemEmergencyTileBinding
import com.prathamchikitse.model.Emergency

class EmergencyAdapter(
    private var emergencies: List<Emergency>,
    private val onClick: (Emergency) -> Unit
) : RecyclerView.Adapter<EmergencyAdapter.EmergencyViewHolder>() {

    inner class EmergencyViewHolder(private val binding: ItemEmergencyTileBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(emergency: Emergency) {
            binding.tvEmergencyName.text = emergency.titleEn
            binding.tvEmergencyNameKn.text = emergency.titleKn
            binding.tvSteps.text = "${emergency.steps.size} Steps"

            try {
                binding.ivEmergencyIcon.setImageResource(emergency.iconResId)
            } catch (e: Exception) {
                // Use default if icon not found
            }

            try {
                binding.cardRoot.setCardBackgroundColor(
                    binding.root.context.getColor(emergency.colorResId)
                )
            } catch (e: Exception) {
                // Use default color
            }

            binding.root.setOnClickListener { onClick(emergency) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmergencyViewHolder {
        val binding = ItemEmergencyTileBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return EmergencyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: EmergencyViewHolder, position: Int) {
        holder.bind(emergencies[position])
    }

    override fun getItemCount() = emergencies.size

    fun updateList(newList: List<Emergency>) {
        emergencies = newList
        notifyDataSetChanged()
    }
}
