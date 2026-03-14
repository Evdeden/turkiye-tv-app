# Türkiye TV - Android TV Uygulaması Kullanım Kılavuzu

Türkiye TV, Android TV ve TV Box cihazları için özel olarak tasarlanmış, modern ve kullanıcı dostu bir canlı TV izleme uygulamasıdır.

## Özellikler
- **Modern Arayüz:** Koyu tema ve premium görünüm.
- **Kumanda Uyumluluğu:** Tamamen uzaktan kumanda ile kontrol edilebilir yapı.
- **Kategori Bazlı Listeleme:** Ulusal, Haber, Spor, Çocuk, Belgesel ve daha fazlası.
- **Güçlü Oynatıcı:** ExoPlayer altyapısı ile kesintisiz HLS/m3u8 yayını.
- **Dinamik Liste:** Uzaktan güncellenebilir kanal listesi desteği.
- **Yasal İçerik:** Sadece açık ve ücretsiz yayınları destekler.

## Kurulum
1. `TurkiyeTV.apk` dosyasını bir USB belleğe kopyalayın.
2. USB belleği Android TV veya TV Box cihazınıza takın.
3. Bir dosya yöneticisi kullanarak APK dosyasını bulun ve yükleyin.
4. "Bilinmeyen kaynaklardan yükleme" izni istenirse onay verin.

## Kullanım
- **Gezinme:** Kumandanın yön tuşlarını (Yukarı, Aşağı, Sağ, Sol) kullanarak kategoriler ve kanallar arasında gezinebilirsiniz.
- **Seçim:** Bir kanalı açmak için kumandanın "OK" veya "Enter" tuşuna basın.
- **Geri Dönme:** Oynatıcıdan çıkmak veya bir önceki menüye dönmek için "Back" (Geri) tuşunu kullanın.

## Kanal Listesi Güncelleme
Uygulama, açılışta `assets/channels.json` dosyasındaki veya tanımlanan uzak URL'deki listeyi otomatik olarak çeker. Yeni kanal eklemek için JSON formatına uygun ekleme yapılması yeterlidir.

## Teknik Destek
Bu uygulama Android 7.0 ve üzeri tüm cihazlarda stabil çalışacak şekilde optimize edilmiştir. Düşük internet hızlarında buffer ayarları otomatik olarak optimize edilir.
