# Laboratorium nr 9

Korzystanie z danych udostępnianych w webowym API.

1. Zapoznaj się z API serwisu sejmometr https://mojepanstwo.pl/api/sejmometr
2. Opracuj system, który na podstawie argumentów linii poleceń wyświetla następujące informacje (dla określonej kadencji
   sejmu):
    * suma wydatków posła/posłanki o określonym imieniu i nazwisku. Przykłady:
        * `select „Jarosław Kaczyński” spendings in 2013`
        * `select „Piotr Krzysztof Ćwik” spendings in 2013`
    * wysokości wydatków na 'drobne naprawy i remonty biura poselskiego' określonego posła/posłanki. Przykłady:
        * `select „Jarosław Kaczyński” office spendings in 2013`
        * `select „Piotr Krzysztof Ćwik” office spendings in 2013`
    * średniej wartości sumy wydatków wszystkich posłów. Przykłady:
        * `select avg spendings in 2013`
    * posła/posłanki, który wykonał najwięcej podróży zagranicznych. Przykłady:
        * `select representative with max trips`
        * `select representative max trips`
        * `select rep max trips`
    * posła/posłanki, który najdłużej przebywał za granicą. Przykłady:
        * `select representative with the longest trip`
        * `select representative longest trip`
        * `slect rep longest trip`
    * posła/posłanki, który odbył najdroższą podróż zagraniczną. Przykłady:
        * `select representative with the most expensive trip`
        * `select representative mexpensive trip`
        * `select rep mexpensive trip`
    * listę wszystkich posłów, którzy odwiedzili Włochy. Przykłady:
        * `select representatives who visited Italy`
        * `select representatives Italy`
        * `select rep Italy`
        * `select rep IT`
3. Program powinien obsługiwać błędy oraz zawierać testy weryfikujące poprawność jego działania.