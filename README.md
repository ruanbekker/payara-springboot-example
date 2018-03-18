# payara-springboot-example
Spring Boot with Payara Example including the Metrics Endpoint

## Build the WAR File

```
$ mvn clean package
[INFO] Building war: /home/target/payara-micro-with-spring-boot-rest-1.0.war
```

## Deploy

Deploy to Glassfish/Payara, then test the Metrics Endpoint

## Test

```
$ curl -s http://domain.com:8080/payara-micro-with-spring-boot-rest-1.0/metrics | python -m json.tool
{
    "classes": 17874,
    "classes.loaded": 19988,
    "classes.unloaded": 2114,
    "counter.status.200.metrics": 2,
    "counter.status.404.error": 1,
    "gauge.response.error": 173.0,
    "gauge.response.metrics": 8.0,
    "gc.ps_marksweep.count": 2299,
    "gc.ps_marksweep.time": 1248371,
    "gc.ps_scavenge.count": 41760,
    "gc.ps_scavenge.time": 1015382,
    "heap": 486400,
    "heap.committed": 486400,
    "heap.init": 32768,
    "heap.used": 205084,
    "instance.uptime": 449489,
    "mem": 486400,
    "mem.free": 281317,
    "processors": 2,
    "systemload.average": 1.22,
    "threads": 75,
    "threads.daemon": 71,
    "threads.peak": 91,
    "uptime": 162652296
}
```

To get all the endpoints:

```
$ curl http://domain.com:8080/payara-micro-with-spring-boot-rest-1.0/mappings | python -m json.tool
```

Thanks to [Payara Team](http://blog.payara.fish/creating-rest-web-services-with-spring-boot-hosted-on-payara-micro)
