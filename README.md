# NNPRO - externí api - číselníky
Repozitář externího API pro číselníky aplikace ČD

## Popis rozhraní
Celá aplikace implementuje kompletní REST rozhraní k poskytování číselníku pro jiné aplikace.

##### Požadavek na server
Data jsou poskytována metodou GET, stačí tedy zadat adresu, čímž dojde na serveru k vygenerováné JSON ospovědi.

##### Dostupná API
- [Tratě](https://nnpro-exp-api.herokuapp.com/serie/railroads)
- [Typ zásahu](https://nnpro-exp-api.herokuapp.com/serie/type-of-intervention)
- [Napadený subjekt](https://nnpro-exp-api.herokuapp.com/serie/affected-entity)

#### Struktura odpovědi
Každá odpověď od serveru je zabalena do struktury popisující, v jakém stavu byl požadavek na serveru vyřízen. 
* `status` - HTTP stavový kód pod kterým server odpověď vyřídil
* `status_key` - Textový řetězec identifikující odpověď druh vrácených dat 
* `data` - Strukturovaná data vrácena serverem (mohou být NULL)

```json
{
  "status":200,
  "status_key":"OK",
  "data":[
    {
      "id":1,
      "name":"Arriva"
    },
    {
      "id":2,
      "name":"AWT"
    },
    {
      "id":3,
      "name":"ČD"
    },
    {
      "id":4,
      "name":"ČD Cargo"
    },
    {
      "id":5,
      "name":"LeoExpress"
    },
    {
      "id":6,
      "name":"RegioJet"
    },
    {
      "id":7,
      "name":"SŽ"
    },
    {
      "id":8,
      "name":"Jiný"
    }
  ]
}
```
Zde v příkladu je vidět odpověď serveru, který vrací názvy napadených subjektů.


### API dokumentace
Celé REST API, komunikační rozhraní, je přehledně [zdokumentováno](https://nnpro-exp-api.herokuapp.com/swagger-ui.html).


<hr>
<strong>2020 - TopTeam</strong><br />
