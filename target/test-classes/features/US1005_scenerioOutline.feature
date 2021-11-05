@Paralel2
Feature: US1005 amazonda liste ile arama

  Scenario Outline: TC09 amazonda verilen bir listeyi aratip var olduklarini test ediniz
    Given kullanici "amazonUrl" sayfasina gider
    Then "<arananUrun>" icin arama yapar
    And sonuc sayisini yazdirir
    And sonucun "<arananUrun>" icerdigini test eder
    Then sayfayi kapatir




    Examples:
  |arananUrun|
  |nutella   |
  |java      |
  |ipod      |
  |armut     |
  |Apple     |

    # scenerioOutline ve Examples birlikte calisir. examples yazmazsak altini cizer.
  # bir liste icin arama yapacagimiz icin arananUrun parametresini <> arasina yazdik list oldugu icin

  # once | |  arasina ustteki variable i yazariz
  # altina ise | | arasinda buna atama yapmak istediklerimizi yazariz
  # bu islemin sonucunda 5 test pass olur cunku bir test calistiriyoruiz ama herbiri icin ayri ayri calisiyor