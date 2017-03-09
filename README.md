# Data of members of the Polish Government 

Package provides access to data and basic data analysis of members of the Polish Government using Sejmometr WebAPI: https://mojepanstwo.pl/api/sejmometr

Program displays information based on the command line arguments. 

## List of all available options:
* sum of the spending of representative with the specified name. Examples:
    * `select "Jarosław Kaczyński" spendings in 2013`
    * `select "Ewa Żmuda-Trzebiatowska" spendings in 2013`
    * `select "Armand Kamil Ryfiński" spendings in 2013`
* sum of the office spending of representative with the specified name. Examples:
    * `select "Jarosław Kaczyński" office spendings in 2013`
    * `select "Ewa Żmuda-Trzebiatowska" office spendings in 2013`
* average sum of the spending of all representatives in the specified year. Examples:
    * `select avg spendings in 2013`
* name of the representative with the biggest number of trips abroad in the specified term. Examples:
    * `select representative with max trips term 7`
    * `select representative max trips term 7`
    * `select rep max trips term 7`
* name of the representative who was abroad for the longest time in the specified term. Examples:
    * `select representative with the longest trips term 7`
    * `select representative longest trips term 7`
    * `select rep longest trips term 7`
* name of the representative who took the most expensive trip abroad in the specified term. Examples:
    * `select representative with the most expensive trip term 7`
    * `select representative mexpensive trip term 7`
    * `select rep mexpensive trip term 7`
* list of all representatives who visited the specified country in the specified term. Examples:
    * `select representatives who visited Italy term 7`
    * `select representatives visited Italy term 7`
    * `select rep visited Italy term 7`
    * `select rep visited IT term 7`

**Note that** program uses cached local files for better performance. Files are located in `jsonLocalFiles/` folder and can be updated with the following commands:
* `update sejmometr term 7` - updates data of all 7th term representatives
* `update sejmometr term 8` - updates data of all 8th term representatives
* `update representative "Jarosław Kaczyński"` - updates data of the representative with specified name
