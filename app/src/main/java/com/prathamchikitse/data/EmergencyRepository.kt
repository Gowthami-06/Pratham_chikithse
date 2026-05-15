package com.prathamchikitse.data

import com.prathamchikitse.R
import com.prathamchikitse.model.Emergency
import com.prathamchikitse.model.EmergencyStep
import com.prathamchikitse.model.Hospital

object EmergencyRepository {

    fun getAllEmergencies(): List<Emergency> = listOf(

        Emergency(
            id = 1,
            titleEn = "Snake Bite",
            titleKn = "ಹಾವು ಕಡಿತ",
            iconResId = R.drawable.ic_snake,
            colorResId = R.color.emergency_red,
            steps = listOf(
                EmergencyStep(1, "Keep the victim CALM and still. Movement spreads venom faster.", "ರೋಗಿಯನ್ನು ಶಾಂತವಾಗಿ ಮತ್ತು ಸ್ಥಿರವಾಗಿ ಇರಿಸಿ."),
                EmergencyStep(2, "Lay the person down. Keep bitten limb BELOW heart level.", "ವ್ಯಕ್ತಿಯನ್ನು ಮಲಗಿಸಿ. ಕಚ್ಚಿದ ಅಂಗವನ್ನು ಹೃದಯಕ್ಕಿಂತ ಕೆಳಗೆ ಇರಿಸಿ."),
                EmergencyStep(3, "Remove tight clothing, rings, watches near the bite area.", "ಕಚ್ಚಿದ ಸ್ಥಳದ ಬಳಿ ಬಿಗಿಯಾದ ಬಟ್ಟೆ, ಉಂಗುರ, ಗಡಿಯಾರ ತೆಗೆಯಿರಿ."),
                EmergencyStep(4, "Note the time of the bite and snake description if possible.", "ಕಚ್ಚಿದ ಸಮಯ ಮತ್ತು ಹಾವಿನ ವಿವರಣೆ ಗಮನಿಸಿ."),
                EmergencyStep(5, "Call ambulance / rush to hospital IMMEDIATELY. Do NOT waste time.", "ತಕ್ಷಣ ಆಂಬ್ಯುಲೆನ್ಸ್ ಕರೆ ಮಾಡಿ / ಆಸ್ಪತ್ರೆಗೆ ಧಾವಿಸಿ.")
            ),
            dosList = listOf(
                "Keep the victim calm and immobile",
                "Remove constricting items",
                "Note snake appearance",
                "Rush to hospital immediately"
            ),
            dontsList = listOf(
                "DO NOT suck the venom",
                "DO NOT cut the wound",
                "DO NOT apply tourniquet",
                "DO NOT apply ice",
                "DO NOT give alcohol"
            )
        ),

        Emergency(
            id = 2,
            titleEn = "Heart Attack",
            titleKn = "ಹೃದಯಾಘಾತ",
            iconResId = R.drawable.ic_heart,
            colorResId = R.color.emergency_red,
            steps = listOf(
                EmergencyStep(1, "Call emergency services (108) immediately.", "ತಕ್ಷಣ ತುರ್ತು ಸೇವೆಗಳನ್ನು (108) ಕರೆ ಮಾಡಿ."),
                EmergencyStep(2, "Have the person sit or lie down in a comfortable position.", "ವ್ಯಕ್ತಿಯನ್ನು ಆರಾಮದಾಯಕ ಸ್ಥಾನದಲ್ಲಿ ಕುಳ್ಳಿರಿಸಿ ಅಥವಾ ಮಲಗಿಸಿ."),
                EmergencyStep(3, "Loosen tight clothing around neck and chest.", "ಕತ್ತು ಮತ್ತು ಎದೆಯ ಸುತ್ತ ಬಿಗಿಯಾದ ಬಟ್ಟೆ ಸಡಿಲಿಸಿ."),
                EmergencyStep(4, "If person is unconscious and not breathing, start CPR: 30 chest compressions + 2 rescue breaths.", "ವ್ಯಕ್ತಿ ಪ್ರಜ್ಞಾಹೀನರಾಗಿದ್ದರೆ CPR ಪ್ರಾರಂಭಿಸಿ: 30 ಒತ್ತಡ + 2 ಉಸಿರು."),
                EmergencyStep(5, "Continue CPR until ambulance arrives.", "ಆಂಬ್ಯುಲೆನ್ಸ್ ಬರುವವರೆಗೂ CPR ಮುಂದುವರಿಸಿ.")
            ),
            dosList = listOf(
                "Call 108 immediately",
                "Keep person calm and still",
                "Perform CPR if needed",
                "Note time of onset"
            ),
            dontsList = listOf(
                "DO NOT leave person alone",
                "DO NOT give food or water",
                "DO NOT let the person walk",
                "DO NOT delay calling for help"
            )
        ),

        Emergency(
            id = 3,
            titleEn = "Choking",
            titleKn = "ಗಂಟಲು ಅಡಚಣೆ",
            iconResId = R.drawable.ic_choking,
            colorResId = R.color.emergency_orange,
            steps = listOf(
                EmergencyStep(1, "Ask the person: 'Are you choking?' If they cannot speak, act immediately.", "ವ್ಯಕ್ತಿಯನ್ನು ಕೇಳಿ: 'ನಿಮಗೆ ಉಸಿರಾಟ ತೊಂದರೆಯಾಗುತ್ತಿದೆಯೇ?' ಮಾತನಾಡಲು ಸಾಧ್ಯವಾಗದಿದ್ದರೆ ತಕ್ಷಣ ಕ್ರಮ ಕೈಗೊಳ್ಳಿ."),
                EmergencyStep(2, "Give 5 firm back blows between shoulder blades with heel of hand.", "ಕೈಯ ತಳದಿಂದ ಭುಜದ ಮಧ್ಯೆ 5 ಬಲವಾದ ಹೊಡೆತ ನೀಡಿ."),
                EmergencyStep(3, "If ineffective: Stand behind person, wrap arms around waist.", "ಫಲಿತಾಂಶ ಇಲ್ಲದಿದ್ದರೆ: ವ್ಯಕ್ತಿಯ ಹಿಂದೆ ನಿಂತು ಸೊಂಟದ ಸುತ್ತ ಕೈ ಸುತ್ತಿ."),
                EmergencyStep(4, "Apply Heimlich maneuver: 5 firm upward thrusts to upper abdomen.", "ಹೀಮ್ಲಿಚ್ ಮ್ಯಾನ್ಯೂವರ್: ಮೇಲ್ ಹೊಟ್ಟೆಗೆ 5 ಬಲವಾದ ಮೇಲ್ಮುಖ ಒತ್ತಡ ನೀಡಿ."),
                EmergencyStep(5, "Alternate 5 back blows and 5 abdominal thrusts until object is dislodged.", "ವಸ್ತು ಹೊರಬರುವವರೆಗೆ 5 ಬೆನ್ನು ಹೊಡೆತ ಮತ್ತು 5 ಹೊಟ್ಟೆ ಒತ್ತಡ ಪರ್ಯಾಯವಾಗಿ ನೀಡಿ.")
            ),
            dosList = listOf(
                "Act immediately if person can't speak",
                "Give back blows first",
                "Use Heimlich maneuver",
                "Call 108 if not resolved quickly"
            ),
            dontsList = listOf(
                "DO NOT do blind finger sweep",
                "DO NOT give water",
                "DO NOT slap back if breathing normally"
            )
        ),

        Emergency(
            id = 4,
            titleEn = "Severe Burns",
            titleKn = "ತೀವ್ರ ಸುಟ್ಟ ಗಾಯ",
            iconResId = R.drawable.ic_burn,
            colorResId = R.color.emergency_orange,
            steps = listOf(
                EmergencyStep(1, "Remove from source of burn. Stop the burning process.", "ಸುಡುವ ಮೂಲದಿಂದ ದೂರ ಸರಿಸಿ. ಸುಡುವಿಕೆ ನಿಲ್ಲಿಸಿ."),
                EmergencyStep(2, "Cool the burn with cool (not cold/ice) running water for 20 minutes.", "ತಣ್ಣನೆಯ (ಐಸ್ ಅಲ್ಲ) ಹರಿಯುವ ನೀರಿನಿಂದ 20 ನಿಮಿಷ ತಂಪು ಮಾಡಿ."),
                EmergencyStep(3, "Remove rings, watches, tight clothing NEAR the burn area (not over it).", "ಸುಟ್ಟ ಪ್ರದೇಶದ ಬಳಿ ಉಂಗುರ, ಗಡಿಯಾರ, ಬಿಗಿ ಬಟ್ಟೆ ತೆಗೆಯಿರಿ."),
                EmergencyStep(4, "Cover loosely with clean non-fluffy cloth or cling wrap.", "ಸ್ವಚ್ಛ ಬಟ್ಟೆ ಅಥವಾ ಕ್ಲಿಂಗ್ ರ್ಯಾಪ್‌ನಿಂದ ಸಡಿಲವಾಗಿ ಮುಚ್ಚಿ."),
                EmergencyStep(5, "For severe burns > 10% body area or face/hands: rush to hospital immediately.", "10% ಮೀರಿದ ಅಥವಾ ಮುಖ/ಕೈಯ ಸುಟ್ಟ ಗಾಯಕ್ಕೆ: ತಕ್ಷಣ ಆಸ್ಪತ್ರೆಗೆ ಧಾವಿಸಿ.")
            ),
            dosList = listOf(
                "Cool with running water 20 min",
                "Remove jewellery near burn",
                "Cover loosely with clean cloth",
                "Seek medical help for serious burns"
            ),
            dontsList = listOf(
                "DO NOT use ice",
                "DO NOT apply butter or oil",
                "DO NOT break blisters",
                "DO NOT remove stuck clothing"
            )
        ),

        Emergency(
            id = 5,
            titleEn = "Fracture / Broken Bone",
            titleKn = "ಮೂಳೆ ಮುರಿತ",
            iconResId = R.drawable.ic_fracture,
            colorResId = R.color.emergency_yellow,
            steps = listOf(
                EmergencyStep(1, "Keep the person still. Do not try to straighten the limb.", "ವ್ಯಕ್ತಿಯನ್ನು ಸ್ಥಿರವಾಗಿ ಇರಿಸಿ. ಅಂಗವನ್ನು ನೇರ ಮಾಡಲು ಯತ್ನಿಸಬೇಡಿ."),
                EmergencyStep(2, "Immobilize the injury using splint (stick, rolled newspaper) above and below fracture.", "ಮೂಳೆ ಮುರಿತದ ಮೇಲೆ ಮತ್ತು ಕೆಳಗೆ ಸ್ಪ್ಲಿಂಟ್ (ಕೋಲು, ಸುರುಳಿ ಪೇಪರ್) ಬಳಸಿ ಸ್ಥಿರೀಕರಿಸಿ."),
                EmergencyStep(3, "Apply ice pack (wrapped in cloth) to reduce swelling.", "ಊತ ಕಡಿಮೆ ಮಾಡಲು ಬಟ್ಟೆಯಲ್ಲಿ ಸುತ್ತಿದ ಐಸ್ ಪ್ಯಾಕ್ ಅನ್ನಿಸಿ."),
                EmergencyStep(4, "Elevate the injured area if possible to reduce swelling.", "ಊತ ಕಡಿಮೆ ಮಾಡಲು ಸಾಧ್ಯವಾದರೆ ಗಾಯದ ಭಾಗವನ್ನು ಮೇಲೆ ಎತ್ತಿ ಇರಿಸಿ."),
                EmergencyStep(5, "Transport carefully to hospital. Do not put weight on injured limb.", "ಎಚ್ಚರಿಕೆಯಿಂದ ಆಸ್ಪತ್ರೆಗೆ ಸಾಗಿಸಿ. ಗಾಯದ ಅಂಗದ ಮೇಲೆ ತೂಕ ಹಾಕಬೇಡಿ.")
            ),
            dosList = listOf(
                "Immobilize the fracture",
                "Apply ice wrapped in cloth",
                "Elevate the injured area",
                "Seek medical help"
            ),
            dontsList = listOf(
                "DO NOT try to straighten bone",
                "DO NOT move the person unnecessarily",
                "DO NOT apply direct ice to skin"
            )
        ),

        Emergency(
            id = 6,
            titleEn = "Severe Bleeding",
            titleKn = "ತೀವ್ರ ರಕ್ತಸ್ರಾವ",
            iconResId = R.drawable.ic_bleeding,
            colorResId = R.color.emergency_red,
            steps = listOf(
                EmergencyStep(1, "Apply direct pressure on the wound using clean cloth or bandage.", "ಸ್ವಚ್ಛ ಬಟ್ಟೆ ಅಥವಾ ಬ್ಯಾಂಡೇಜ್ ಬಳಸಿ ಗಾಯದ ಮೇಲೆ ನೇರ ಒತ್ತಡ ಹಾಕಿ."),
                EmergencyStep(2, "Do not remove the cloth if soaked; add more on top.", "ಬಟ್ಟೆ ನೆನೆದರೂ ತೆಗೆಯಬೇಡಿ; ಮೇಲೆ ಇನ್ನಷ್ಟು ಸೇರಿಸಿ."),
                EmergencyStep(3, "Elevate the injured area above heart level if possible.", "ಸಾಧ್ಯವಾದರೆ ಗಾಯದ ಭಾಗವನ್ನು ಹೃದಯ ಮಟ್ಟಕ್ಕಿಂತ ಮೇಲೆ ಇರಿಸಿ."),
                EmergencyStep(4, "If limb bleeding is uncontrollable, apply tourniquet 5–7 cm above wound.", "ಅಂಗದ ರಕ್ತಸ್ರಾವ ನಿಯಂತ್ರಿಸಲಾಗದಿದ್ದರೆ ಗಾಯದ 5–7 ಸೆಂ ಮೇಲೆ ಟರ್ನಿಕೆಟ್ ಹಾಕಿ."),
                EmergencyStep(5, "Rush to hospital immediately for severe or uncontrolled bleeding.", "ತೀವ್ರ ರಕ್ತಸ್ರಾವಕ್ಕೆ ತಕ್ಷಣ ಆಸ್ಪತ್ರೆಗೆ ಧಾವಿಸಿ.")
            ),
            dosList = listOf(
                "Apply direct pressure",
                "Elevate the wound",
                "Use tourniquet for limb if needed",
                "Get medical help fast"
            ),
            dontsList = listOf(
                "DO NOT remove embedded objects",
                "DO NOT remove soaked cloth",
                "DO NOT probe the wound"
            )
        ),

        Emergency(
            id = 7,
            titleEn = "Drowning",
            titleKn = "ಮುಳುಗಡೆ",
            iconResId = R.drawable.ic_drowning,
            colorResId = R.color.emergency_blue,
            steps = listOf(
                EmergencyStep(1, "Ensure YOUR safety first. Do not jump in unless trained.", "ಮೊದಲು ನಿಮ್ಮ ಸುರಕ್ಷತೆ ಖಚಿತಪಡಿಸಿ. ತರಬೇತಿ ಇಲ್ಲದಿದ್ದರೆ ನೀರಿಗೆ ಧುಮುಕಬೇಡಿ."),
                EmergencyStep(2, "Throw a rope, branch or clothing to pull the person out.", "ಹಗ್ಗ, ಕೋಲು ಅಥವಾ ಬಟ್ಟೆ ಎಸೆದು ವ್ಯಕ್ತಿಯನ್ನು ಹೊರ ತೆಗೆಯಿರಿ."),
                EmergencyStep(3, "Once out: check for breathing. If not breathing, start CPR immediately.", "ಹೊರ ತೆಗೆದ ನಂತರ: ಉಸಿರಾಟ ತಪಾಸಿಸಿ. ಉಸಿರಾಡದಿದ್ದರೆ ತಕ್ಷಣ CPR ಪ್ರಾರಂಭಿಸಿ."),
                EmergencyStep(4, "CPR: 30 chest compressions + 2 rescue breaths. Repeat until breathing or help arrives.", "CPR: 30 ಎದೆ ಒತ್ತಡ + 2 ಉಸಿರು. ಉಸಿರಾಟ ಬರುವವರೆಗೆ ಅಥವಾ ಸಹಾಯ ಬರುವವರೆಗೆ ಮುಂದುವರಿಸಿ."),
                EmergencyStep(5, "Call 108. Keep the person warm. Even if they seem fine, get medical evaluation.", "108 ಕರೆ ಮಾಡಿ. ವ್ಯಕ್ತಿಯನ್ನು ಬೆಚ್ಚಗಿರಿಸಿ. ಚೆನ್ನಾಗಿ ಕಂಡರೂ ವೈದ್ಯಕೀಯ ತಪಾಸಣೆ ಮಾಡಿಸಿ.")
            ),
            dosList = listOf(
                "Ensure your own safety first",
                "Throw rescue device",
                "Start CPR if not breathing",
                "Call 108 immediately"
            ),
            dontsList = listOf(
                "DO NOT jump in unless trained",
                "DO NOT skip medical evaluation",
                "DO NOT leave person alone"
            )
        ),

        Emergency(
            id = 8,
            titleEn = "Stroke",
            titleKn = "ಮೆದುಳಿನ ಹೊಡೆತ (ಸ್ಟ್ರೋಕ್)",
            iconResId = R.drawable.ic_stroke,
            colorResId = R.color.emergency_red,
            steps = listOf(
                EmergencyStep(1, "Use FAST test - Face drooping, Arm weakness, Speech difficulty, Time to call 108.", "FAST ಪರೀಕ್ಷೆ: ಮುಖ ಓರೆ, ಕೈ ದೌರ್ಬಲ್ಯ, ಮಾತು ತೊಂದರೆ, 108 ಕರೆಗೆ ಸಮಯ."),
                EmergencyStep(2, "Call 108 immediately. Note the time symptoms started.", "ತಕ್ಷಣ 108 ಕರೆ ಮಾಡಿ. ಲಕ್ಷಣಗಳು ಪ್ರಾರಂಭವಾದ ಸಮಯ ಗಮನಿಸಿ."),
                EmergencyStep(3, "Keep person calm. Lay them on their side if unconscious.", "ವ್ಯಕ್ತಿಯನ್ನು ಶಾಂತವಾಗಿ ಇರಿಸಿ. ಪ್ರಜ್ಞಾಹೀನರಾಗಿದ್ದರೆ ಪಕ್ಕಕ್ಕೆ ಮಲಗಿಸಿ."),
                EmergencyStep(4, "Do NOT give food, water, or medications.", "ಆಹಾರ, ನೀರು ಅಥವಾ ಔಷಧ ನೀಡಬೇಡಿ."),
                EmergencyStep(5, "Rush to hospital. Time is brain – every minute matters.", "ಆಸ್ಪತ್ರೆಗೆ ಧಾವಿಸಿ. ಸಮಯ ಅಮೂಲ್ಯ – ಪ್ರತಿ ನಿಮಿಷ ಮುಖ್ಯ.")
            ),
            dosList = listOf("Use FAST test", "Call 108 immediately", "Note symptom start time", "Keep person on their side"),
            dontsList = listOf("DO NOT give food or water", "DO NOT give aspirin without guidance", "DO NOT delay hospital visit")
        ),

        Emergency(
            id = 9,
            titleEn = "Seizure / Epilepsy",
            titleKn = "ಅಪಸ್ಮಾರ / ಫಿಟ್ಸ್",
            iconResId = R.drawable.ic_seizure,
            colorResId = R.color.emergency_purple,
            steps = listOf(
                EmergencyStep(1, "Stay calm. Note the time the seizure starts.", "ಶಾಂತವಾಗಿ ಇರಿ. ಫಿಟ್ಸ್ ಪ್ರಾರಂಭವಾದ ಸಮಯ ಗಮನಿಸಿ."),
                EmergencyStep(2, "Protect head with soft padding. Clear area of hard objects.", "ತಲೆಯನ್ನು ಮೃದು ವಸ್ತುವಿನಿಂದ ರಕ್ಷಿಸಿ. ಗಟ್ಟಿ ವಸ್ತುಗಳನ್ನು ದೂರ ಸರಿಸಿ."),
                EmergencyStep(3, "Turn person on their side (recovery position) to prevent choking.", "ಗಂಟಲು ಅಡಚಣೆ ತಪ್ಪಿಸಲು ವ್ಯಕ್ತಿಯನ್ನು ಪಕ್ಕಕ್ಕೆ ತಿರುಗಿಸಿ."),
                EmergencyStep(4, "Do NOT restrain the person. Let the seizure run its course.", "ವ್ಯಕ್ತಿಯನ್ನು ಹಿಡಿದಿಡಬೇಡಿ. ಫಿಟ್ಸ್ ಸ್ವಾಭಾವಿಕವಾಗಿ ನಿಲ್ಲಲು ಬಿಡಿ."),
                EmergencyStep(5, "Call 108 if seizure lasts > 5 minutes or person doesn't recover.", "ಫಿಟ್ಸ್ 5 ನಿಮಿಷ ಮೀರಿದರೆ ಅಥವಾ ಚೇತರಿಸಿಕೊಳ್ಳದಿದ್ದರೆ 108 ಕರೆ ಮಾಡಿ.")
            ),
            dosList = listOf("Time the seizure", "Protect head", "Recovery position", "Stay until they recover"),
            dontsList = listOf("DO NOT put anything in mouth", "DO NOT restrain", "DO NOT give water until fully conscious")
        ),

        Emergency(
            id = 10,
            titleEn = "Diabetic Emergency",
            titleKn = "ಮಧುಮೇಹ ತುರ್ತು",
            iconResId = R.drawable.ic_diabetes,
            colorResId = R.color.emergency_yellow,
            steps = listOf(
                EmergencyStep(1, "Check for signs: shakiness, sweating, confusion, pale skin = Low blood sugar.", "ಲಕ್ಷಣಗಳು: ನಡುಕ, ಬೆವರು, ಗೊಂದಲ, ಬಿಳಿ ಚರ್ಮ = ಕಡಿಮೆ ರಕ್ತ ಸಕ್ಕರೆ."),
                EmergencyStep(2, "If conscious and can swallow: give sugar water, juice, or glucose tablets.", "ಪ್ರಜ್ಞೆ ಇದ್ದು ನುಂಗಬಲ್ಲರೆ: ಸಕ್ಕರೆ ನೀರು, ಜ್ಯೂಸ್ ಅಥವಾ ಗ್ಲೂಕೋಸ್ ಮಾತ್ರೆ ನೀಡಿ."),
                EmergencyStep(3, "Have person rest for 15 minutes. Recheck if feeling better.", "15 ನಿಮಿಷ ವಿಶ್ರಾಂತಿ ತೆಗೆಯಲು ಹೇಳಿ. ಚೆನ್ನಾಗಿ ಅನಿಸುತ್ತಿದೆಯೇ ಮರು ಪರೀಕ್ಷಿಸಿ."),
                EmergencyStep(4, "If unconscious: Do NOT give anything by mouth. Call 108 immediately.", "ಪ್ರಜ್ಞಾಹೀನರಾದರೆ: ಬಾಯಿಯಿಂದ ಏನೂ ನೀಡಬೇಡಿ. ತಕ್ಷಣ 108 ಕರೆ ಮಾಡಿ."),
                EmergencyStep(5, "Get medical help if unsure or no improvement.", "ಸ್ಪಷ್ಟವಿಲ್ಲದಿದ್ದರೆ ಅಥವಾ ಸುಧಾರಣೆ ಇಲ್ಲದಿದ್ದರೆ ವೈದ್ಯಕೀಯ ಸಹಾಯ ಪಡೆಯಿರಿ.")
            ),
            dosList = listOf("Give sugar if conscious", "Let them rest", "Recheck after 15 min", "Call 108 if unconscious"),
            dontsList = listOf("DO NOT give anything if unconscious", "DO NOT leave alone", "DO NOT skip medical evaluation")
        ),

        Emergency(
            id = 11,
            titleEn = "Allergic Reaction",
            titleKn = "ಅಲರ್ಜಿ ಪ್ರತಿಕ್ರಿಯೆ",
            iconResId = R.drawable.ic_allergy,
            colorResId = R.color.emergency_orange,
            steps = listOf(
                EmergencyStep(1, "Identify the allergen and remove the person from it.", "ಅಲರ್ಜಿಕ ವಸ್ತು ಗುರುತಿಸಿ ಮತ್ತು ವ್ಯಕ್ತಿಯನ್ನು ಅದರಿಂದ ದೂರ ಸರಿಸಿ."),
                EmergencyStep(2, "For mild reaction: antihistamine tablet if available.", "ಸೌಮ್ಯ ಪ್ರತಿಕ್ರಿಯೆಗೆ: ಲಭ್ಯವಿದ್ದರೆ ಆ್ಯಂಟಿಹಿಸ್ಟಮಿನ್ ಮಾತ್ರೆ."),
                EmergencyStep(3, "For severe (anaphylaxis) - swelling of throat, difficulty breathing: Use EpiPen if available.", "ತೀವ್ರ ಪ್ರತಿಕ್ರಿಯೆ (ಗಂಟಲು ಊತ, ಉಸಿರಾಟ ತೊಂದರೆ): ಎಪಿಪೆನ್ ಇದ್ದರೆ ಬಳಸಿ."),
                EmergencyStep(4, "Call 108 immediately for severe reactions.", "ತೀವ್ರ ಪ್ರತಿಕ್ರಿಯೆಗೆ ತಕ್ಷಣ 108 ಕರೆ ಮಾಡಿ."),
                EmergencyStep(5, "Keep person calm. Lay them down with legs raised unless breathing difficulty.", "ವ್ಯಕ್ತಿಯನ್ನು ಶಾಂತವಾಗಿ ಇರಿಸಿ. ಉಸಿರಾಟ ತೊಂದರೆ ಇಲ್ಲದಿದ್ದರೆ ಕಾಲುಗಳನ್ನು ಮೇಲೆ ಇರಿಸಿ ಮಲಗಿಸಿ.")
            ),
            dosList = listOf("Remove allergen", "Give antihistamine for mild", "Use EpiPen if available", "Call 108 for severe"),
            dontsList = listOf("DO NOT leave alone", "DO NOT give food during reaction", "DO NOT delay for severe reactions")
        ),

        Emergency(
            id = 12,
            titleEn = "Heat Stroke",
            titleKn = "ಶಾಖಾಘಾತ",
            iconResId = R.drawable.ic_heatstroke,
            colorResId = R.color.emergency_orange,
            steps = listOf(
                EmergencyStep(1, "Move person to cool, shaded area immediately.", "ವ್ಯಕ್ತಿಯನ್ನು ತಕ್ಷಣ ತಂಪಾದ, ನೆರಳಿನ ಸ್ಥಳಕ್ಕೆ ಸರಿಸಿ."),
                EmergencyStep(2, "Remove excess clothing. Cool with wet cloths on neck, armpits, groin.", "ಹೆಚ್ಚುವರಿ ಬಟ್ಟೆ ತೆಗೆಯಿರಿ. ಕತ್ತು, ಕಂಕುಳು, ಸೊಂಟದ ಮೇಲೆ ಒದ್ದೆ ಬಟ್ಟೆ ಇಡಿ."),
                EmergencyStep(3, "If conscious and can swallow: give cool water slowly.", "ಪ್ರಜ್ಞೆ ಇದ್ದು ನುಂಗಬಲ್ಲರೆ: ನಿಧಾನವಾಗಿ ತಣ್ಣನೆಯ ನೀರು ನೀಡಿ."),
                EmergencyStep(4, "Fan the person to aid cooling.", "ತಂಪಾಗಿಸಲು ಫ್ಯಾನ್ ಹಾಕಿ."),
                EmergencyStep(5, "Call 108. Heat stroke is life-threatening.", "108 ಕರೆ ಮಾಡಿ. ಶಾಖಾಘಾತ ಜೀವಘಾತಕ.")
            ),
            dosList = listOf("Move to cool place", "Apply wet cloths", "Give water if conscious", "Call 108"),
            dontsList = listOf("DO NOT give if unconscious", "DO NOT use ice bath", "DO NOT leave alone")
        ),

        Emergency(
            id = 13,
            titleEn = "Eye Injury",
            titleKn = "ಕಣ್ಣಿನ ಗಾಯ",
            iconResId = R.drawable.ic_eye,
            colorResId = R.color.emergency_blue,
            steps = listOf(
                EmergencyStep(1, "Do not rub the eye. Rubbing can cause more damage.", "ಕಣ್ಣು ಉಜ್ಜಬೇಡಿ. ಉಜ್ಜುವುದರಿಂದ ಹೆಚ್ಚಿನ ಹಾನಿ ಆಗಬಹುದು."),
                EmergencyStep(2, "For chemical splash: flush with clean water continuously for 15-20 minutes.", "ರಾಸಾಯನಿಕ ಸಿಡಿದರೆ: 15-20 ನಿಮಿಷ ನಿರಂತರ ಶುದ್ಧ ನೀರಿನಿಂದ ತೊಳೆಯಿರಿ."),
                EmergencyStep(3, "For foreign object: try blinking or flushing with water. Do not probe.", "ಕಣ್ಣಿನಲ್ಲಿ ವಸ್ತು: ಮಿಟುಕಿಸಿ ಅಥವಾ ನೀರಿನಿಂದ ತೊಳೆಯಿರಿ. ಕಡ್ಡಿಯಿಂದ ತೆಗೆಯಬೇಡಿ."),
                EmergencyStep(4, "For penetrating injury: Do NOT remove object. Cover both eyes gently.", "ಚುಚ್ಚಿದ ಗಾಯಕ್ಕೆ: ವಸ್ತು ತೆಗೆಯಬೇಡಿ. ಎರಡೂ ಕಣ್ಣು ಮೃದುವಾಗಿ ಮುಚ್ಚಿ."),
                EmergencyStep(5, "Seek immediate eye specialist care.", "ತಕ್ಷಣ ಕಣ್ಣಿನ ತಜ್ಞರ ಆರೈಕೆ ಪಡೆಯಿರಿ.")
            ),
            dosList = listOf("Flush with water for chemicals", "Cover eye for penetrating injury", "Seek medical care quickly"),
            dontsList = listOf("DO NOT rub eye", "DO NOT remove embedded objects", "DO NOT patch tightly")
        ),

        Emergency(
            id = 14,
            titleEn = "Poisoning",
            titleKn = "ವಿಷ ಸೇವನೆ",
            iconResId = R.drawable.ic_poison,
            colorResId = R.color.emergency_purple,
            steps = listOf(
                EmergencyStep(1, "Identify the poison if possible. Keep container/label.", "ಸಾಧ್ಯವಾದರೆ ವಿಷ ಗುರುತಿಸಿ. ಪಾತ್ರೆ/ಲೇಬಲ್ ಇಟ್ಟುಕೊಳ್ಳಿ."),
                EmergencyStep(2, "Call 108 immediately. Describe the substance.", "ತಕ್ಷಣ 108 ಕರೆ ಮಾಡಿ. ವಸ್ತುವಿನ ವಿವರ ತಿಳಿಸಿ."),
                EmergencyStep(3, "Do NOT induce vomiting unless specifically instructed by medical professional.", "ವೈದ್ಯಕೀಯ ತಜ್ಞರ ನಿರ್ದೇಶನ ಇಲ್ಲದೆ ವಾಂತಿ ಮಾಡಿಸಬೇಡಿ."),
                EmergencyStep(4, "If on skin/eyes: flush with large amounts of water.", "ಚರ್ಮ/ಕಣ್ಣಿನ ಮೇಲಿದ್ದರೆ: ಸಾಕಷ್ಟು ನೀರಿನಿಂದ ತೊಳೆಯಿರಿ."),
                EmergencyStep(5, "If unconscious: recovery position and monitor breathing.", "ಪ್ರಜ್ಞಾಹೀನರಾದರೆ: ಚೇತರಿಕೆ ಸ್ಥಾನ ಮತ್ತು ಉಸಿರಾಟ ಗಮನಿಸಿ.")
            ),
            dosList = listOf("Identify the poison", "Call 108 immediately", "Keep container/label", "Flush if on skin"),
            dontsList = listOf("DO NOT induce vomiting without guidance", "DO NOT give anything to eat/drink", "DO NOT leave alone")
        ),

        Emergency(
            id = 15,
            titleEn = "Electric Shock",
            titleKn = "ವಿದ್ಯುತ್ ಆಘಾತ",
            iconResId = R.drawable.ic_electric,
            colorResId = R.color.emergency_yellow,
            steps = listOf(
                EmergencyStep(1, "DO NOT TOUCH the person if still in contact with electricity!", "ವ್ಯಕ್ತಿ ಇನ್ನೂ ವಿದ್ಯುತ್‌ನಲ್ಲಿದ್ದರೆ ಮುಟ್ಟಬೇಡಿ!"),
                EmergencyStep(2, "Switch OFF the power source. Use dry wooden stick to move away if needed.", "ವಿದ್ಯುತ್ ಮೂಲ ಆಫ್ ಮಾಡಿ. ಅಗತ್ಯವಿದ್ದರೆ ಒಣ ಮರದ ಕೋಲಿನಿಂದ ದೂರ ಸರಿಸಿ."),
                EmergencyStep(3, "Call 108 immediately.", "ತಕ್ಷಣ 108 ಕರೆ ಮಾಡಿ."),
                EmergencyStep(4, "Check for breathing and pulse. Start CPR if needed.", "ಉಸಿರಾಟ ಮತ್ತು ನಾಡಿ ಪರೀಕ್ಷಿಸಿ. ಅಗತ್ಯವಿದ್ದರೆ CPR ಪ್ರಾರಂಭಿಸಿ."),
                EmergencyStep(5, "Even if person seems fine, get medical evaluation for internal injuries.", "ವ್ಯಕ್ತಿ ಚೆನ್ನಾಗಿ ಕಂಡರೂ ಆಂತರಿಕ ಗಾಯಕ್ಕೆ ವೈದ್ಯಕೀಯ ತಪಾಸಣೆ ಮಾಡಿಸಿ.")
            ),
            dosList = listOf("Turn off power first", "Use dry non-conducting material", "Call 108", "Perform CPR if needed"),
            dontsList = listOf("DO NOT touch with bare hands if power is on", "DO NOT use wet objects", "DO NOT skip medical check")
        ),

        Emergency(
            id = 16,
            titleEn = "Fainting",
            titleKn = "ಮೂರ್ಛೆ",
            iconResId = R.drawable.ic_faint,
            colorResId = R.color.emergency_yellow,
            steps = listOf(
                EmergencyStep(1, "Help person lie down flat on their back before they fall.", "ವ್ಯಕ್ತಿ ಬೀಳುವ ಮೊದಲು ಬೆನ್ನ ಮೇಲೆ ಮಲಗಿಸಲು ಸಹಾಯ ಮಾಡಿ."),
                EmergencyStep(2, "Raise their legs 30 cm (12 inches) above heart level.", "ಕಾಲುಗಳನ್ನು ಹೃದಯ ಮಟ್ಟಕ್ಕಿಂತ 30 ಸೆಂ ಮೇಲೆ ಎತ್ತಿ."),
                EmergencyStep(3, "Loosen tight clothing. Ensure fresh air.", "ಬಿಗಿಯಾದ ಬಟ್ಟೆ ಸಡಿಲಿಸಿ. ಶುದ್ಧ ಗಾಳಿ ಖಚಿತಪಡಿಸಿ."),
                EmergencyStep(4, "Most people recover in 1-2 minutes. Stay with them.", "ಹೆಚ್ಚಿನ ಜನರು 1-2 ನಿಮಿಷದಲ್ಲಿ ಚೇತರಿಸಿಕೊಳ್ಳುತ್ತಾರೆ. ಅವರ ಜೊತೆ ಇರಿ."),
                EmergencyStep(5, "If no recovery in 2 minutes or repeated fainting: Call 108.", "2 ನಿಮಿಷದಲ್ಲಿ ಚೇತರಿಸಿಕೊಳ್ಳದಿದ್ದರೆ ಅಥವಾ ಮತ್ತೆ ಮತ್ತೆ ಮೂರ್ಛೆ: 108 ಕರೆ ಮಾಡಿ.")
            ),
            dosList = listOf("Lie person flat", "Raise legs", "Loosen clothing", "Give fresh air"),
            dontsList = listOf("DO NOT give water immediately", "DO NOT crowd around them", "DO NOT let them stand up quickly")
        ),

        Emergency(
            id = 17,
            titleEn = "Dog Bite",
            titleKn = "ನಾಯಿ ಕಡಿತ",
            iconResId = R.drawable.ic_dog,
            colorResId = R.color.emergency_orange,
            steps = listOf(
                EmergencyStep(1, "Wash the wound immediately with soap and running water for 15 minutes.", "ಗಾಯವನ್ನು ತಕ್ಷಣ ಸಾಬೂನು ಮತ್ತು ಹರಿಯುವ ನೀರಿನಿಂದ 15 ನಿಮಿಷ ತೊಳೆಯಿರಿ."),
                EmergencyStep(2, "Apply antiseptic solution (Betadine/Dettol) to wound.", "ಗಾಯಕ್ಕೆ ಆ್ಯಂಟಿಸೆಪ್ಟಿಕ್ (ಬೀಟಾಡೀನ್/ಡೆಟ್ಟಾಲ್) ಹಾಕಿ."),
                EmergencyStep(3, "Cover with clean bandage.", "ಸ್ವಚ್ಛ ಬ್ಯಾಂಡೇಜ್‌ನಿಂದ ಮುಚ್ಚಿ."),
                EmergencyStep(4, "Seek medical care IMMEDIATELY for Anti-Rabies Vaccine (ARV).", "ಆ್ಯಂಟಿ-ರೇಬೀಸ್ ಲಸಿಕೆ (ARV) ಗಾಗಿ ತಕ್ಷಣ ವೈದ್ಯಕೀಯ ಆರೈಕೆ ಪಡೆಯಿರಿ."),
                EmergencyStep(5, "Note the dog's vaccination status. Report to local animal control.", "ನಾಯಿಯ ಲಸಿಕೆ ಸ್ಥಿತಿ ಗಮನಿಸಿ. ಸ್ಥಳೀಯ ಪ್ರಾಣಿ ನಿಯಂತ್ರಣಕ್ಕೆ ವರದಿ ಮಾಡಿ.")
            ),
            dosList = listOf("Wash wound 15 min with soap", "Apply antiseptic", "Get ARV vaccine ASAP", "Note dog's vaccine status"),
            dontsList = listOf("DO NOT delay getting ARV", "DO NOT close wound tightly", "DO NOT ignore even small bites")
        ),

        Emergency(
            id = 18,
            titleEn = "Nosebleed",
            titleKn = "ಮೂಗಿನ ರಕ್ತಸ್ರಾವ",
            iconResId = R.drawable.ic_nosebleed,
            colorResId = R.color.emergency_yellow,
            steps = listOf(
                EmergencyStep(1, "Have person sit upright and lean SLIGHTLY FORWARD.", "ವ್ಯಕ್ತಿಯನ್ನು ನೇರ ಕುಳ್ಳಿರಿಸಿ ಮತ್ತು ಸ್ವಲ್ಪ ಮುಂದಕ್ಕೆ ಬಾಗಿಸಿ."),
                EmergencyStep(2, "Pinch the soft part of nose firmly for 10-15 minutes. Breathe through mouth.", "ಮೂಗಿನ ಮೃದು ಭಾಗ 10-15 ನಿಮಿಷ ಬಿಗಿಯಾಗಿ ಒತ್ತಿ. ಬಾಯಿಯಿಂದ ಉಸಿರಾಡಿ."),
                EmergencyStep(3, "Apply cold compress to bridge of nose.", "ಮೂಗಿನ ಮೇಲ್ಭಾಗದ ಮೇಲೆ ತಣ್ಣನೆಯ ಸಂಕೋಚ ಹಾಕಿ."),
                EmergencyStep(4, "After bleeding stops: do not blow nose for several hours.", "ರಕ್ತ ನಿಂತ ನಂತರ: ಕೆಲವು ಗಂಟೆ ಮೂಗು ಉಫ್ ಮಾಡಬೇಡಿ."),
                EmergencyStep(5, "Seek medical help if bleeding > 20 minutes or after head injury.", "ರಕ್ತ 20 ನಿಮಿಷ ಮೀರಿದರೆ ಅಥವಾ ತಲೆ ಗಾಯದ ನಂತರ: ವೈದ್ಯಕೀಯ ಸಹಾಯ ಪಡೆಯಿರಿ.")
            ),
            dosList = listOf("Sit and lean forward", "Pinch nose 10-15 min", "Cold compress on nose bridge", "Breathe through mouth"),
            dontsList = listOf("DO NOT lean backward", "DO NOT stuff with tissue forcefully", "DO NOT blow nose after stopping")
        ),

        Emergency(
            id = 19,
            titleEn = "Asthma Attack",
            titleKn = "ಅಸ್ತಮಾ ದಾಳಿ",
            iconResId = R.drawable.ic_asthma,
            colorResId = R.color.emergency_blue,
            steps = listOf(
                EmergencyStep(1, "Stay calm. Sit upright. Loosen tight clothing.", "ಶಾಂತವಾಗಿ ಇರಿ. ನೇರ ಕುಳ್ಳಿರಿ. ಬಿಗಿಯಾದ ಬಟ್ಟೆ ಸಡಿಲಿಸಿ."),
                EmergencyStep(2, "Use relief inhaler (blue) immediately. Take 1 puff every 30-60 seconds, up to 10 puffs.", "ಪರಿಹಾರ ಇನ್ಹೇಲರ್ (ನೀಲಿ) ತಕ್ಷಣ ಬಳಸಿ. 30-60 ಸೆಕೆಂಡ್‌ಗೊಮ್ಮೆ 1 ಪಫ್, 10 ಪಫ್ ವರೆಗೆ."),
                EmergencyStep(3, "Move to fresh air. Away from triggers (smoke, dust, pollen).", "ಶುದ್ಧ ಗಾಳಿಗೆ ಸರಿಸಿ. ಕಾರಣಗಳಿಂದ (ಹೊಗೆ, ಧೂಳು, ಪರಾಗ) ದೂರ ಇರಿ."),
                EmergencyStep(4, "Sit upright or slightly forward. This helps open airways.", "ನೇರ ಅಥವಾ ಸ್ವಲ್ಪ ಮುಂದಕ್ಕೆ ಕುಳ್ಳಿರಿ. ಇದು ಉಸಿರಾಟ ಮಾರ್ಗ ತೆರೆಯಲು ಸಹಾಯ ಮಾಡುತ್ತದೆ."),
                EmergencyStep(5, "Call 108 if no improvement after 10 puffs or if getting worse.", "10 ಪಫ್ ನಂತರ ಸುಧಾರಣೆ ಇಲ್ಲದಿದ್ದರೆ ಅಥವಾ ಹದಗೆಟ್ಟರೆ 108 ಕರೆ ಮಾಡಿ.")
            ),
            dosList = listOf("Use blue inhaler immediately", "Sit upright", "Fresh air", "Call 108 if severe"),
            dontsList = listOf("DO NOT lie down", "DO NOT leave alone", "DO NOT ignore worsening symptoms")
        ),

        Emergency(
            id = 20,
            titleEn = "Spinal Injury",
            titleKn = "ಬೆನ್ನುಮೂಳೆ ಗಾಯ",
            iconResId = R.drawable.ic_spinal,
            colorResId = R.color.emergency_red,
            steps = listOf(
                EmergencyStep(1, "Do NOT move the person unless in immediate danger. Spinal movement can cause paralysis.", "ತಕ್ಷಣದ ಅಪಾಯ ಇಲ್ಲದಿದ್ದರೆ ವ್ಯಕ್ತಿಯನ್ನು ಸರಿಸಬೇಡಿ. ಬೆನ್ನುಮೂಳೆ ಚಲನೆ ಪಾರ್ಶ್ವವಾಯು ಉಂಟು ಮಾಡಬಹುದು."),
                EmergencyStep(2, "Call 108 immediately.", "ತಕ್ಷಣ 108 ಕರೆ ಮಾಡಿ."),
                EmergencyStep(3, "Keep head and neck in neutral position. Support it gently without moving.", "ತಲೆ ಮತ್ತು ಕತ್ತನ್ನು ತಟಸ್ಥ ಸ್ಥಾನದಲ್ಲಿ ಇರಿಸಿ. ಸರಿಸದೆ ಮೃದುವಾಗಿ ಆಧಾರ ನೀಡಿ."),
                EmergencyStep(4, "Keep the person still and calm. Talk to reassure them.", "ವ್ಯಕ್ತಿಯನ್ನು ಸ್ಥಿರ ಮತ್ತು ಶಾಂತವಾಗಿ ಇರಿಸಿ. ಧೈರ್ಯ ತುಂಬಲು ಮಾತನಾಡಿ."),
                EmergencyStep(5, "Monitor breathing. If CPR needed, do not move person – do in-line stabilization.", "ಉಸಿರಾಟ ಗಮನಿಸಿ. CPR ಅಗತ್ಯವಿದ್ದರೆ, ವ್ಯಕ್ತಿಯನ್ನು ಸರಿಸದೆ ಇನ್-ಲೈನ್ ಸ್ಥಿರೀಕರಣ ಮಾಡಿ.")
            ),
            dosList = listOf("Keep person still", "Call 108 immediately", "Support head/neck in neutral", "Monitor breathing"),
            dontsList = listOf("DO NOT move unless immediate danger", "DO NOT bend neck", "DO NOT remove helmet if worn", "DO NOT give anything by mouth")
        )
    )

    fun getSimulatedHospitals(): List<Hospital> = listOf(
        Hospital("District Government Hospital", "Main Road, Near Bus Stand", "08253-234567", 0.8, true),
        Hospital("Primary Health Centre (PHC)", "Village Road, Opposite Market", "08253-234890", 2.3, false),
        Hospital("Taluk Hospital", "NH-48, Taluk Headquarters", "08253-235000", 5.1, true),
        Hospital("Rural Emergency Clinic", "Gram Panchayat Complex", "08253-235111", 7.4, false),
        Hospital("Community Health Center (CHC)", "State Highway, Near Water Tank", "08253-235222", 12.0, true)
    )
}
