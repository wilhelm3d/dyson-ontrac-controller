# Dyson OnTrac Controller (Nothing Edition)

A minimalist, brutalist Android application inspired by Nothing OS, built specifically to control and unlock the full potential of **Dyson OnTrac** (N571H) headphones via direct Bluetooth Low Energy (BLE) GATT commands.

![UI Design](https://img.shields.io/badge/UI-Nothing_Aesthetics-black?style=flat-square&logo=android) 
![Architecture](https://img.shields.io/badge/Architecture-Jetpack_Compose-blue?style=flat-square) 
![Protocol](https://img.shields.io/badge/Protocol-BLE_GATT-red?style=flat-square)

## Features

- **Direct GATT Communication**: Bypasses the heavy official application and connects directly over BLE, issuing sub-millisecond binary arrays to the hardware DSP.
- **Nothing-Style Brutalist Interface**: Deep blacks (`#000000`), stark whites (`#FFFFFF`), raw monospaced fonts, and the signature Nothing Red accent (`#EA3323`). Custom touch-reactive visual canvas sliders.
- **Instant ANC Controls**: Quick toggle array for `ISOLATION` (Full ANC), `TRANSPARENCY`, and `OFF`.
- **Hybrid 6-to-5 Band Custom Equalizer**: Dyson OnTrac hardware only natively supports a 5-band DSP profile (`frequency1` to `frequency5`). This app features a pre-calculated mapping to achieve a highly-requested 6-band audiophile tuning profile, smoothing out the notorious 6.3–8 kHz sibilance peak while maintaining deep micro-suede sub-bass extension.

### Audiophile Tuning Profile Included:
*   **Bass (~65 Hz):** +3 dB *(Sub-bass compensation)*
*   **Mid-Bass (~240 Hz):** -2 dB *(Cleans lower-midrange bloom)*
*   **Mid (~1.8 kHz):** +1 dB *(Vocal presence)*
*   **Mid-Treble (~3.5 kHz):** -2 dB *(Smooths bite)*
*   **Treble (~8kHz+):** -2 dB *(Hybrid band mapping to tame sibilance while retaining 12kHz+ air)*

## Reverse Engineering Notes

Dyson audio devices communicate using a proprietary 128-bit Base UUID configuration:
*   **Audio Service UUID:** `2DD10020-1C37-452D-8979-D1B4A787D0A4`
*   **State Command UUID:** `2DD10021-1C37-452D-8979-D1B4A787D0A4`
*   **Custom EQ Target UUID:** `2DD12007-1C37-452D-8979-D1B4A787D0A4`

Commands rely on a simple structural array header `[Command_ID, 0x40, Arg_Value]`. For instance, ANC Isolation is dispatched as `[0x0A, 0x40, 0x00]`.

*(Note: Ensure your OnTrac is initially paired to the Android OS Bluetooth Manager so standard BLE authorization keys are negotiated).*

## Build Instructions

Built with Android Studio and Kotlin 2.0 / Jetpack Compose.

```bash
# Clone the repository
git clone https://github.com/yourusername/dyson-ontrac-controller.git

# Navigate into the directory
cd dyson-ontrac-controller

# Assemble the debug APK using the Gradle Wrapper
./gradlew assembleDebug

# Install via ADB
adb install app/build/outputs/apk/debug/app-debug.apk
```

## Contributing
Pull requests are welcome. For major changes (like discovering the command ID mapping for the hidden volume-limiter functionality), please open an issue first to discuss what you would like to change.

## License
MIT
