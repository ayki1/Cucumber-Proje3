Feature: US_009 Anasayfada okul ıdaresiyle iletişime geçebilmek için
  sitede Contact sayfasının olmasını istiyorum

  Scenario: TC_001-Ana sayfa üst barindaki Contact menü başlığına tıklandığında
  'Contact' sayfasına yönlendirdiği doğrulanır.

      Given Browser acilir.
      And  URLe gidilir.
      And Ana sayfada bulunan üst menüde Contact (İletişim) bağlantısına tıklanır
      Then Contact sayfasınin acildigi dogrulanir

  Scenario: TC_002-Contact sayfasındaki Send In Your Query kısmında Name, Emaıl, Subject,
  Description textBox'larının görünür olduğu ve veri girilebildiği doğrulanır.

      Given Contact sayfada "Name (Ad), "Email" (E-posta), "Subject" (Konu) ve "Description" (Açıklama) gibi metin kutularının bulunduğu dogrular
      Then Bu metin kutularına veri girilebildiğini (yazı yazılabildiğini) doğrular

  Scenario: TC_003-Contact sayfasındaki Send In Your Query kısmında Name, Emaıl, Subject,
  Description textBox'larına veri girilip Submit butonuna tıklandığında
  sorgunun gönderildiği doğrulanır.

      Given Contact sayfada her bir metin kutusuna uygun verileri girin (Ad, E-posta, Konu ve Açıklama).
      And Submit (Gönder) butonuna tıklayın.
      When  Sorgunun başarıyla gönderildiğini doğrulayın.


  Scenario: TC_004-Contact sayfasında Our Location, Call Us, Working Hours
  bilgilerinin görünür olduğu doğrulanır.

      And Sayfanın içeriğinde "Our Location (Konumumuz), "Call Us" (Bizi Ara) ve "Working Hours" (Çalışma Saatleri) bilgilerin görünür olduğunu doğrulayın.
      Then Browser sayfa kapatilir