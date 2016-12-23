# Laboratorium nr 9

Korzystanie z danych udostępnianych w webowym API.

1. Zapoznaj się z API serwisu sejmometr https://mojepanstwo.pl/api/sejmometr
2. Opracuj system, który na podstawie argumentów linii poleceń wyświetla następujące informacje (dla określonej kadencji
   sejmu lub określonego roku):
    * suma wydatków posła/posłanki o określonym imieniu i nazwisku. Przykłady:
        * `select "Jarosław Kaczyński" spendings in 2013`
        * `select "Ewa Żmuda-Trzebiatowska" spendings in 2013`
        * `select "Armand Kamil Ryfiński" spendings in 2013`
    * wysokości wydatków na 'drobne naprawy i remonty biura poselskiego' określonego posła/posłanki. Przykłady:
        * `select "Jarosław Kaczyński" office spendings in 2013`
        * `select "Ewa Żmuda-Trzebiatowska" spendings in 2013`
    * średniej wartości sumy wydatków wszystkich posłów. Przykłady:
        * `select avg spendings in 2013`
    * posła/posłanki, który wykonał najwięcej podróży zagranicznych. Przykłady:
        * `select representative with max trips term 7`
        * `select representative max trips term 7`
        * `select rep max trips term 7`
    * posła/posłanki, który najdłużej przebywał za granicą. Przykłady:
        * `select representative with the longest trips term 7`
        * `select representative longest trips term 7`
        * `select rep longest trips term 7`
    * posła/posłanki, który odbył najdroższą podróż zagraniczną. Przykłady:
        * `select representative with the most expensive trip term 7`
        * `select representative mexpensive trip term 7`
        * `select rep mexpensive trip term 7`
    * listę wszystkich posłów, którzy odwiedzili Włochy. Przykłady:
        * `select representatives who visited Italy term 7`
        * `select representatives Italy term 7`
        * `select rep Italy term 7`
        * `select rep IT term 7`
3. Program powinien obsługiwać błędy oraz zawierać testy weryfikujące poprawność jego działania.
4. Program wykorzystuje pliki lokalne umieszczone w folderze `jsonLocalFiles/`. Polecenie do aktualizacji plików lokalnych: 
    * `update sejmometr term 7` - aktualizuje dane wszystkich posłów 7. kadencji 
    * `update sejmometr term 8` - aktualizuje dane wszystkich posłów 8. kadencji
    * `update representative "Jarosław Kaczyński"` - aktualizuje dane posła o określonym imieniu i nazwisku