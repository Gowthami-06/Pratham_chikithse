package com.prathamchikitse.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.prathamchikitse.databinding.ItemStepPageBinding
import com.prathamchikitse.model.EmergencyStep

class StepPagerAdapter(
    private val steps: List<EmergencyStep>
) : RecyclerView.Adapter<StepPagerAdapter.StepViewHolder>() {

    inner class StepViewHolder(private val binding: ItemStepPageBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(step: EmergencyStep) {
            binding.tvStepNumber.text = "Step ${step.stepNumber}"
            binding.tvInstructionEn.text = step.instructionEn
            binding.tvInstructionKn.text = step.instructionKn
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StepViewHolder {
        val binding = ItemStepPageBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return StepViewHolder(binding)
    }

    override fun onBindViewHolder(holder: StepViewHolder, position: Int) {
        holder.bind(steps[position])
    }

    override fun getItemCount() = steps.size
}
