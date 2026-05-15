package com.prathamchikitse.model

data class Emergency(
    val id: Int,
    val titleEn: String,
    val titleKn: String,
    val iconResId: Int,
    val colorResId: Int,
    val steps: List<EmergencyStep>,
    val dosList: List<String>,
    val dontsList: List<String>
)

data class EmergencyStep(
    val stepNumber: Int,
    val instructionEn: String,
    val instructionKn: String,
    val illustrationRes: Int? = null
)

data class Hospital(
    val name: String,
    val address: String,
    val phone: String,
    val distanceKm: Double,
    val isOpen24Hours: Boolean
)
