# Pratham Chikitse – ಪ್ರಥಮ ಚಿಕಿತ್ಸೆ
**Android First-Aid Emergency Offline Guide**

MindMatrix VTU Internship Program | Project Title: 54

---

## 📱 App Overview

Pratham Chikitse is a life-saving first-aid manual app for Android. It provides step-by-step guidance for **20 common medical emergencies** in **Kannada and English**, works completely **offline**, and features **Text-to-Speech in Kannada**.

---

## ✅ Features Implemented

| Feature | Status |
|---|---|
| 20 Emergency Tiles (Large, clear buttons) | ✅ |
| Step-by-Step Instructions with ViewPager2 | ✅ |
| Do's and Don'ts for each emergency | ✅ |
| Hospital Finder (Simulated/Offline) | ✅ |
| Audio Mode (TTS in Kannada/English) | ✅ |
| Works Offline | ✅ |
| Bilingual (Kannada + English) | ✅ |
| Search/Filter Emergencies | ✅ |
| Emergency Call (108) | ✅ |
| Loads main content < 500ms | ✅ |

---

## 🏥 Emergency Conditions Covered (20)

1. Snake Bite | ಹಾವು ಕಡಿತ
2. Heart Attack | ಹೃದಯಾಘಾತ
3. Choking | ಗಂಟಲು ಅಡಚಣೆ
4. Severe Burns | ತೀವ್ರ ಸುಟ್ಟ ಗಾಯ
5. Fracture / Broken Bone | ಮೂಳೆ ಮುರಿತ
6. Severe Bleeding | ತೀವ್ರ ರಕ್ತಸ್ರಾವ
7. Drowning | ಮುಳುಗಡೆ
8. Stroke | ಸ್ಟ್ರೋಕ್
9. Seizure / Epilepsy | ಅಪಸ್ಮಾರ
10. Diabetic Emergency | ಮಧುಮೇಹ ತುರ್ತು
11. Allergic Reaction | ಅಲರ್ಜಿ ಪ್ರತಿಕ್ರಿಯೆ
12. Heat Stroke | ಶಾಖಾಘಾತ
13. Eye Injury | ಕಣ್ಣಿನ ಗಾಯ
14. Poisoning | ವಿಷ ಸೇವನೆ
15. Electric Shock | ವಿದ್ಯುತ್ ಆಘಾತ
16. Fainting | ಮೂರ್ಛೆ
17. Dog Bite | ನಾಯಿ ಕಡಿತ
18. Nosebleed | ಮೂಗಿನ ರಕ್ತಸ್ರಾವ
19. Asthma Attack | ಅಸ್ತಮಾ ದಾಳಿ
20. Spinal Injury | ಬೆನ್ನುಮೂಳೆ ಗಾಯ

---

## 🛠️ Setup Instructions

### Prerequisites
- Android Studio Hedgehog (2023.1.1) or newer
- JDK 17+
- Android SDK 34
- Kotlin 1.9+

### Steps to Run
1. Open Android Studio
2. Click **File → Open** and select the `PrathamChikitse` folder
3. Wait for Gradle sync to complete
4. Connect an Android device (API 24+) or start an emulator
5. Click **Run ▶**

### First Run
- The app will request location permission (for hospital finder)
- Ensure Kannada language pack is installed on device for best TTS

---

## 🏗️ Project Structure

```
app/src/main/
├── java/com/prathamchikitse/
│   ├── SplashActivity.kt          ← Splash screen
│   ├── MainActivity.kt            ← Home + Emergency grid
│   ├── EmergencyDetailActivity.kt ← Step-by-step viewer + TTS
│   ├── HospitalFinderActivity.kt  ← Nearest hospitals list
│   ├── AboutActivity.kt           ← App info
│   ├── adapter/
│   │   ├── EmergencyAdapter.kt    ← RecyclerView grid adapter
│   │   ├── StepPagerAdapter.kt    ← ViewPager2 adapter
│   │   └── HospitalAdapter.kt     ← Hospital list adapter
│   ├── data/
│   │   └── EmergencyRepository.kt ← All 20 emergencies + hospitals
│   └── model/
│       └── Models.kt              ← Data classes
└── res/
    ├── layout/                    ← All XML layouts
    ├── drawable/                  ← Icons + backgrounds
    ├── values/                    ← Colors, strings, themes
    └── menu/                      ← Menu XML
```

---

## 🎯 Success Criteria (Met)

- ✅ App loads main content in < 500ms (all data is local)
- ✅ Step-by-step instructions are clear and readable under stress
- ✅ Audio Mode toggleable with a single large button

---

## 📞 Emergency Numbers

| Service | Number |
|---|---|
| Ambulance | 108 |
| Police | 100 |
| Fire | 101 |
| Women Helpline | 1091 |

---

## 🌟 Impact Goals

- **Public Safety** – Reducing preventable deaths through basic medical knowledge
- **Rural Resilience** – Empowering villagers to handle emergencies before ambulance arrives
- **Language Equity** – Making medical life-saving info available in the mother tongue (Kannada)
