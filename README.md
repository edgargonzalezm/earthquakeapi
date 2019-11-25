# earthquakeapi

## Servicio que obtiene token
URL Post: /authenticate
* ejemplo - 
* curl -X POST "http://localhost:8080/authenticate" -H  "accept: */*" -H  "Content-Type: application/json" -d "{  \"password\": \"password\",  \"username\": \"usuario registrado\"}"

## Servicio que obtiene los eventos por rango de fecha 
URL GET: /sismos/fechas
* ejemplo - http://localhost:8080/sismos/fechas?endtDate=2019-11-30&startDate=2019-11-1

## Servicio que obtiene los eventos por rango de magnitudes
URL GET: /sismos/magnitudes
* ejemplo - http://localhost:8080/sismos/magnitudes?maxmagnitude=6.5&minmagnitude=5.1

## Servicio que obtiene los eventos por pais
URL GET: /sismos/pais
* ejemplo - http://localhost:8080/sismos/pais?pais=Chile

## Servicio que obtiene los eventos por pais
URL GET: /sismos/pais
* ejemplo - http://localhost:8080/sismos/pais?pais=Chile

## Servicio que obtiene los eventos por rango fecha y 2 paises
URL GET: /sismos/paisrangofecha
* ejemplo - http://localhost:8080/sismos/paisrangofecha?endtDate=2019-11-3&pais1=Chile&pais2=Peru&startDate=2019-11-1

## Servicio que obtiene los eventos por 2 rangos de fecha 
URL GET: /sismos/rangofecha
* ejemplo - http://localhost:8080/sismos/rangofecha?endtDate1=2019-11-2&endtDate2=2019-9-25&startDate1=2019-11-1&startDate2=2019-9-24
