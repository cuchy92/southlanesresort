# PV207 project - South lane hotel resort #

PV207 project realized by Martin Cuchran, Marek Osvald, Martin Penaz, Jakub Smolar in Spring 2017 at Masaryk University. Project documentation is available on https://docs.google.com/document/d/1iisWv6UOa1oydR5yQ41eknL7N7KaxKGeptho-L1KZqk 

## Demo ##

> http://jbpm.ics.muni.cz:8080 (Available from MU network - 147.251.0.0/16)

### Users and passwords ###

> customer - customer.1

> manager - manager.1

> director - director.1

> employee - employee.1

## Prerequisites ##

* jBPM 6
* OS with working mail relay
* Java
* Service - https://github.com/jsmolar/spring-boot-rest-service
 
## Installation ##

> Download jBPM - https://drive.google.com/file/d/0B9FEDpx-WZeodjkyWW0teHMtSWM/view?usp=sharing

> Run - ./business-central/bin/standalone.sh -b 0.0.0.0

> Clone this repository to Authoring -> Project Authoring -> Administration -> Repositories -> Clone repository 

## Configuration ##

> ./busines-central/bin/add-user.sh customer

> ./busines-central/bin/add-user.sh director

> ./busines-central/bin/add-user.sh manager

> ./busines-central/bin/add-user.sh employee

## Process dependencies ##

### New Reservation ###
#### Type of rooms ####
* “2-bed” - RESTful service returns room not available.
* “3-bed” - RESTful service returns room available.
 
#### Number of rooms ####
* “<1,10>” – Auto approval
* “<11,20>” – Hotel manager approval required
* “<21,9999>” – Hotel director approval required
 
Other values have no impact on process.

### Payment subprocess ### 
#### CVV ####
* “111” – Transaction accepted
* “000” – Transaction denied
 
Other values have no impact on process
 
 
 
### Order from contractors ###
* Service – pizza (unlimited volume)
* Service – party hat (max 1000)
* Service – beer (max. 500)
 
When maximum value is exceeded, then RESTful service returns: Fail: out of stock.


