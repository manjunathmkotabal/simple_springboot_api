# simple_springboot_api

 the payload for creating POST load: 
 ```
{
	"loadingPoint": "banglore",
	"unloadingPoint": "jaipur",
	"productType": "footware",
	"truckType": "canter",
	"noOfTrucks": "5",
	"weight": "100",
    "comment":"hello this is second",
    "shipperId": "1238",
	"loadDate" : "20-06-2023"
	
}
```
the payload for PUT load: 

```
{
	"loadingPoint": "alwar",
	"unloadingPoint": "jaipur",
	"productType": "chemicals",
	"truckType": "canter",
	"noOfTrucks": "1",
	"weight": "100",
    "comment": "updated",
    "loadDate" : "21-06-2023"	
}
```
the database name :
```
liveasy
```

preview: 
```
1. post "/load"
```
![image](https://github.com/manjunathmkotabal/simple_springboot_api/assets/94886901/441da38b-124b-4b67-a338-387d0b3cb874)
```
 2. GET “/load”
```
 ![image](https://github.com/manjunathmkotabal/simple_springboot_api/assets/94886901/b41a8239-2880-4c02-b7c4-5c868b9748d7)
 ```
3.GET “load/{loadId}”
```

![image](https://github.com/manjunathmkotabal/simple_springboot_api/assets/94886901/b754b661-12b9-418a-9c55-c4562ad074a5)
```
4.PUT “load/{loadId}”
```

![image](https://github.com/manjunathmkotabal/simple_springboot_api/assets/94886901/21b30919-8420-4c61-ba71-f9ae855c7ace)
```
5.DELETE “load/{loadId}”
```

![image](https://github.com/manjunathmkotabal/simple_springboot_api/assets/94886901/76decf58-15fa-437d-b3aa-eb17f930025e)


