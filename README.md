# Türkiye TV - Android TV Project

Bu proje, Android TV ve TV Box cihazları için geliştirilmiş bir canlı TV uygulamasıdır.

## Proje Yapısı
- **Dil:** Kotlin
- **Mimari:** MVVM (Model-View-ViewModel)
- **UI Framework:** Android Leanback Library
- **Video Oynatıcı:** ExoPlayer (HLS, m3u8, MP4, DASH desteği)
- **Görüntü Yükleme:** Glide
- **Ağ İşlemleri:** Retrofit & Gson

## Android Studio ile Açma
1. Android Studio'yu açın.
2. "Open an Existing Project" seçeneğini seçin.
3. `TurkiyeTV` klasörünü seçin ve projenin senkronize olmasını bekleyin.
4. Gerekli SDK ve Gradle bağımlılıkları otomatik olarak indirilecektir.

## APK Oluşturma
1. Üst menüden `Build` -> `Build Bundle(s) / APK(s)` -> `Build APK(s)` yolunu izleyin.
2. İşlem tamamlandığında `app/build/outputs/apk/debug/` klasöründe APK dosyasını bulabilirsiniz.
3. İmzalı (Release) APK için `Build` -> `Generate Signed Bundle / APK` seçeneğini kullanın.

## Özellikler
- **Uzaktan Kumanda Desteği:** Tam D-Pad desteği ve odaklanma efektleri.
- **Dinamik Kanal Yönetimi:** JSON tabanlı uzaktan güncellenebilir liste.
- **Hızlı Kanal Geçişi:** ExoPlayer ile optimize edilmiş yayın açılış hızı.
- **Koyu Tema:** Göz yormayan, premium TV arayüzü.

## Lisans ve Kullanım
Bu uygulama yasal yayınları desteklemek amacıyla geliştirilmiştir. Korsan veya lisanssız yayın içeriği barındırmaz.
