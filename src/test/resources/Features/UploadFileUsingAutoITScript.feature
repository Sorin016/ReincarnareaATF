Feature: Upload a txt file using non web tool AutoIT
 @UI
  Scenario: Insert file
    Given User click Загрузить файлы
    Then file is uploaded with success
