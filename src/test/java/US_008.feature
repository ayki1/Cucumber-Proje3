Feature: US_008 Anasayfada Acheivements text Başlığı altında Acheivements bölümü görüntülenmeli.

  Scenario: 1-Ana sayfada Acheivements bölümü görüntülenmeli.

    Given Browser acilir.
    And  URLe gidilir.
    Then Ana sayfadaki Acheivements bölümü görüntülendigi doğrulanır

  Scenario: 2-Achievements bölümüne gidildiğinde, aşağıdaki boardlar görüntülenir:
    Given GRADUATES sayisi görüntülenir
    And CERTIFIED TEACHERS sayisi görüntülenir
    And STUDENT CAMPUSES sayisi görüntülenir
    And STUDENTS sayisi görüntülenir
    Then Browser sayfa kapanir