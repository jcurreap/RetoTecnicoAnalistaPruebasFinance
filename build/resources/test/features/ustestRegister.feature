#Autor:JohanaC

@stories

Feature: Utest Register

  Purpose of creating a new user

  @scenario1

  Scenario: Register new user

    Given than JP wants to use the utest page

    When JP registers your data
      | strname         | strlasname   | stremail               | month | day | year | strlanguage | language | strpstal | strcity | strcountry | strdevice | strmodel | stroperating | strpassword           |
      | Santiago Prueba | Arias Prueba | sajkn90788776@gamil.com | June  | 22  | 2002 | Spanish     | Spanish  | 110141   | Cali    | Colombia   | Xiaomi    | Redmi 8  | Android 12   | A1iuy32rtr37b8b91o20. |

    Then JP will have a new user and will be able to enjoy the services of utest
      | question                                                                |
      | Welcome to the world's largest community of freelance software testers! |