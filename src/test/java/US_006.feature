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
    And  kullanıcıSocial Sciences DETAILS Butonunu görür
    And kullanıcı History DETAILS Butonunu görür
    And kullanıcı Arts and Music DETAILS Butonunu görür
    And kullanıcıHealth and Exercise Sciences DETAILS Butonunu görür
    And kullanıcı Foreign Language DETAILS Butonunu görür
    Then kullanıcı Computer Science DETAILS Butonunu görür

  Scenario: 4-Course details butonuna
    Given  Course detail  görür
    And kullanıcı  başlığını görür
    And Sayfa kapanir