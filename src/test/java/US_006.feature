Feature: US_006 Course sayfasına yönlendirdiği doğrulanır

  Scenario: 1-Ana sayfa üst barindaki Course menü başlığına tıklandığında Course sayfasına yönlendirdiği doğrulanır

    Given Browser acilir.
    And  URLe gidilir.
    When Ana sayfadaki üst menüde Course başlığına tıklanır
    Then Course sayfasına yönlendirildiği doğrulanır


  Scenario: 2-Course sayfasında  English and Literature, Mathematics, Sciences, Social Sciences, History,Arts and Music, Health and Exercise Sciences,  Foreign Language,  Computer Sciencecourse başlıklarının görünür olduğu doğrulanır

    Given kullanıcı Course sayfasinda  English and Literature başlığını görür
    And kullanıcı Mathematics başlığını görür
    And kullanıcı Sciences başlığını görür
    And kullanıcı Social Sciences başlığını görür
    And kullanıcı History başlığını görür
    And kullanıcı Arts and Music başlığını görür
    And kullanıcı Health and Exercise Sciences başlığını görür
    And kullanıcı Foreign Language başlığını görür
    Then kullanıcı Computer Science başlığını görür

  Scenario: 3-Course sayfasındaki başlıkların altında ilgili kursun detaylı bilgisine erişim için details butonlarının olduğu doğrulanır.

    Given kullanıcı Course sayfasinda  English and Literature DETAILS Butonunu görür
    And kullanıcı Mathematics DETAILS Butonunu görür
    And kullanıcı Sciences DETAILS Butonunu görür
    And  kullanıcı Social Sciences DETAILS Butonunu görür
    And kullanıcı History DETAILS Butonunu görür
    And kullanıcı Arts and Music DETAILS Butonunu görür
    And kullanıcı Health and Exercise Sciences DETAILS Butonunu görür
    And kullanıcı Foreign Language DETAILS Butonunu görür
    Then kullanıcı Computer Science DETAILS Butonunu görür

  Scenario: 4-Course details butonuna tıklanınca ilgili kursun
  detay sayfasına erişilebildiği doğrulanır.

    Given kullanıcı Course sayfasinda English and Literature detay sayfasına erişilebildiği doğrulanır.
    And kullanıcı Mathematics detay sayfasına erişilebildiği doğrulanır.
    And kullanıcı Sciences detay sayfasına erişilebildiği doğrulanır.
    And  kullanıcı Social Sciences detay sayfasına erişilebildiği doğrulanır.
    And kullanıcı History detay sayfasına erişilebildiği doğrulanır.
    And kullanıcı Arts and Music detay sayfasına erişilebildiği doğrulanır.
    And kullanıcı Health and Exercise Sciences detay sayfasına erişilebildiği doğrulanır.
    And kullanıcı Foreign Language detay sayfasına erişilebildiği doğrulanır.
    Then kullanıcı Computer Science detay sayfasına erişilebildiği doğrulanır.
    And Browser Sayfa kapanir