## myday

**Build & Run**

```
./gradlew clean  
./gradlew build  
./gradlew bootRun  
```

**Example**

```
request: curl http://localhost:8080?year=2019  
response: {"errorCode":200, "dataMessage":"13/09/2019"}
```
```
request: curl localhost:8080?year=2020  
response: {"errorCode":200, "dataMessage":"12/09/2019"}
```

```
request: curl localhost:8080?year=-1  
response: {"errorCode":200, "dataMessage":"Input error"}
```
