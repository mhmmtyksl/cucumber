Feature: US1007 editor sayfasina farkli kullanicilar ekleyebilmeliyim
@editor
  Scenario Outline: TC11 Editor sayfasina farkli kisiler ekleme
    Given kullanici "editorUrl" sayfasina gider
    Then new butonuna basar
    And editor firstName kutusuna "<firstName>" bilgileri girer
    And editor lastName kutusuna "<lastName>" bilgileri girer
    And editor position kutusuna "<position>" bilgileri girer
    And editor office kutusuna "<office>" bilgileri girer
    And editor extension kutusuna "<extension>" bilgileri girer
    And editor startDate kutusuna "<startDate>" bilgileri girer
    And editor salary kutusuna "<salary>" bilgileri girer
    And Create tusuna basar




    Examples:
    |firstName|lastName|position|office|extension|startDate |salary|
    |Muhammet |Yuksel  |QA      |Berlin|123      |2020-01-01|60000 |
    |Ali      |Can     |Dev     |Konya |456      |2020-02-02|70000 |
    |Veli     |Cano    |Devops  |Kenya |45645    |2020-03-03|50000 |